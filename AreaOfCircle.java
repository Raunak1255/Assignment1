import java.util.*;
public class AreaOfCircle{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius : ");
        float radius = sc.nextInt();
      float area = 3.14f * radius * radius;
        System.out.print("Area of circle is: "+ area);
    }
}