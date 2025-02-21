package practiceExercise_Task;
//Inheritance is a mechanism in Java where one class acquires the properties and behaviors of another class. The class that is inherited is called the parent (superclass), and the class that inherits is called the child (subclass). It helps in code reusability and hierarchical classification.
class Animals {
    void eat() {
        System.out.println("This animal eats food");
    }
}

// Child class inheriting from Animal
class Dogs extends Animals {
    void bark() {
        System.out.println("Dog barks");
    }
}

public class InheritanceExample {
    public static void main(String[] args) {
        Dogs myDog = new Dogs();
        myDog.eat(); // Inherited method from Animal class
        myDog.bark(); // Own method of Dog class
    }
}
