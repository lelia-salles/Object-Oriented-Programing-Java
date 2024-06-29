// Define a Car class
public class Car {
    // Fields or properties
    private String make;
    private String model;
    private int year;
    private String color;

    // Constructor
    public Car(String make, String model, int year, String color) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.color = color;

        // getters and setters
        public String getMake() {
            return make;
        }

        public void setMake(String make) {
            this.make = make;
    }
   
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
    
    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
    getters and setters 
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }


    // Methods
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
