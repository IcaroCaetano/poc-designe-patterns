# Design Patterns

This repository contains a Proof of Concept (POC) developed with Java and Spring Framework to demonstrate the practical application of software design patterns in a modern, layered, and maintainable architecture.

The main goal of this project is to explore how classic and enterprise design patterns can be applied in real-world scenarios using Spring features such as Dependency Injection, configuration, and inversion of control.

![Designe Patterns](docs/Design_Patterns.png)

## 🎯 Objectives

Demonstrate the use of design patterns in Java applications

Apply patterns in a Spring-based environment

Improve code readability, maintainability, and extensibility

Serve as a learning reference and architectural playground

This POC implements a real-world scenario: sending notifications through different channels (SMS, Email, Slack, Push Notification), with the option to combine multiple channels together dynamica

## 🛠️ Technologies

Java 17+ (or compatible LTS version)

Spring Framework / Spring Boot

Maven or Gradle

JUnit / Mockito (optional, for testing)

(Optional) Access exposed endpoints via Postman or browser.


## 🧩 Design Patterns Covered

This POC may include (but is not limited to) the following patterns:

### Creational Patterns

- Factory Method – Encapsulates object creation logic

- Abstract Factory – Creates families of related objects without specifying concrete classes

- Builder – Builds complex objects step by step

- Prototype – Creates new objects by copying existing instances

- Singleton – Ensures a single instance (managed naturally by Spring Beans)

### Structural Patterns

- Adapter – Bridges incompatible interfaces

- Bridge – Decouples abstraction from implementation

- Facade – Simplifies interaction with complex subsystems

- Decorator – Adds behavior dynamically without modifying the original class

- Composite – Treats individual objects and compositions uniformly

- Proxy – Controls access to another object (e.g., caching, security, lazy loading)

### Behavioral Patterns

- Strategy – Encapsulates interchangeable algorithms

- Template Method – Defines a skeleton of an algorithm

- Observer / Publisher-Subscriber – Event-driven communication

- Command – Encapsulates requests as objects

### ▶️ How to Run

Clone the repository:

````
git clone https://github.com/your-username/design-patterns-poc.git
````
Build the project:

````
mvn clean install
````

Run the application:

````
mvn spring-boot:run
````

### 📚 References

Design Patterns: Elements of Reusable Object-Oriented Software (GoF)

Spring Framework Documentation

Clean Code – Robert C. Martin

Refactoring Guru – Design Patterns
