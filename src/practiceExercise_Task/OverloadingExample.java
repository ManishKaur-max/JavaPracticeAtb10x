package practiceExercise_Task;

class MathOperations {
    // Method with two integer parameters
    int add(int a, int b) {
        return a + b;
    }

    // Overloaded method with three integer parameters
    int add(int a, int b, int c) {
        return a + b + c;
    }

    // Overloaded method with double parameters
    double add(double a, double b) {
        return a + b;
    }
}

public class OverloadingExample {
    public static void main(String[] args) {
        MathOperations math = new MathOperations();
        System.out.println(math.add(5, 10));       // Calls method with two int parameters
        System.out.println(math.add(5, 10, 15));   // Calls method with three int parameters
        System.out.println(math.add(5.5, 2.5));    // Calls method with double parameters
    }
}
