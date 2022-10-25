public class pattern6 {
    public static void main(String[] args) {
        /*
     *
    * *
   * * *
  * * * *
 * * * * *
         */
        int size=5;

        for (int i = 1; i <= size; i++) 
        {
            for (int k = size; k > i; k--)
             {
               System.out.print(" "); 
             }
            for (int j = 1; j <= i; j++) 
            {
            System.out.print(" *");
            }
        System.out.println();
        }
    }
}
 class pattern7 {
    public static void main(String[] args) {
        /*
        
 * * * * *
  * * * *
   * * *
    * *
     *
         */
        int size=5;

        for (int i = size; i >0; i--) 
        {
            for (int k = size; k > i; k--)
             {
               System.out.print(" "); 
             }
            for (int j = 1; j <= i; j++) 
            {
            System.out.print(" *");
            }
        System.out.println();
        }
    }
}
