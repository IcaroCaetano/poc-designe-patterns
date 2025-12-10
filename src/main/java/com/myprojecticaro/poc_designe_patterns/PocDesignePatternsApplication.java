package com.myprojecticaro.poc_designe_patterns;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.myprojecticaro.poc_designe_patterns.structural.*;
import com.myprojecticaro.poc_designe_patterns.Behavioral.*;
import com.myprojecticaro.poc_designe_patterns.creational.*;


/**
 * Main entry point for the Design Patterns Proof of Concept (POC) application.
 * <p>
 * This Spring Boot application serves as a playground for implementing
 * and experimenting with various software design patterns in Java,
 * such as Decorator, Strategy, Factory, Singleton, and more.
 * </p>
 *
 * <p>
 * The application context is initialized through Spring Boot's auto-configuration,
 * enabling the creation of REST endpoints, service components, and modular architecture
 * to demonstrate the patterns in real scenarios.
 * </p>
 *
 * <p><b>Usage:</b></p>
 * <pre>
 *     Run the application using:
 *     mvn spring-boot:run
 *
 *     or execute directly via:
 *     java -jar poc-designe-patterns.jar
 * </pre>
 *
 * <p>
 * New design pattern modules can be added under the package:
 * <code>com.myprojecticaro.poc_designe_patterns.patterns.*</code>
 * </p>
 *
 * @author Icaro
 * @version 1.0
 */
@SpringBootApplication
public class PocDesignePatternsApplication {

    /**
     * Bootstraps the Design Patterns POC application.
     *
     * @param args command-line arguments passed during application startup
     */
    public static void main(String[] args) {

        // Decorator
        Notifier email = new BaseDecorator();
        Notifier emailAndSms = new SMSNotifier(email);
        Notifier emailSmsSlack = new SlackNotifier(emailAndSms);
        Notifier fullNotifier = new PushNotifier(emailSmsSlack);
        fullNotifier.send("Your order has been shipped!");

        ExpensiveService service = new CacheDecorator(new ExpensiveServiceImpl());
        System.out.println(service.calculate(2));
        System.out.println(service.calculate(2))

        // adapter
        OldPaymentGateway legacyGateway = new OldPaymentGateway();
        PaymentProcessor processor = new PaymentAdapter(legacyGateway);
        NewStoreService store = new NewStoreService(processor);
        
        store.checkout(199.90);

        // factory
        TransportCreator carCreator = new CarTransportCreator();
        carCreator.planDelivery();

        TransportCreator bikeCreator = new BikeTransportCreator();
        bikeCreator.planDelivery();

        TransportCreator truckCreator = new TruckTransportCreator();
        truckCreator.planDelivery();

        // builder
        OrderDirector director = new OrderDirector();

        Order onlineOrder = director.createBasicOnlineOrder(new OnlineOrderBuilder());
        System.out.println(onlineOrder);

        Order expressOrder = director.createExpressOnlineOrder(new OnlineOrderBuilder());
        System.out.println(expressOrder);

        // Strategy
        PaymentContext payment = new PaymentContext(new PixPayment());
        payment.executePayment(150.00);
        
        payment.setStrategy(new CreditCardPayment());
        payment.executePayment(500.00);
        
        payment.setStrategy(new BoletoPayment());
        payment.executePayment(80.00);    

        // Observer
        OrderEventSubject orderSubject = new OrderEventSubject();
        orderSubject.attach(new EmailObserver());
        orderSubject.attach(new SmsObserver());
        orderSubject.attach(new FraudAnalysisObserver());

        orderSubject.newOrderPlaced("ORDER-12345");

        // Chain
        Request r = new Request("12345678901");
        
        Handler chain = new ValidateCpfHandler();
        chain
           .setNext(new ValidateDocumentHandler())
           .setNext(new FraudScoreHandler())
           .setNext(new FinalApprovalHandler());

        chain.handle(r);

        // Template Method
        Request request = new Request();

        AbstractFraudCheck basic = new BasicFraudCheck();
        basic.process(request);

        AbstractFraudCheck advanced = new AdvancedFraudCheck();
        advanced.process(request);

        // Command

        Notifier notifier = new SMSNotifier(
                                new SlackNotifier(
                                    new PushNotifier(
                                        new Notifier() {
                                            @Override
                                            public void send(String message) {
                                                System.out.println("Base NOTIFIER: " + message);
                                            }
                                        })));

        Command sendWelcome = new SendNotificationCommand(notifier, "Welcome!");
        Command sendAlert = new SendNotificationCommand(notifier, "Security alert!");

        CommandInvoker invoker = new CommandInvoker();
        invoker.addCommand(sendWelcome);
        invoker.addCommand(sendAlert);

        invoker.executeAll();
    }
}
