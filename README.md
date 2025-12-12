# Design Patterns

![Descrição da imagem](caminho/para/imagem.png)

## 🎯 Purpose

The Decorator Pattern allows you to:

- Add new responsibilities to an object dynamically

- Avoid creating complex inheritance hierarchies

- Follow the Open/Closed Principle (OCP)

- Compose behaviors at runtime

This POC implements a real-world scenario: sending notifications through different channels (SMS, Email, Slack, Push Notification), with the option to combine multiple channels together dynamica


## ✔ Implemented Classes

Class	Description

Notifier	Base interface defining the notification operation.

EmailNotifier	Concrete notifier that sends notifications via Email.

SMSNotifier	Concrete notifier that sends notifications via SMS.

SlackNotifier	Concrete notifier that sends messages to Slack.

PushNotifier	Concrete notifier that sends mobile push notifications.

BaseDecorator	Abstract decorator that implements Notifier and wraps another Notifier.
