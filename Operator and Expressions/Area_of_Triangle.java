import java.util.*;
import java.lang.*;

/**
 * Area_of_Triangle
 */
public class Area_of_Triangle {

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);

        System.out.println("Enter Height of Triangle :");
        int h=s.nextInt();
        System.out.println("Enter Base of the Triangle :");
        int b=s.nextInt();

        float arr=(float)1/2*b*h;

        System.out.println("The Area of Triangle is "+arr);
    }
}