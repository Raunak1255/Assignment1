import java.util.*;
public class CelsiusToFahrenheit{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Celsius: ");
        double Celsius = sc.nextInt();
        double Fahrenheit = (Celsius * 9/5) + 32;
        System.out.print("Celsius to Fahrenheit: " + Fahrenheit);
    }
}