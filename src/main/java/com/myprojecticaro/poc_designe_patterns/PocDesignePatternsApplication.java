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

        // singleton
        ClassicSingleton singleton1 = ClassicSingleton.getInstance();
        ClassicSingleton singleton2 = ClassicSingleton.getInstance();

        System.out.println(singleton1 == singleton2); 
        singleton1.execute();

        // prototype
        UserPrototype original = new UserPrototype("Icaro", "ADMIN");

        UserPrototype copy1 = original.clone();
        UserPrototype copy2 = original.clone();
    
        System.out.println(original);
        System.out.println(copy1);
        System.out.println(copy2);
        System.out.println(original == copy1); // false

        // abstract factory
        PaymentAbstractFactory factory = new StripeFactory();

        PaymentService paymentService = factory.createPaymentService();
        NotificationService notificationService = factory.createNotificationService();

        paymentService.pay(100.0);
        notificationService.notifyUser("Payment successful")

        // composite
        Component file1 = new FileLeaf("file1.txt");
        Component file2 = new FileLeaf("file2.txt");

        FolderComposite rootFolder = new FolderComposite("root");
        FolderComposite subFolder = new FolderComposite("documents");

        subFolder.add(file1);
        subFolder.add(file2);

        rootFolder.add(subFolder);
        rootFolder.showDetails();

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


        // flyweght
        Shape red1 = ShapeFactory.getCircle("RED");
        red1.draw(10, 20);

        Shape red2 = ShapeFactory.getCircle("RED");
        red2.draw(30, 40);

        Shape blue = ShapeFactory.getCircle("BLUE");
        blue.draw(50, 60);

        System.out.println(red1 == red2);

        // bridge
        Device tv = new TvDevice();
        RemoteControl tvRemote = new AdvancedRemoteControl(tv);

        tvRemote.powerOn();
        ((AdvancedRemoteControl) tvRemote).mute();
        tvRemote.powerOff();
    
        Device radio = new RadioDevice();
        RemoteControl radioRemote = new AdvancedRemoteControl(radio);
    
        radioRemote.powerOn();
        radioRemote.powerOff();
        
        // proxy 
        ExpensiveOperation service = new ExpensiveOperationProxy();

        System.out.println("First call...");
        System.out.println(service.execute(5));

        System.out.println("Second call...");
        System.out.println(service.execute(5));

        // facade
        OrderFacade facade = new OrderFacade();
        facade.placeOrder("Icaro", "Notebook Gamer", 7500.0);

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

        // interpreter
        Context adminContext = new Context(Set.of("READ", "WRITE", "DELETE"));

        Expression read = new PermissionExpression("READ");
        Expression write = new PermissionExpression("WRITE");
        Expression delete = new PermissionExpression("DELETE");

        Expression adminRule = new AndExpression(read, new AndExpression(write, delete));

        System.out.println(adminRule.interpret(adminContext));

        Context userContext = new Context(Set.of("READ"));

        System.out.println(adminRule.interpret(userContext))

        // iterator
        NameCollection collection = new NameCollection();
        collection.add("Icaro");
        collection.add("Design");
        collection.add("Patterns");

        Iterator<String> iterator = collection.createIterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

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

        // visitor
        FileElement file1 = new FileElement("file1.txt", 10);
        FileElement file2 = new FileElement("file2.txt", 20);
    
        FolderElement root = new FolderElement("root");
        FolderElement docs = new FolderElement("docs");
    
        docs.add(file1);
        docs.add(file2);
        root.add(docs);
    
        SizeCalculatorVisitor sizeVisitor = new SizeCalculatorVisitor();
        root.accept(sizeVisitor);
    
        System.out.println("Total size: " + sizeVisitor.getTotalSize());
    
        PrintStructureVisitor printVisitor = new PrintStructureVisitor();
        root.accept(printVisitor);

        // memento 
        TextEditor editor = new TextEditor();
        History history = new History();
    
        editor.write("Version 1");
        history.save(editor.save());
    
        editor.write("Version 2");
        history.save(editor.save());
    
        editor.write("Version 3");
    
        System.out.println(editor.getText()); // Version 3
    
        editor.restore(history.undo());
        System.out.println(editor.getText()); // Version 2
    
        editor.restore(history.undo());
        System.out.println(editor.getText()); // Version 1

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
