# Introduction to OOP Concepts in JAVA

## This repo is part of JAVA Course with IA and its content was built with the help of gemini/chatGPT

## Object-oriented programming (OOP)

OOP is a way of organizing code with ``blueprints`` creating reusable objects that represent real-world things or concepts.

1. **Objects**: things that represent the real world such as persons, products, cars, buttons in a website. They have:
    - **attributes**: characteristics of the object.
    - `**methods**: actions of the object.
2. **Classes**: define the structure and behaviour of an object. Template of an object that can be reusable (instanciated)

        Key Points of a Class

**Cconstructors**\
A constructor is a special method in a class `` that's automatically called when you create a new object `` (instance) of that class. Its primary purpose is to initialize the object's state (its fields or properties). It has the `` same``  name as the clas

**How Constructor Works**

    public Car(String make, String model, int year, String color): This is the constructor's signature. It defines the parameters it expects when you create a new Car object.

    public: This means the constructor can be accessed from anywhere in your program.
    Car: The name of the class.
    (String make, String model, int year, String color): The parameters the constructor takes. These parameters will be used to initialize the make, model, year, and color fields of the new Car object.
    this.make = make; (and similar lines): These lines assign the values passed in as parameters to the corresponding fields of the Car object.
    this: This keyword refers to the current object being created.
    make: The field of the Car object.
   

* Initialization: Constructors are essential for setting up the initial state of your objects.
* No return value: They don't return anything.
* Overloading: You can have multiple constructors in a class, each with different parameters (constructor overloading). This allows you to create objects with different initial configurations.

**Mmethods**\
 Methods define the ``actions or behaviors ``that objects of a class can perform. They ``encapsulate`` a specific task or functionality. They are reusable because they allow you to write code once and reuse it multiple times, making your code more organized and efficient.

**Understanding the Methods** - `` public void startEngine()``: This is the definition of the startEngine method.

    public: This means the method can be accessed from anywhere in your program.
    void: This indicates that the method doesn't return any value.
    startEngine(): The name of the method.
    {}: The curly braces enclose the code that the method executes.
    System.out.println("The " + make + " " + model + "'s engine has started.");: This line prints a message to the console indicating that the car's engine has started. It uses the make and model fields of the Car object to provide specific information.
    public void stopEngine(): This is the definition of the stopEngine method, which works similarly to startEngine.
    public void accelerate(): This is the definition of the accelerate method, which works similarly to startEngine.
    public void brake(): This is the definition of the brake method, which works similarly to startEngine.


**How to Use Methods** - You call a method on an object using the dot operator (.)\

        Key Points

* Encapsulation: Methods help encapsulate the internal workings of an object, hiding the implementation details from the outside world.
* Data Manipulation: Methods can be used to modify the state of an object (its fields).
* Return Values: Methods can return values using the return keyword.


3. **Encapsulation**: It keeps data and methods hidden from the outside world. Only the object itself can access it ensuring data integrity.
4. **Inheritance**: Allows the creation of new objects that inherit all the features of a standard object but add some extra features (personalize)
5. **Polimorphism**: objects cand be treated differently depending on their type. Example: a 'print' method can print a name differently than a product description.

Procedural Programming (PP) and Object-Oriented Programming (OOP) are two fundamental programming paradigms, each with its own approach to software design and implementation. Here's a comparison between the two, specifically in the context of Java:

## Procedural Programming (PP)

Procedural Programming is a programming paradigm based on the concept of procedure calls, where statements are structured into procedures (also known as routines or functions).Procedural Programming (PP) and Object-Oriented Programming (OOP) are two fundamental programming paradigms, each with its own approach to software design and implementation. Here's a comparison between the two, specifically in the context of Java:

1. **Structure:** The program is structured as a sequence of procedures or functions.\
2. **Data and Functions:** Data and functions are separate. Functions operate on data passed to them as arguments.\
3. **Modularity:** Programs are divided into small parts called functions. This promotes code reuse and better organization.\
4. **Focus:** The focus is on the sequence of actions to be performed (the process).

While Java is ``primarily an OOP language``, you can still write procedural code using static methods in a class.
||**Advantages**||
|--|-----|----|
|``Reusability``|``Maintainability``|``Flexibility``|
|Reuse objects and classes in different parts of the program, saving time and effort|Organized into logical units making code easier to understand and modify|adaptable to changing requirements
