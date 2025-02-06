import java.util.*;
public class convertKmToMiles{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
            System.out.print("Enter Distance in KM: ");
            int Kilometers = sc.nextInt();
            
            double Miles = Kilometers * 0.621371;
            System.out.print("Distance in Miles = "+  Miles);
    }
}