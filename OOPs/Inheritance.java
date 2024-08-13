package OOPs;

public class Inheritance {
    public static void main(String[] args) {
        Cuboid c = new Cuboid();
        c.breadth = 10;
        c.length = 9;
        c.height = 10;
        System.out.println("Area of Rectangle: " + c.areaOfRectangle());
        System.out.println("Perimeter of Rectangle: " + c.perimeterOfRectangle());
        System.out.println("Volume of Cuboid: " + c.volumeOfCuboid());
    }
}
class Rectangle {
    public int length;
    public int breadth;

    public int areaOfRectangle() {
        return length * breadth;
    }

    public int perimeterOfRectangle() {
        return 2 * (length + breadth);
    }
}

class Cuboid extends Rectangle {
    public int height;

    public int volumeOfCuboid() {
        return length * breadth * height;
    }
}
