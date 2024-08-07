package OOPs;

public class Constructor {
    public static void main(String[] args) {
        Rectangle r = new Rectangle(10, 20);

        System.out.println("Area: " + r.area());
        System.out.println("Perimeter: " + r.perimeter());
    }
}

class Rectangle {
    private double length;
    private double breadth;

    // Getter for length
    public double getLength() {
        return length;
    }

    // Getter for breadth
    public double getBreadth() {
        return breadth;
    }

    // Setter for length
    public void setLength(double l) {
        length = l;
    }

    // Setter for breadth
    public void setBreadth(double b) {
        breadth = b;
    }

    // Default constructor
    public Rectangle() {
        length = 1;
        breadth = 1;
    }

    // Parameterized constructor
    public Rectangle(double l, double b) {
        setLength(l);
        setBreadth(b);
    }

    // Method to calculate area
    public double area() {
        return length * breadth;
    }

    // Method to calculate perimeter
    public double perimeter() {
        return 2 * (length + breadth);
    }
}
