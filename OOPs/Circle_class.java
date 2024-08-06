package OOPs;

public class Circle_class {
        public static void main(String[] args) {
            circle c1 = new circle();

            c1.radius = 5;
        
            System.out.println("Area of Circle :" + c1.area());
            System.out.println("Area of Circle :" + c1.perimeter());
            System.out.println("Area of Circle :" + c1.circumference());
    }
}
class circle{

    public double radius;

    public double area(){
        return Math.PI*Math.pow(radius, 2);
    }

    public double perimeter(){
        return 2*Math.PI*radius;
    }

    public double circumference(){
        return perimeter();
    }
    
}
