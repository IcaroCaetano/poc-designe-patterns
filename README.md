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


## ✔ Implemented Classes

Class	Description

Notifier	Base interface defining the notification operation.

EmailNotifier	Concrete notifier that sends notifications via Email.

SMSNotifier	Concrete notifier that sends notifications via SMS.

SlackNotifier	Concrete notifier that sends messages to Slack.

PushNotifier	Concrete notifier that sends mobile push notifications.

BaseDecorator	Abstract decorator that implements Notifier and wraps another Notifier.
