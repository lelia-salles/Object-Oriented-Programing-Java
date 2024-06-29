// Define a Car class
/**
 * Classes are blueprints for objects. 
 * They define the structure (fields/attributes) 
 * and behavior (methods) that objects will have.
 */
public class Car {
    // Fields or properties
    /**
     * Properties in Java are often referred to as fields 
     * or instance variables. They represent the state or data of objects.
     */

    private String make;
    private String model;
    private int year;
    private String color;

    // Constructor
    /**
     * It is a special method called when you create a new object (instance) of that class.
     * It initializes the object´s state (its fields or properties)
     * It has the same name as a class
     * They don´t have any return type(void)
     * public - constructor can be acessed from anywhere in theprogram
     * Car is the name of class
     * String make, etc. are parameters the constructor takes to 
     * initialize the make, model, year and color of the new Car object
     * Keyword this refers to the current object being created
     * make: the field of the Car object and the parameter is passed in when creating the object
     */
    public Car(String make, String model, int year, String color) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.color = color;
    }

    // Methods are actions or behaviours of an object
    /**
     * they are reusable
     */
    public void startEngine() {
        System.out.println("The " + make + " " + model + "'s engine has started.");
    }

    public void stopEngine() {
        System.out.println("The " + make + " " + model + "'s engine has stopped.");
    }

    // Main method to demonstrate usage
    public static void main(String[] args) {
        // Creating an object of the Car class
        Car myCar = new Car("Toyota", "Camry", 2020, "Red");

        // Accessing properties
        System.out.println(myCar.make);  // Output: Toyota
        System.out.println(myCar.model); // Output: Camry

        // Calling methods
        myCar.startEngine(); // Output: The Toyota Camry's engine has started.
        myCar.stopEngine();  // Output: The Toyota Camry's engine has stopped.
    }
}
