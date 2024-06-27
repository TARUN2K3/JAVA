import java.util.Scanner;

public class Total_Area_of_Cuboid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter The Length of the Cuboid :");
        int l = sc.nextInt();
        System.out.println("Enter The Breadth of the Cuboid :");
        int b = sc.nextInt();
        System.out.println("Enter The Height of the Cuboid :");
        int h = sc.nextInt();

        float t_arr = (float)2*(l*b+b*h+h*l);
        System.out.println("Total Area of Cuboid is "+t_arr);
        float v_arr = l*b*h;
        System.out.println("Volume of Cuboid is "+v_arr);

    }
}
