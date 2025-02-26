package practiceExercise_Task;
import java.util.Scanner;

public class ifElse4 {


        // 22) Check if a Number is Divisible by 5 and 11
        public static void checkDivisibility(int num) {
            if (num % 5 == 0 && num % 11 == 0) {
                System.out.println(num + " is divisible by both 5 and 11.");
            } else {
                System.out.println(num + " is not divisible by both 5 and 11.");
            }
        }

        // 23) Convert Days into Years, Months, and Days
        public static void convertDays(int totalDays) {
            int years = totalDays / 365;
            int remainingDays = totalDays % 365;
            int months = remainingDays / 30;
            int days = remainingDays % 30;

            System.out.println(totalDays + " days = " + years + " years, " + months + " months, and " + days + " days.");
        }

        // 24) Determine the Type of Website Based on Domain
        public static void checkWebsiteType(String url) {
            if (url.endsWith(".com")) {
                System.out.println("The website type is: Commercial website");
            } else if (url.endsWith(".org")) {
                System.out.println("The website type is: Non-profit organization");
            } else if (url.endsWith(".edu")) {
                System.out.println("The website type is: Educational institution");
            } else if (url.endsWith(".gov")) {
                System.out.println("The website type is: Government website");
            } else if (url.endsWith(".net")) {
                System.out.println("The website type is: Network-related website");
            } else if (url.endsWith(".info")) {
                System.out.println("The website type is: Informational website");
            } else {
                System.out.println("The website type is: Unknown or other types of websites");
            }
        }

        // 25) Find if a Person is Senior Citizen Based on Age
        public static void checkAgeCategory(int age) {
            if (age >= 0 && age <= 12) {
                System.out.println("Category: Child");
            } else if (age >= 13 && age <= 19) {
                System.out.println("Category: Teenager");
            } else if (age >= 20 && age <= 64) {
                System.out.println("Category: Adult");
            } else if (age >= 65) {
                System.out.println("Category: Senior Citizen");
            } else {
                System.out.println("Invalid age input.");
            }
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // 22) Check divisibility
            System.out.print("Enter a number to check divisibility by 5 and 11: ");
            int num = scanner.nextInt();
            checkDivisibility(num);

            // 23) Convert Days into Years, Months, and Days
            System.out.print("Enter the number of days: ");
            int days = scanner.nextInt();
            convertDays(days);

            // 24) Determine Website Type
            System.out.print("Enter a website URL: ");
            String url = scanner.next();
            checkWebsiteType(url);

            // 25) Check Age Category
            System.out.print("Enter age to check category: ");
            int age = scanner.nextInt();
            checkAgeCategory(age);

            scanner.close();
        }
    }

