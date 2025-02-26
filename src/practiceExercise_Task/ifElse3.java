package practiceExercise_Task;
import java.util.Scanner;

public class ifElse3 {

        // 15) Check if a Number is a Palindrome
        public static boolean isPalindrome(int num) {
            int original = num, reversed = 0;
            while (num > 0) {
                int digit = num % 10;
                reversed = reversed * 10 + digit;
                num /= 10;
            }
            return original == reversed;
        }

        // 16) Check if a Number is an Armstrong Number
        public static boolean isArmstrong(int num) {
            int original = num, sum = 0, digits = 0, temp = num;

            while (temp > 0) {
                temp /= 10;
                digits++;
            }

            temp = num;
            while (temp > 0) {
                int digit = temp % 10;
                sum += Math.pow(digit, digits);
                temp /= 10;
            }
            return sum == original;
        }

        // 17) Check if a Person is Eligible for a Loan
        public static void checkLoanEligibility(int age, double salary, int creditScore) {
            if (age < 18 || age > 80) {
                System.out.println("Loan Denied: Age should be between 18 and 80.");
                return;
            }
            if (salary < 30000) {
                System.out.println("Loan Denied: Salary should be at least 30,000.");
                return;
            }
            if (creditScore < 650 || creditScore > 850) {
                System.out.println("Loan Denied: Credit score should be between 650 and 850.");
                return;
            }
            System.out.println("Loan Approved!");
        }

        // 18) Electricity Bill Calculation
        public static double calculateBill(int units) {
            double bill = 0;
            if (units <= 100) {
                bill = units * 0.50;
            } else if (units <= 200) {
                bill = (100 * 0.50) + ((units - 100) * 0.75);
            } else if (units <= 300) {
                bill = (100 * 0.50) + (100 * 0.75) + ((units - 200) * 1.20);
            } else {
                bill = (100 * 0.50) + (100 * 0.75) + (100 * 1.20) + ((units - 300) * 1.50);
            }
            return bill;
        }

        // 19) Calculate Bonus Based on Salary and Experience
        public static double calculateBonus(double salary, int experience) {
            if (experience < 1) return 0;
            if (experience >= 1 && experience <= 3) return salary * 0.05;
            if (experience >= 4 && experience <= 6) return salary * 0.10;
            return salary * 0.15;
        }

        // 20) Calculate Employee Net Salary (Basic Pay, HRA, DA, Tax)
        public static double calculateNetSalary(double basicPay) {
            double hra = basicPay * 0.20; // 20% of basic
            double da = basicPay * 0.10;  // 10% of basic
            double grossSalary = basicPay + hra + da;
            double tax = grossSalary * 0.10; // 10% tax
            return grossSalary - tax;
        }

        // 21) Check if a Person Can Travel Based on Visa and Age
        public static void checkTravelEligibility(int age, boolean hasValidVisa) {
            if (age >= 18 && hasValidVisa) {
                System.out.println("Person is eligible to travel.");
            } else {
                System.out.println("Person is not eligible to travel.");
            }
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // 15) Palindrome Check
            System.out.print("Enter a number to check if it's a palindrome: ");
            int num = scanner.nextInt();
            System.out.println(isPalindrome(num) ? "Palindrome" : "Not a Palindrome");

            // 16) Armstrong Number Check
            System.out.print("Enter a number to check if it's an Armstrong number: ");
            num = scanner.nextInt();
            System.out.println(isArmstrong(num) ? "Armstrong Number" : "Not an Armstrong Number");

            // 17) Loan Eligibility Check
            System.out.print("Enter age: ");
            int age = scanner.nextInt();
            System.out.print("Enter salary: ");
            double salary = scanner.nextDouble();
            System.out.print("Enter credit score: ");
            int creditScore = scanner.nextInt();
            checkLoanEligibility(age, salary, creditScore);

            // 18) Electricity Bill Calculation
            System.out.print("Enter electricity units consumed: ");
            int units = scanner.nextInt();
            System.out.println("Total Bill: Rs. " + calculateBill(units));

            // 19) Bonus Calculation
            System.out.print("Enter salary: ");
            salary = scanner.nextDouble();
            System.out.print("Enter years of experience: ");
            int experience = scanner.nextInt();
            System.out.println("Bonus: Rs. " + calculateBonus(salary, experience));

            // 20) Employee Net Salary Calculation
            System.out.print("Enter basic salary: ");
            double basicSalary = scanner.nextDouble();
            System.out.println("Net Salary: Rs. " + calculateNetSalary(basicSalary));

            // 21) Travel Eligibility Check
            System.out.print("Enter age for travel check: ");
            age = scanner.nextInt();
            System.out.print("Do you have a valid visa? (true/false): ");
            boolean hasValidVisa = scanner.nextBoolean();
            checkTravelEligibility(age, hasValidVisa);

            scanner.close();
        }
    }

