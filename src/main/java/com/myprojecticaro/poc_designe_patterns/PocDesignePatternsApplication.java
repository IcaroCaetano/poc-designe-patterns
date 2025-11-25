package com.myprojecticaro.poc_designe_patterns;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.myprojecticaro.poc_designe_patterns.structural.decorator.*;

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
        System.out.println("=== Single notifier ===");
        Notifier email = new EmailNotifier();
        email.send("Welcome user!");

        System.out.println("\n=== Email + SMS ===");
        Notifier emailSms = new SMSNotifier(new EmailNotifier());
        emailSms.send("Your account was created!");

        System.out.println("\n=== Email + Slack + SMS ===");
        Notifier fullStack =
                new SMSNotifier(
                        new SlackNotifier(
                                new EmailNotifier()
                        )
                );
        fullStack.send("A new login was detected!");

        System.out.println("\n=== Email + Push ===");
        Notifier emailPush = new PushNotifier(new EmailNotifier());
        emailPush.send("You received a new message!");
    }
}
