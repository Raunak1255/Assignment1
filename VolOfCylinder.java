import java.util.*;
public class VolOfCylinder{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Radius: ");
        int radius = sc.nextInt();
        System.out.print("Enter Height: ");
        int height = sc.nextInt();
        
        float volumeOfCyl = 3.14f * (radius*radius) * height;
        System.out.print("Vol of Cylinder: "+ volumeOfCyl);

    }
}
