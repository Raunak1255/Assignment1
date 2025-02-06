import java.util.*;
public class SimpleInterest{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Principal: ");
        int P = sc.nextInt();
        System.out.print("Enter Rate: ");
        int R = sc.nextInt();
        System.out.print("Enter Time: ");
        int T = sc.nextInt();
        
        
        int SI = (P*R*T)/100;
        System.out.println("SI =  "+ SI);
    }
}