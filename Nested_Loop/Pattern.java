package Nested_Loop;

public class Pattern {
    public static void main(String[] args) {
/*         for(int i = 0;i<=5; i++ ){
            for(int j = 0;j<=i;j++ ){
                System.out.print(j+" ");
            }
            System.out.println(" ");
        }
Output            
0  
0 1  
0 1 2  
0 1 2 3  
0 1 2 3 4
0 1 2 3 4 5

        int count =0;
        for(int i = 0; i<=5; i++){
            for(int j=0;j<=i; j++){
                System.out.format("%02d ", ++count);
            }
            System.out.println(" ");
        }
        Output
01  
02 03
04 05 06
07 08 09 10
11 12 13 14 15
16 17 18 19 20 21

        for(int i = 1;i<=5;i++){
            for(int j = 1; j<=5-i+1;j++){
                System.out.print(j+" ");
            }
            System.out.println(" ");
        } 
Output
1 2 3 4 5  
1 2 3 4
1 2 3
1 2
1
        for(int i = 1;i<=5;i++){
            for(int j = 1; j<=5;j++){
                if(j>=i)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println(" ");
        }
Output
***** 
 ****
  ***
   **
    *

        for(int i = 1;i<=5;i++){
            for(int j = 1; j<=5;j++){
                if(i+j>5)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println(" ");
        }  
Output
         * 
        **
       ***
      ****
     *****  
*/   
        for(int i = 1;i<=5;i++){
            for(int j = 1; j<=5;j++){
                if(i+j>5)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            for(int x=0; x<=i-2;x++){
                    System.err.print("*");
                }
            System.out.println(" ");
        }
    }
}
