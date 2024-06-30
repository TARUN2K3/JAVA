/**
 * Merging_two_no_in_single_byte
 */
public class Merging_two_no_in_single_byte {

    public static void main(String[] args) {
        
        byte a = 10, b = 5 ;

        byte c;
        
        c = (byte)(a<<4);
        a = (byte)(c|b);

        System.out.println((c&0b11110000)>>4);
        System.out.println((c&0b00001111));
    }
}