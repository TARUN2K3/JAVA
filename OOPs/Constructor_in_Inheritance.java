package OOPs;

public class Constructor_in_Inheritance {
    public static void main(String[] args) {
        Cuboid c = new Cuboid(1, 1, 1);
        System.out.println("Area of Rectangle: " + c.areaOfRectangle());
        System.out.println("Perimeter of Rectangle: " + c.perimeterOfRectangle());
        System.out.println("Volume of Cuboid: " + c.volumeOfCuboid());
    }
}

class Rectangle {

    int length;
    int breadth;

    // Default constructor
    Rectangle() {
        length = 1;
        breadth = 1;
    }

    // Parameterized constructor
    Rectangle(int l, int b) {
        length = l;
        breadth = b;
    }

    int areaOfRectangle() {
        return length * breadth;
    }

    int perimeterOfRectangle() {
        return 2 * (length + breadth);
    }
}

class Cuboid extends Rectangle {

    int height;

    // Default constructor
    Cuboid() {
        super(); // Initializes length and breadth to 1 using Rectangle's default constructor
        height = 1;
    }

    // Parameterized constructor for height only
    Cuboid(int h) {
        super(); // Initializes length and breadth to 1 using Rectangle's default constructor
        height = h;
    }

    // Parameterized constructor for length, breadth, and height
    Cuboid(int l, int b, int h) {
        super(l, b); // Calls Rectangle's parameterized constructor
        height = h;
    }

    int volumeOfCuboid() {
        return length * breadth * height;
    }
}
