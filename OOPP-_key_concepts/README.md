# Introduction to OOP Concepts in JAVA

Procedural Programming (PP) and Object-Oriented Programming (OOP) are two fundamental programming paradigms, each with its own approach to software design and implementation. Here's a comparison between the two, specifically in the context of Java:

## Procedural Programming (PP)

Procedural Programming is a programming paradigm based on the concept of procedure calls, where statements are structured into procedures (also known as routines or functions).

### Characteristics

**Structure:** The program is structured as a sequence of procedures or functions.\
**Data and Functions:** Data and functions are separate. Functions operate on data passed to them as arguments.\
**Modularity:** Programs are divided into small parts called functions. This promotes code reuse and better organization.\
**Focus:** The focus is on the sequence of actions to be performed (the process).

While Java is ``primarily an OOP language``, you can still write procedural code using static methods in a class.

## Object-Oriented Programming (OOP)

Object-Oriented Programming is a paradigm centered around objects rather than actions, and data rather than logic. It uses objects and classes to structure the code.

### Characteristics

**Classes and Objects:** Programs are organized around objects and classes. An object is an instance of a class.\

    Key Points

* Initialization: Constructors are essential for setting up the initial state of your objects.
* No return value: They don't return anything.
* Overloading: You can have multiple constructors in a class, each with different parameters (constructor overloading). This allows you to create objects with different initial configurations.\

**Encapsulation:** Data and methods that operate on the data are bundled together into objects. This hides the internal state of objects from the outside world.\
**Inheritance:** Classes can inherit properties and behaviors from other classes, promoting code reuse and hierarchical classification.\
**Polymorphism:** Objects can be treated as instances of their parent class rather than their actual class. This allows one interface to be used for a general class of actions.\
Abstraction: Hides complex implementation details and shows only the necessary features of an object.

## Comparision

| |**Procedural Programming (PP)** | **Object-Oriented Programming (OOP)** |
| --- | --- | --- |
| **Design Approach** | Focuses on functions and the sequence of tasks | Focuses on objects and the interactions between them |
| **Data Handling** | Data is passed from one function to another | Data is encapsulated within objects and accessed through methods. |
| **Code Reusability** | Code reuse is achieved through functions | Code reuse is achieved through inheritance and polymorphism. |
| **Maintenance** | Can become cumbersome for large systems due to the lack of structure around data and functions | Easier to maintain and extend due to its modular nature and encapsulation. |
