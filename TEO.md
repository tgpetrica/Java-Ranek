## Java OOP Cheatsheet
*Concepts:*
1. Classes and Objects
   - Class: A blueprint for creating objects (a particular data structure).
   - Object: An instance of a class.
   ```java
    class Car {
         String color;
         int year;
    
         void start() {
              System.out.println("Car is starting");
         }
    }
    ```
2. Encapsulation
   - means hiding the internal details of an object and only allowing access through public methods.
   - Use private fields and public getter/setter methods.
   ```java
    class Person {
         private String name;
    
         public void setName(String name) {
              this.name = name;
         }
    
         public String getName() {
              return name;
         }
    }
    ```
3. Inheritance
    - A new class (child class) inherits properties and behaviors from an existing class (parent class).
    - Use the `extends` keyword.
    ```java
    class Animal {
           void eat() {
                 System.out.println("Animal is eating");
           }
    }
    
    class Dog extends Animal {
           void bark() {
                 System.out.println("Dog is barking");
           }
    }
     ```
    -  Dog inherits the eat() method from Animal and can also have its own method bark().
4. Polymorphism
    - The ability of an object to take on many forms.
    - **Method Overloading**: Same method name with different parameters (number, type, or order of parameters).
    - **Method Overriding**: Subclass provides a specific implementation of a method already defined in its superclass.
    ```java
    class Shape {
         void draw() {
              System.out.println("Drawing a shape");
         }
    }
    
    class Circle extends Shape {
         void draw() {
              System.out.println("Drawing a circle");
         }
    }
     ```
    - In this example, the Circle class overrides the draw()method of the Shape class to provide a specific implementation for drawing a circle.
    ```java
    class Calculator {
         int add(int a, int b) {
              return a + b;
         }
    
         double add(double a, double b) {
              return a + b;
         }
    }
    ```
    - In this example, the add() method is overloaded to handle both integer and double parameters.
5. Abstractization (TBA)
---
*Relationships between classes:*
1. Association: A relationship where one class uses another class. It can be one-to-one, one-to-many, or many-to-many.
    - Example: A Teacher teaches Student.
    ```java
    class Teacher {}
    class Student {}
    
    Tacher teacher = new Teacher();
    Student student = new Student();
    ```
    - Objects exist independently, but they can interact with each other.
2. Aggregation: A weak "has-a" relationship where one class contains a reference to another class, but the contained class can exist independently.
    - Example: University has Students.
    ```java
    class Student {}
    class University {
        Student student;
        University(Student student) {
            this.student = student;
        }
    }
    ```
    - The University class has a reference to the Student class, but the Student can exist independently of the University.
    - If the University is destroyed, the Student can still exist.
3. Composition: A strong "has-a" relationship where one class contains a reference to another class, and the contained class cannot exist independently.
    - Example: Human has Heart.
    ```java
    class Heart {}
    class Human {
        private Heart heart = new Heart();
    }
    ```
    - if the Human class is destroyed, the Heart class will also be destroyed, as it cannot exist independently of the Human class.
---
**Methods overloading**: allows a class to have more than one method with the same name, as long as their parameter lists are different (different number of parameters, different types of parameters, or different order of parameters).
    
```java
class Calculator {
    int add(int a, int b) {
        return a + b;
    }

    double add(double a, double b) {
        return a + b;
    }

    double add (int a, double b) {
        return a + b;
    }

    double add (double a, int b) {
        return a + b;
    }
}
```

- same method name
- different parameter lists
- return type can be the same or different

---

**Methods overriding**: allows a subclass to provide a specific implementation of a method that is already defined in its superclass.

```java
class Animal {
    void eat() {
        System.out.println("Animal is eating");
    }
}

class Dog extends Animal {
    @Override
    class Dog extends Animal {
        void eat() {
            System.out.println("Dog is eating");
        }
    }
}
```

- same method name (signature)
- same parameter list (signature)
- used with inheritance
- runtime polymorphism

---

*Access Modifiers:*

| Modifier  | Same Class | Same Package | Subclass | Other Package |
| --------- | ---------- | ------------ | -------- | ------------- |
| public    | ✔          | ✔            | ✔        | ✔             |
| protected | ✔          | ✔            | ✔        | ✖             |
| default   | ✔          | ✔            | ✖        | ✖             |
| private   | ✔          | ✖            | ✖        | ✖             |

```java 
public class Test {
    private int a;
    protected int b;
    int c; // default
    public int d;
}
```

---

**Constructors**: A constructor is a special method that is called when an object is instantiated. It is used to initialize the object.

```java
class Car {
    String color;
    int year;

    // Constructor
    Car(String color, int year) {
        this.color = color;
        this.year = year;
    }
}
```

- same name as the class
- no return type
- can be overloaded (multiple constructors with different parameter lists)

    1. *Default Constructor*: A constructor that takes no arguments. If no constructor is defined, Java provides a default constructor.
    - Automatically generated by the compiler if no constructors are defined.
    - Initializes object with default values (e.g., null for objects, 0 for numeric types, false for boolean).
        ```java
        Student student = new Student(); // Default constructor is  called
        ```

    2. *Parameterized Constructor*: A constructor that takes arguments to initialize the object with specific values.
        ```java
        Student (String name, int age) {
            this.name = name;
            this.age = age;
        }
        ```
    
    3. *Copy Constructor*: A constructor that creates a new object as a copy of an existing object.
        ```java
        Student (Student student) {
            this.name = student.name;
            this.age = student.age;
        }
        ```
    
---

*Primitive Types*

| Type    | Size       | Example |
| ------- | ---------- | ------- |
| byte    | 8-bit      | 100     |
| short   | 16-bit     | 2000    |
| int     | 32-bit     | 50000   |
| long    | 64-bit     | 100000L |
| float   | 32-bit     | 3.14f   |
| double  | 64-bit     | 3.14159 |
| char    | 16-bit     | 'A'     |
| boolean | true/false | true    |


