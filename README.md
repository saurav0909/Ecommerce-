# E-Commerce System

## Description
This is a simple e-commerce system implemented in Java. It demonstrates the principles of object-oriented programming, including encapsulation, abstraction, polymorphism, and interface use.

## Classes and Interfaces
- `Product`: Represents a product with details such as ID, name, price, quantity, and category.
- `User`: Abstract class representing a user with common methods and fields.
  - `Customer`: Extends `User` with additional functionality for adding to cart and checking out.
  - `Admin`: Extends `User` with functionalities for managing products.
- `Order`: Represents an order and implements the `OrderActions` interface.
- `OrderActions`: Interface defining methods for order processing.

## How to Run
1. Compile the Java files:
    javac App.java
2. Run the `Main` class:
    java App

## Design Choices
- **Encapsulation**: All class fields are private, with public getters and setters
