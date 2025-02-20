package practiceExercise_Task;

import java.util.Scanner;

public class ForWhileLoop1 {
    public static void main(String[] args) {
        //1 Print numbers from 1 to 10

        for (int i = 1; i <= 10; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        int i1=1;
        while (i1 <= 10) {
            System.out.print(i1 + " ");
            i1++;
        }
        System.out.println();
        //2 Print even numbers from 1 to 20
        for (int i = 2; i <= 20; i += 2) {
            System.out.print(i + " ");
        }
        System.out.println();
        int i2 = 2;
        while (i2 <= 20) {
            System.out.print(i2 + " ");
            i2 += 2;
        }
        //3 Print hello 5 times
        System.out.println();
        for (int i = 1; i <= 5; i++) {
            System.out.println("Hello");
        }

        //Print Java 5 times
        System.out.println();
        int i3=1;
        while (i3<=5){
            System.out.println("Java");
            i3++;
        }

        //4 Print the sum of first 10 natural numbers
        System.out.println();
         int sum = 0;
         for (int i = 1; i <= 10; i++) {
          sum += i;
        }
        System.out.println("Sum = " + sum);
        System.out.println();
         int i4 = 1, sum1= 0;
         while (i4 <= 10) {
            sum1 += i4;
            i4++;
         }
         System.out.println("Sum for while = " + sum1);

        //5 Print the multiplication table of 5
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a number for multiplication table: ");
        int mnum= s.nextInt();

        System.out.println();
        for (int i = 1; i <= 10; i++) {
            System.out.println( mnum + " x " + i + " = " + (mnum * i));
        }
        System.out.println();
        int i5 = 1;
        while (i5 <= 10) {
            System.out.println("7 x " + i5 + " = " + (7 * i5));
            i5++;
        }
    }
}
