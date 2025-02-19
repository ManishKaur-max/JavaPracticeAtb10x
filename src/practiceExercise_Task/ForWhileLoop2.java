package practiceExercise_Task;
import java.util.Scanner;

public class ForWhileLoop2 {
            public static void main(String[] args) {

            // 6. Print Numbers from 10 to 1 (Reverse Order)
            System.out.println("Numbers from 10 to 1 using for loop:");
            for (int i = 10; i >= 1; i--) {
                System.out.print(i + " ");
            }
            System.out.println();

            System.out.println("Numbers from 10 to 1 using while loop:");
            int j = 10;
            while (j >= 1) {
                System.out.print(j + " ");
                j--;
            }
            System.out.println();

            // 7. Calculate the sum of numbers from 1 to 100
            int sum = 0;
            for (int i = 1; i <= 100; i++) {
                sum += i;
            }
            System.out.println("Sum of numbers from 1 to 100 using for loop: " + sum);

            sum = 0;
            int k = 1;
            while (k <= 100) {
                sum += k;
                k++;
            }
            System.out.println("Sum of numbers from 1 to 100 using while loop: " + sum);

            // 8. Multiplication Table of a Given Number
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter a number for multiplication table: ");
            int num = scanner.nextInt();

            System.out.println("Multiplication table using for loop:");
            for (int i = 1; i <= 10; i++) {
                System.out.println(num + " x " + i + " = " + (num * i));
            }

            System.out.println("Multiplication table using while loop:");
            int m = 1;
            while (m <= 10) {
                System.out.println(num + " x " + m + " = " + (num * m));
                m++;
            }

            // 9. Factorial of a Number
            System.out.print("Enter a number for factorial: ");
            int factNum = scanner.nextInt();
            int factorial = 1;

            for (int i = 1; i <= factNum; i++) {
                factorial *= i;
            }
            System.out.println("Factorial using for loop: " + factorial);

            factorial = 1;
            int n = 1;
            while (n <= factNum) {
                factorial *= n;
                n++;
            }
            System.out.println("Factorial using while loop: " + factorial);

            // 10. Check if a Number is Prime
            System.out.print("Enter a number to check prime: ");
            int primeNum = scanner.nextInt();
            boolean isPrime = true;

            for (int i = 2; i <= primeNum / 2; i++) {
                if (primeNum % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            System.out.println(primeNum + " is " + (isPrime ? "a prime number" : "not a prime number"));

            // 12. Right-Angled Triangle
            System.out.println("Right-Angled Triangle:");
            for (int i = 1; i <= 5; i++) {
                for (int j1 = 1; j1 <= i; j1++) {
                    System.out.print("* ");
                }
                System.out.println();
            }

            // 13. Inverted Right-Angled Triangle
            System.out.println("Inverted Right-Angled Triangle:");
            for (int i = 5; i >= 1; i--) {
                for (int j1 = 1; j1 <= i; j1++) {
                    System.out.print("* ");
                }
                System.out.println();
            }

            // 14. Pyramid Pattern
            System.out.println("Pyramid Pattern:");
            for (int i = 1; i <= 5; i++) {
                for (int space = 5 - i; space > 0; space--) {
                    System.out.print(" ");
                }
                for (int star = 1; star <= (2 * i - 1); star++) {
                    System.out.print("*");
                }
                System.out.println();
            }

            // 15. Inverted Pyramid Pattern
            System.out.println("Inverted Pyramid Pattern:");
            for (int i = 5; i >= 1; i--) {
                for (int space = 5 - i; space > 0; space--) {
                    System.out.print(" ");
                }
                for (int star = 1; star <= (2 * i - 1); star++) {
                    System.out.print("*");
                }
                System.out.println();
            }

            scanner.close();
        }
    }

