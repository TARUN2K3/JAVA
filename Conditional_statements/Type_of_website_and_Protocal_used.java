package Conditional_statements;

class Type_of_website_and_Protocol_used {
    public static void main(String[] args) {
        String str = "https://tarunsharmaig.netlify.app";
        String protocol = str.substring(0, str.indexOf(":"));
        
        if (protocol.equals("https")) {
            System.out.println("Website Protocol is HTTPS");
        } else if (protocol.equals("ftp")) {
            System.out.println("Website Protocol is FTP");
        } else {
            System.out.println("Unknown Protocol");
        }

        String type = str.substring(str.lastIndexOf(".") + 1);

        if (type.equals("com")) {
            System.out.println("Commercial Website");
        } else if (type.equals("net")) {
            System.out.println("Network website");
        } else if (type.equals("gov")) {
            System.out.println("Government website");
        } else if (type.equals("org")) {
            System.out.println("Organization website");
        } else if (type.equals("edu")) {
            System.out.println("Educational website");
        } else {
            System.out.println("Unknown website type");
        }
    }   
}
