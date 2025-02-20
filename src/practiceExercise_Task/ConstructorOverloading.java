package practiceExercise_Task;

public class ConstructorOverloading {

        int x;
        String name;

        // Default constructor
        ConstructorOverloading() {
            x = 0;
            name = "Default";
            System.out.println("Default Constructor: x = " + x + ", name = " + name);
        }

        // Parameterized constructor with one parameter
        ConstructorOverloading(int a) {
            x = a;
            name = "Unknown";
            System.out.println("One-parameter Constructor: x = " + x + ", name = " + name);
        }

        // Parameterized constructor with two parameters
        ConstructorOverloading(int a, String n) {
            x = a;
            name = n;
            System.out.println("Two-parameter Constructor: x = " + x + ", name = " + name);
        }

        public static void main(String[] args) {
            ConstructorOverloading obj1 = new ConstructorOverloading();
            ConstructorOverloading obj2 = new ConstructorOverloading(10);
            ConstructorOverloading obj3 = new ConstructorOverloading(20, "John");
        }
    }

