import java.util.*;
public class AvgOfNumbers{
public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter n1: ");
    int num1 = sc.nextInt();
    System.out.print("Enter n2: ");
    int num2 = sc.nextInt();
    System.out.print("Enter n3: ");
    int num3 = sc.nextInt();
    
    int average = (num1+num2+num2)/3;
    
    System.out.print("Average of 3 numbers = " + average);
}
}