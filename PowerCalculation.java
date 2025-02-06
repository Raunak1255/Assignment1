import java.util.*;

public class PowerCalculation {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Base: ");
        int base = sc.nextInt();
        System.out.print("Enter Exponent: ");
        int exponent = sc.nextInt();

        double square = Math.pow(base, exponent);

        System.out.print(square);
    }
}