// 1. Basic Inheritance
class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

class Student extends Person {
    String course;

    Student(String name, int age, String course) {
        super(name, age);
        this.course = course;
    }

    void show() {
        display();
        System.out.println("Course: " + course);
    }
}

// 2. Single Inheritance
class Animal {
    void eat() {
        System.out.println("Animal eats food");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Dog barks");
    }
}

// 3. Multilevel Inheritance
class Vehicle {
    void start() {
        System.out.println("Vehicle starts");
    }
}

class Car extends Vehicle {
    void drive() {
        System.out.println("Car is driving");
    }
}

class SportsCar extends Car {
    void boost() {
        System.out.println("SportsCar boosts speed");
    }
}

// 4. Hierarchical Inheritance
class Shape {
    void draw() {
        System.out.println("Drawing shape");
    }
}

class Circle extends Shape {
    void drawCircle() {
        System.out.println("Drawing circle");
    }
}

class Rectangle extends Shape {
    void drawRectangle() {
        System.out.println("Drawing rectangle");
    }
}

// 5. Constructor Inheritance
class Account {
    int accNo;
    double balance;

    Account(int accNo, double balance) {
        this.accNo = accNo;
        this.balance = balance;
    }
}

class SavingsAccount extends Account {
    double interestRate;

    SavingsAccount(int accNo, double balance, double interestRate) {
        super(accNo, balance);
        this.interestRate = interestRate;
    }
}

// 6. Method Overriding
class Animal2 {
    void sound() {
        System.out.println("Animal makes sound");
    }
}

class Cat extends Animal2 {
    void sound() {
        System.out.println("Cat meows");
    }
}

// 7. Use of super keyword
class Employee {
    String name = "Employee";
}

class Manager extends Employee {
    String name = "Manager";

    void printName() {
        System.out.println(super.name);
    }
}

// 8. IS-A Relationship
class Bird {
    void fly() {
        System.out.println("Bird can fly");
    }
}

class Eagle extends Bird {
    void hunt() {
        System.out.println("Eagle hunts");
    }
}

// 9. HAS-A Relationship
class Engine {
    void work() {
        System.out.println("Engine is working");
    }
}

class Bike {
    Engine engine = new Engine();
    void run() {
        engine.work();
        System.out.println("Bike is running");
    }
}

// 10. Final Keyword in Inheritance
class FinalParent {
    final void show() {
        System.out.println("This is a final method");
    }
}

class FinalChild extends FinalParent {
    // void show() { System.out.println("Can't override"); } // This will give error
}
