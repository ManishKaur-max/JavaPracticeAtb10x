package practiceExercise_Task;
import java.util.Scanner;

public class ifElse1 {

        // 1) Check if a Number is Positive or Negative
        public static void checkPositiveNegative(int num) {
            if (num > 0) {
                System.out.println(num + " is a Positive Number.");
            } else if (num < 0) {
                System.out.println(num + " is a Negative Number.");
            } else {
                System.out.println("The number is Zero.");
            }
        }

        // 2) Check if a Number is Even or Odd
        public static void checkEvenOdd(int num) {
            if (num % 2 == 0) {
                System.out.println(num + " is an Even Number.");
            } else {
                System.out.println(num + " is an Odd Number.");
            }
        }

        // 3) Find the Maximum of Two Numbers
        public static int findMax(int a, int b) {
            return Math.max(a, b);
        }

        // 4) Check if a Character is a Vowel or Consonant
        public static void checkVowelConsonant(char ch) {
            ch = Character.toLowerCase(ch); // Convert to lowercase for easy comparison
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                System.out.println(ch + " is a Vowel.");
            } else if (Character.isLetter(ch)) {
                System.out.println(ch + " is a Consonant.");
            } else {
                System.out.println(ch + " is not a valid letter.");
            }
        }

        // 5) Check if a Person is Eligible to Vote (Age Check)
        public static void checkVotingEligibility(int age) {
            if (age >= 18) {
                System.out.println("You are eligible to vote.");
            } else {
                System.out.println("You are NOT eligible to vote.");
            }
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // 1) Check if a Number is Positive or Negative
            System.out.print("Enter a number to check if it's positive or negative: ");
            int num = scanner.nextInt();
            checkPositiveNegative(num);

            // 2) Check if a Number is Even or Odd
            System.out.print("Enter a number to check if it's even or odd: ");
            num = scanner.nextInt();
            checkEvenOdd(num);

            // 3) Find the Maximum of Two Numbers
            System.out.print("Enter two numbers to find the maximum: ");
            int a = scanner.nextInt(), b = scanner.nextInt();
            System.out.println("Maximum number: " + findMax(a, b));

            // 4) Check if a Character is a Vowel or Consonant
            System.out.print("Enter a character to check if it's a vowel or consonant: ");
            char ch = scanner.next().charAt(0);
            checkVowelConsonant(ch);

            // 5) Check if a Person is Eligible to Vote
            System.out.print("Enter your age to check voting eligibility: ");
            int age = scanner.nextInt();
            checkVotingEligibility(age);

            scanner.close();
        }
    }

