package practiceExercise_Task;
import java.util.Scanner;

public class ifElse2 {

    // 6) Find the Largest of Three Numbers
    public static int findLargest(int a, int b, int c) {
        return Math.max(a, Math.max(b, c));
    }

    // 7) Find the Smallest of Two Numbers
    public static int findSmallestTwo(int a, int b) {
        return Math.min(a, b);
    }

    // 8) Find the Smallest of Three Numbers
    public static int findSmallestThree(int a, int b, int c) {
        return Math.min(a, Math.min(b, c));
    }

    // 9) Check if a Year is a Leap Year
    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    // 10) Calculate Grade Based on Marks
    public static void calculateGrade(int marks) {
        if (marks < 0 || marks > 100) {
            System.out.println("Invalid marks. Enter a value between 0 and 100.");
            return;
        }

        String grade;
        if (marks >= 90) {
            grade = "A+";
        } else if (marks >= 80) {
            grade = "A";
        } else if (marks >= 70) {
            grade = "B";
        } else if (marks >= 60) {
            grade = "C";
        } else if (marks >= 50) {
            grade = "D";
        } else if (marks >= 40) {
            grade = "E";
        } else {
            grade = "Fail";
        }

        System.out.println("Grade: " + grade);
    }

    // 11) Check if a Character is an Alphabet
    public static boolean isAlphabet(char ch) {
        return Character.isLetter(ch);
    }

    // 12) Check if a Number is Prime
    public static boolean isPrime(int num) {
        if (num <= 1) return false;
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) return false;
        }
        return true;
    }

    // 13) ATM Withdrawal Simulation
    public static void atmWithdrawal(int amount, int balance) {
        if (amount <= 0) {
            System.out.println("Invalid amount. Enter a positive value.");
        } else if (amount % 100 != 0) {
            System.out.println("Invalid amount. Enter multiples of 100.");
        } else if (amount > balance) {
            System.out.println("Insufficient balance.");
        } else {
            balance -= amount;
            System.out.println("Withdrawal successful. Remaining balance: ₹" + balance);
        }
    }

    // 14) Check if a Triangle is Valid
    public static boolean isValidTriangle(int a, int b, int c) {
        return (a + b > c) && (a + c > b) && (b + c > a);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 6) Find the Largest of Three Numbers
        System.out.print("Enter three numbers to find the largest: ");
        int a = scanner.nextInt(), b = scanner.nextInt(), c = scanner.nextInt();
        System.out.println("Largest number: " + findLargest(a, b, c));

        // 7) Find the Smallest of Two Numbers
        System.out.print("Enter two numbers to find the smallest: ");
        a = scanner.nextInt(); b = scanner.nextInt();
        System.out.println("Smallest number: " + findSmallestTwo(a, b));

        // 8) Find the Smallest of Three Numbers
        System.out.print("Enter three numbers to find the smallest: ");
        a = scanner.nextInt(); b = scanner.nextInt(); c = scanner.nextInt();
        System.out.println("Smallest number: " + findSmallestThree(a, b, c));

        // 9) Check if a Year is a Leap Year
        System.out.print("Enter a year to check if it's a leap year: ");
        int year = scanner.nextInt();
        System.out.println(year + (isLeapYear(year) ? " is a Leap Year" : " is NOT a Leap Year"));

        // 10) Calculate Grade Based on Marks
        System.out.print("Enter marks to determine grade: ");
        int marks = scanner.nextInt();
        calculateGrade(marks);

        // 11) Check if a Character is an Alphabet
        System.out.print("Enter a character to check if it's an alphabet: ");
        char ch = scanner.next().charAt(0);
        System.out.println(ch + (isAlphabet(ch) ? " is an Alphabet" : " is NOT an Alphabet"));

        // 12) Check if a Number is Prime
        System.out.print("Enter a number to check if it's prime: ");
        int num = scanner.nextInt();
        System.out.println(num + (isPrime(num) ? " is a Prime Number" : " is NOT a Prime Number"));

        // 13) ATM Withdrawal Simulation
        int balance = 10000;
        System.out.print("Enter amount to withdraw: ₹");
        int amount = scanner.nextInt();
        atmWithdrawal(amount, balance);

        // 14) Check if a Triangle is Valid
        System.out.print("Enter three sides of a triangle: ");
        a = scanner.nextInt(); b = scanner.nextInt(); c = scanner.nextInt();
        System.out.println("Triangle is " + (isValidTriangle(a, b, c) ? "Valid" : "NOT Valid"));

        scanner.close();
    }
}
