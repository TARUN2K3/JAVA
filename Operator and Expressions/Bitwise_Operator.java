public class Bitwise_Operator {
    public static void main(String[] args) {
        
        int a = 0b1010;
        int b = 0b1110;
        int z;
        int x;
        int y;
        int p;
        int q;
        int r;

        z=a & b;
        x=a | b;
        y=a ^ b;
        p=a >> 1;
        q=a << 1;
        r=a >>> 2;


        System.out.println("AND "+z);
        System.out.println("OR "+x);
        System.out.println("XOR "+y);
        System.out.println("Right Shift "+p);
        System.out.println("Left Shift "+q);
        System.out.println("Unsigned  Right Shift "+r);
        System.out.println(Integer.toBinaryString(a));
        System.out.println(Integer.toBinaryString(p));


    }
    
}
