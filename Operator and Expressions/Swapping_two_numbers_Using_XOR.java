public class Swapping_two_numbers_Using_XOR {
    public static void main(String[] args) {
        int a = 9, b = 12;
        System.out.println("a $ b Value before swapping "+ a +" , "+ b);

        a = a^b;
        b = a^b;
        a = a^b;

        System.out.println("a $ b Value after swapping "+ a +" , "+ b);
    }
}
