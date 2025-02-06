import java.util.*;
public class PerimeterOfRec{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Length: ");
        int length = sc.nextInt();
        System.out.print("Enter Width: ");
        int width = sc.nextInt();
        
        int perimeterOfRec = 2 * (length+width);
        System.out.println("Perimeter of Rectangle =  "+ perimeterOfRec);
    }
}
