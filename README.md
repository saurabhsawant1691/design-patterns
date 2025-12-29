# Design Patterns – Overview

Design Patterns are **well-proven solutions to commonly occurring problems in software design**.  
They are **not language-dependent** and can be used in **any programming language that supports Object-Oriented Programming (OOP)**.

---

## History of Design Patterns

- **Christopher Alexander (1977)** introduced the concept of patterns in architecture, which later inspired software design patterns.
- The famous book **“Design Patterns: Elements of Reusable Object-Oriented Software”** was written by the **Gang of Four (GoF)**:
  - Erich Gamma  
  - Richard Helm  
  - Ralph Johnson  
  - John Vlissides  

---

## Types of Design Patterns

There are **three main categories of design patterns**:

---

## 1. Creational Design Patterns

Creational Design Patterns deal with **object creation and instantiation mechanisms**, trying to create objects in a manner suitable to the situation.

### Creational Patterns List
- Factory Design Pattern  
- Abstract Factory Design Pattern  
- Singleton Design Pattern  
- Builder Design Pattern  
- Prototype Design Pattern  

---

### Factory Design Pattern

**Definition:**  
Creates an object **without exposing the creation logic** to the client and refers to the newly created object using a **common interface**.

**Key Concepts:**
- Centralized object creation
- Hides instantiation logic
- Uses a common interface

**Advantages:**
- Encapsulates object creation
- Follows **Dependency Inversion Principle**
- Follows **Open/Closed Principle**
- Promotes **Separation of Concerns**

**Real-World Analogy:**  
A physical factory produces products without exposing manufacturing details.

---

### Singleton Design Pattern

**Definition:**  
Ensures that a class has **only one instance** and provides a **global access point** to it.

**Key Characteristics:**
- Single instance
- Global access point

**Components:**
- Private constructor
- Static instance variable
- Static access method

**Advantages:**
- Reduced memory usage
- Guaranteed single instance

**Real-World Analogy:**  
A central government — only one exists and coordinates everything.

---

### Builder Design Pattern

**Definition:**  
Constructs **complex objects step by step**, separating construction from representation.

**Key Concepts:**
- Step-by-step object creation
- Separation of construction and representation
- Reusability of construction logic

**Advantages:**
- Encapsulation
- Separation of Concerns
- Follows **Single Responsibility Principle**

**Use Cases:**
- Video game character creation
- Meal creation systems

---

### Prototype Design Pattern

**Definition:**  
Creates new objects by **cloning an existing object** instead of instantiating a new one.

**Key Concepts:**
- Object cloning
- Faster object creation
- Flexible object creation

**Types of Cloning:**

#### Shallow Copy
- Copies object references
- Shared nested objects
- Changes affect both original and clone

#### Deep Copy
- Copies all nested objects recursively
- Original and clone are fully independent

**Use Case:**
- Graphic design applications

---

## 2. Structural Design Patterns

Structural Design Patterns focus on **how classes and objects are composed** to form larger structures.

### Structural Patterns List
- Bridge Design Pattern  
- Adapter Design Pattern  
- Composite Design Pattern  
- Proxy Design Pattern  
- Flyweight Design Pattern  
- Facade Design Pattern  
- Decorator Design Pattern  

---

## 3. Behavioral Design Patterns

Behavioral Design Patterns focus on **communication between objects** and responsibility delegation.

### Behavioral Patterns List
- Interpreter Design Pattern  
- Strategy Design Pattern  
- Observer Design Pattern  
- State Design Pattern  
- Iterator Design Pattern  
- Template Method Design Pattern  
- Mediator Design Pattern  
- Chain of Responsibility Pattern  
- Command Design Pattern  
- Visitor Design Pattern  
- Memento Design Pattern  

---

## Summary

- Design Patterns improve **code reusability, maintainability, and scalability**
- They promote **clean architecture** and **SOLID principles**
- Widely used in **enterprise-level applications**

---

### 📌 Tip
Understanding **when to use a pattern** is more important than memorizing definitions.

---
