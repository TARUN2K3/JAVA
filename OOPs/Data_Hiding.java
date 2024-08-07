package OOPs;
public class Data_Hiding {
    public static void main(String[] args) {
        rectangle r = new rectangle();

        r.setlength(10);  
        r.setbreadth(20);

        System.out.println(r.area());
        System.out.println(r.perimeter());
        System.out.println(r.getlength());
        System.out.println(r.getbreadth());
    }
}
class rectangle{

    private double length;
    private double breadth;

    public double area(){
        return length*breadth; // or we can use return getlength()*getbreadth();
    }
    public double perimeter(){
        return 2*(length+breadth);
    }

    public double getlength(){ // get and set method are used in data hiding
        return length;
    }
    public double getbreadth(){
        return breadth;
    }
    public void setlength(double l){
        length = l;
    }
    public void setbreadth(double b){
        breadth = b;
    }
}
