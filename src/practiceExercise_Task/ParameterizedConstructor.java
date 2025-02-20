package practiceExercise_Task;

class ParameterizedConstructor {
    int x;

    // Parameterized constructor
    ParameterizedConstructor(int value) {
        x = value;
        System.out.println("Parameterized Constructor called. x = " + x);
    }

    public static void main(String[] args) {
        ParameterizedConstructor obj = new ParameterizedConstructor(50);
    }
}
