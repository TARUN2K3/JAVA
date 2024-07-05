package Nested_Loop;

public class Printing_Number {
    /*public static void main(String[] args) {
        for(int i=1;i<=5;i++){
            for(int j=1;j<=5;j++)
            {
                System.out.print(j);
            }
            System.out.println();
        }
    }
    Output
12345
12345
12345
12345
12345
    public static void main(String[] args) {
        for(int i=1;i<=5;i++){
            for(int j=1;j<=5;j++)
            {
                System.out.print(i);
            }
            System.out.println();
        }
    }
        Output
11111
22222
33333
44444
55555  

    public static void main(String[] args) {
        for(int i=1;i<=5;i++){
            for(int j=1;j<=5;j++)
            {
                System.out.print(i+j+" ");
            }
            System.out.println(" ");
        }
    } 
        Output
2 3 4 5 6  
3 4 5 6 7
4 5 6 7 8
5 6 7 8 9
6 7 8 9 10*/
    public static void main(String[] args) {
        int count = 0;
        for(int i=1;i<=5;i++){
            for(int j=1;j<=5;j++)
            {
                System.out.format("%02d ", ++count);
            }
            System.out.println(" ");
        }
    } 
}
