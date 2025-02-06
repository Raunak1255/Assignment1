// 2> Write a program that takes two numbers as input from the user and prints their sum.

import java.util.*;

public class AddTwoNumbers {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st number: ");
        int a = sc.nextInt();
        System.out.print("Enter 2nd number: ");
        int b = sc.nextInt();
        int sum = a + b;
        System.out.print("Sum of 1st & 2nd numbers is: " + sum);
    }
}
