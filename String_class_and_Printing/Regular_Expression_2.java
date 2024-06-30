package String_class_and_Printing;


public class Regular_Expression_2 {
    public static void main(String[] args) {
        /* Remove Special Character From String
        String str="Awe52%$8_2-h*()hsuysb";


        str = str.replaceAll("[^A-Za-z0-9]","");

        System.out.println(str);
        */

        // Remove Extra Space form String

        String str = "w  wy28  72    536  3893";

        str = str.replaceAll("\\s+","");
        System.out.println(str);
    }
}



