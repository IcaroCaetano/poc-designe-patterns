 # Design Patterns

This repository contains a Proof of Concept (POC) developed with Java and Spring Framework to demonstrate the practical application of software design patterns in a modern, layered, and maintainable architecture.

The main goal of this project is to explore how classic and enterprise design patterns can be applied in real-world scenarios using Spring features such as Dependency Injection, configuration, and inversion of control.

![Designe Patterns](docs/Design_Patterns.png)

## 🎯 Objectives

- Demonstrate the use of classic design patterns in Java applications

- Apply patterns in a Spring-based environment

- Improve code readability, maintainability, and extensibility

- Serve as a learning reference and architectural playground

- This POC simulates real-world scenarios such as:

- Notification delivery through multiple channels (SMS, Email, Slack, Push)

- Workflow and state transitions

- Undo/redo mechanisms

- Object creation strategies

- Decoupled communication between components

## 🛠️ Technologies

- Java 17+ (or compatible LTS version)

- Spring Framework / Spring Boot

- Maven or Gradle

- JUnit / Mockito (optional, for testing)

- (Optional) Access exposed endpoints via Postman or browser.


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

- Flyweight - Reduces memory usage by sharing common object state across multiple instances.

### Behavioral Patterns

- Strategy – Encapsulates interchangeable algorithms

- Template Method – Defines a skeleton of an algorithm

- Observer / Publisher–Subscriber – Event-driven communication

- Command – Encapsulates requests as objects

- Chain of Responsibility – Passes requests along a chain of handlers

- State – Alters behavior when internal state changes

- Mediator – Centralizes complex communication between components

- Iterator – Provides sequential access without exposing internal structure

- Visitor – Separates algorithms from object structures

- Interpreter - Defines a grammatical representation for a language and interprets expressions.

- Memento - Captures and restores an object’s internal state without violating encapsulation
(used for undo/rollback scenarios)

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

- Design Patterns: Elements of Reusable Object-Oriented Software (GoF)

- Spring Framework Documentation

- Clean Code – Robert C. Martin

- Refactoring Guru – Design Patterns

## ✅ Final Notes

This project is intended as:

- A learning resource

- A technical interview showcase

- A reference for applying patterns with Spring

Each pattern is implemented in isolation and documented to highlight:

- Intent

- Structure

- Real-world applicability

> queue = new ArrayDeque<>();
Nada mais muda no código.


## 📌 1️⃣ O que é Queue<String>?
Queue é uma interface do pacote:

java.util.Queue
Ela define o comportamento de uma fila (FIFO — First In, First Out).

Quando você escreve:

Queue<String>
Você está dizendo:

Quero trabalhar com o contrato de uma fila que armazena Strings.

Você está programando contra a interface, não contra a implementação.

Isso é boa prática de design 👌

### 📌 2️⃣ O que é new LinkedList<>()?
LinkedList é uma classe concreta que:

```
Implementa List

Implementa Deque

Implementa Queue
```

Ou seja, ela pode funcionar como:

- Lista

- Fila

- Pilha

Aqui você está usando ela como Queue.

### 📌 3️⃣ O que essa linha faz na prática?
Ela cria:

Uma fila FIFO baseada em lista duplamente encadeada.

Internamente:

Cada elemento aponta para o próximo

Inserção no final é rápida

Remoção no início é rápida

### 📌 4️⃣ Por que usar assim?
Porque isso segue o princípio:

Programar para a interface, não para a implementação.

Se amanhã você quiser trocar:

Queue<String> queue = new ArrayDeque<>();
Nada mais muda no código.

### 📌 5️⃣ Comportamento FIFO
Exemplo:

```
queue.offer("A");
queue.offer("B");
queue.offer("C");
```

System.out.println(queue.poll());
Saída:

A

Porque fila funciona assim:

Entrada → [A, B, C] → Saída
Primeiro que entra → Primeiro que sai.

### 📌 6️⃣ Internamente (visão estrutural)
LinkedList usa:

```
Node {
   element
   next
   previous
}
```

Então:

Inserção O(1)

Remoção O(1) no início

Acesso por índice é O(n)

### 📌 7️⃣ Comparação importante

Hoje, na prática moderna, é mais recomendado usar:

Queue<String> queue = new ArrayDeque<>();
Porque:

Melhor performance

Menor overhead de memória

Não sincronizado

Mais eficiente que LinkedList na maioria dos casos

### 🧠 Resumo Final

Queue<String> queue = new LinkedList<>();
Significa:

Estou criando uma fila FIFO de Strings usando uma lista encadeada como implementação.


--


Boa 👌 essa é uma das operações mais importantes da Queue.

Vamos analisar:

```
queue.peek();
```
