package String_class_and_Printing;

public class Regular_Expression {
    public static void main(String[] args) {
        // Find the Number is Binary or NOt
        int b = 0b1010;
        String str = b+"";
        System.out.println(str.matches("[01]*"));

        // Find the Number is Hexa-Decimal or NOt

        String h = "3F7A9C";
        System.out.println(h.matches("[A-F0-9]*"));




    }
}
