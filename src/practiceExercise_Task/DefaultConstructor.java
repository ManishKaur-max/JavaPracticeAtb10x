package practiceExercise_Task;

class DefaultConstructor {
    int x;

    // Default constructor
    DefaultConstructor() {
        x = 10;
        System.out.println("Default Constructor called. x = " + x);
    }

    public static void main(String[] args) {
        DefaultConstructor obj = new DefaultConstructor();
    }
}