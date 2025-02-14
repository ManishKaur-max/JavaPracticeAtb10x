package practiceExercise_Task;

public class sortArrayWithoutFunction {
        public static void main(String[] args) {
            int[] numbers = {12, 34, 10, 1, 100, 3, 4, 32};

            // Bubble Sort Algorithm
            for (int i = 0; i < numbers.length - 1; i++) {
                for (int j = 0; j < numbers.length - 1 - i; j++) {
                    if (numbers[j] > numbers[j + 1]) {
                        // Swap the elements
                        int temp = numbers[j];
                        numbers[j] = numbers[j + 1];
                        numbers[j + 1] = temp;
                    }
                }
            }

            // Print sorted array
            for (int num : numbers) {
                System.out.print(num + " ");
            }
        }
}

