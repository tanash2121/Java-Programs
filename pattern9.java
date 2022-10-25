public class pattern9 {
    public static void main(String[] args) {
        
        /*
     *
    * *
   * * *
  * * * *
 * * * * *
  * * * *
   * * *
    * *
     *    Diamond
         */
      
         int m = 5;
        for (int i = 1; i <= m; i++) {
            for (int k = m; k > i; k--) {
                System.out.print(" ");               
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(" *");
            }
            System.out.println();
        }
        for (int i = m-1; i >0; i--) {
            for (int k = m; k > i; k--) {
                System.out.print(" ");               
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(" *");
            }
            System.out.println();
        }
    }
}
class pattern10{
    public static void main(String[] args) {
        /*
*
**
***
****
*****
****
***
**
*
right arrow          
         */
        int m = 5;
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i =1; i <=m; i++) {
            for (int j = m; j > i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
 class pattern11{
    public static void main(String[] args) {
        /*
         
    *
   **
  ***
 ****
*****
 ****
  ***
   **
    *
      left arrow    
         */
        int m = 5;
        for (int i = 1; i <= m; i++) {
            for (int k = m; k>i ; k--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = m-1; i > 0; i--) {
            for (int k = m; k>i ; k--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
 }