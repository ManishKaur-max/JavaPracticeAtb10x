package practiceExercise_Task;

    class Animal {
        void sound() {
            System.out.println("Animals make sounds");
        }
    }

    // Child class overriding the sound() method
    class Dog extends Animal {
        @Override
        void sound() {
            System.out.println("Dog barks");
        }
    }

    public class OverridingExample {
        public static void main(String[] args) {
            Animal myAnimal = new Animal();
            myAnimal.sound(); // Calls parent class method

            Animal myDog = new Dog();
            myDog.sound(); // Calls overridden method in Dog class
        }
    }

