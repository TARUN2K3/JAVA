package String_class_and_Printing;

public class String_Methods {
    // Find if email id i son gmail
    public static void main(String[] args) {
        
        String str = "tarunsharma2k3@gamil.com";
        int i = str.indexOf("@");
        String Username = str.substring(0, i);
        String Domain = str.substring(i+1);
        System.out.println("Domain "+Domain);
        System.out.println("Username "+Username);
        System.out.println(Domain.startsWith("gamil"));
    }    
}
