import java.util.*;
import java.lang.*;
public class Area_of_Three_side_Triangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter First Side of Triangle :");
        int a=sc.nextInt();
        System.out.println("Enter Second Side of Triangle :");
        int b=sc.nextInt();
        System.out.println("Enter Third Side of Triangle :");
        int c=sc.nextInt();

        float s = (float)1/2*(a+b+c);
        float arr = (float)Math.sqrt(s*(s-a)*(s-b)*(s-c));
        System.out.println("The Area of Triangle is :"+arr);
    }
}
