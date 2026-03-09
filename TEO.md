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

> *Note*: The `@Override` annotation is used to indicate that right on the next line is a method intended to override a method in the superclass. It is not __required__, but it helps to catch errors at compile time if the method does not actually override a method in the superclass (e.g., due to a typo in the method name or incorrect parameters).
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

| Type    | Size       | Example | Default Value |
| ------- | ---------- | ------- | ------------- |
| byte    | 8-bit      | 100     | 0             |
| short   | 16-bit     | 2000    | 0             |
| int     | 32-bit     | 50000   | 0             |
| long    | 64-bit     | 100000L | 0L            |
| float   | 32-bit     | 3.14f   | 0.0f          |
| double  | 64-bit     | 3.14159 | 0.0d          |
| char    | 16-bit     | 'A'     | '\u0000'      |
| boolean | true/false | true    | false         |

> *Note*: The default values are assigned to instance variables when they are declared but not initialized. Local variables do not have default values and must be initialized before use.

> *Note*: `boolean` is a logical type and its size is not defined by JVM specification, but it is commonly implemented as 1 byte (8 bits) in most JVM implementations.

---

*Compilation and Execution*
1. Write the Java code in a file with a `.java` extension (e.g., `HelloWorld.java`).
2. Compile the Java code using the `javac` command:
```bash
javac HelloWorld.java
```
3. This will generate a bytecode file with a `.class` extension (e.g., `HelloWorld.class`).
4. Run the compiled bytecode using the `java` command:
```bash
java HelloWorld
```
- The `java` command looks for the `main` method in the specified class and executes it.
```java
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
}
```

---

*Data Structures*

---

Keywords:
- `class`: Used to declare a class.
- `public`: An access modifier that allows access from any other class.
- `private`: An access modifier that restricts access to the class itself.
- `protected`: An access modifier that allows access to subclasses and classes in the same package.
- `static`: Indicates that a member belongs to the class rather than an instance of the class.
- `final`: Used to declare constants or to prevent method overriding and inheritance.
- `extends`: Used to indicate that a class is inheriting from a superclass.
- `implements`: Used to indicate that a class is implementing an interface.
- `new`: Used to create new objects.
- `this`: Refers to the current instance of the class.
- `super`: Refers to the superclass of the current class.
- `return`: Used to exit from a method and optionally return a value.
- `void`: Indicates that a method does not return any value.
- `if`, `else`: Used for conditional statements.
- `for`, `while`, `do-while`: Used for loops.
- `switch`, `case`: Used for multi-way branching.
- `try`, `catch`, `finally`: Used for exception handling.
- `package`: Used to declare a package, which is a namespace for organizing classes and interfaces.
- `import`: Used to import other classes and packages into the current class.
- `null`: A literal that represents the absence of a value or a reference to an object.
- `break`: Used to exit from a loop or a switch statement.
- `continue`: Used to skip the current iteration of a loop and continue with the next iteration

Not yet covered:
- `throw`, `throws`: Used to indicate that a method can throw an exception. 
- `abstract`: Used to declare a class that cannot be instantiated and may contain abstract methods.
- `interface`: Used to declare an interface, which is a reference type that can contain abstract methods and constants.


---

String Class

The `String` class in Java is used to create and manipulate character strings. It is a final class, meaning it cannot be subclassed, and all its methods are final, meaning they cannot be overridden.
```java
String str1 = "Hello";
String str2 = new String("World");
String str3 = str1 + " " + str2; // Concatenation
```
Strings are immutable, which means that once a `String` object is created, it cannot be changed. Any operation that seems to modify a string actually creates a new `String` object.
```java
String str1 = "Hello";
str1 = str1 + " World"; // str1 now references a new String object "Hello World"
```
In this example, the original `String` object "Hello" remains unchanged, and `str1` now references a new `String` object "Hello World". Two `String` objects are created in this process: one for "Hello" and another for "Hello World".

String is immutable, but you can use the `StringBuilder` or `StringBuffer` classes if you need to create mutable strings that can be modified without creating new objects.
```java
StringBuilder sb = new StringBuilder("Hello");
sb.append(" World"); // Modifies the same StringBuilder object
String result = sb.toString(); // Converts StringBuilder to String
```
In this example, the `StringBuilder` object `sb` is modified in place when we call the `append` method, and we can convert it to a `String` when needed.

- [String Class Documentation](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html)
- [StringBuilder Class Documentation](https://docs.oracle.com/javase/8/docs/api/java/lang/StringBuilder.html)
- [StringBuffer Class Documentation](https://docs.oracle.com/javase/8/docs/api/java/lang/StringBuffer.html)

---

Memory

- Stack: Used for static memory allocation and execution of threads. It stores local variables, method calls, and control flow.
- Heap: Used for dynamic memory allocation. It stores objects and their associated data. The heap is shared among all threads in the application.
- String Pool: A special area of the heap that stores string literals. When a string literal is created, it is interned and stored in the string pool. If another string literal with the same content is created, it will reference the same object in the string pool instead of creating a new one.
```java
String str1 = "Hello"; // str1 references a string literal in the string pool
String str2 = "Hello"; // str2 references the same string literal in the string pool
String str3 = new String("Hello"); // str3 references a new String object in the heap
```
In this example, `str1` and `str2` reference the same string literal "Hello" in the string pool, while `str3` references a new `String` object in the heap. There are two `String` objects created in this process: one in the string pool for the literal "Hello" and another in the heap for the `String` object created with `new String("Hello")`. Even though there are two `String` objects, there are three references to them: `str1` and `str2` reference the string literal in the string pool, while `str3` references the new `String` object in the heap.

---

Operators
```
- Arithmetic Operators: `+`, `-`, `*`, `/`, `%`
- Relational Operators: `==`, `!=`, `>`, `<`, `>=`, `<=`
- Logical Operators: `&&`, `||`, `!`
- Bitwise Operators: `&`, `|`, `^`, `~`, `<<`, `>>`, `>>>`
- Assignment Operators: `=`, `+=`, `-=`, `*=`, `/=`, `%=`, `&=`, `|=`, `^=`, `<<=`, `>>=`, `>>>=`
- Ternary Operator: `? :`
- Instanceof Operator: `instanceof`
- Increment and Decrement Operators: `++`, `--`
```

Increment and Decrement Operators:
- `++` (increment operator): Increases the value of a variable by 1.
```java
int a = 5;
a++; // a is now 6
```
```java
int a = 5;
++a; // a is now 6
```
> *Note*: The difference between `a++` and `++a` is that `a++` is a post-increment operator, which means it returns the value of `a` before incrementing it, while `++a` is a pre-increment operator, which means it increments the value of `a` first and then returns the incremented value.

- `--` (decrement operator): Decreases the value of a variable by 1.
```java
int a = 5;
a--; // a is now 4
```
```java
int a = 5;
--a; // a is now 4
```

> *Note*: Similar to the increment operator, `a--` is a post-decrement operator, which means it returns the value of `a` before decrementing it, while `--a` is a pre-decrement operator, which means it decrements the value of `a` first and then returns the decremented value.


