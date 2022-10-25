public class pattern1 {
    
    public static void main(String[] args) {
/*
*****
*****
*****
*****
  
 */
    for (int i = 1; i <= 4; i++) // rows = 4
    {
        for(int j =1 ;j <=5;j++)// colums =5
        {
            System.out.print("*");
        }
    System.out.println();
     }
    }
}
/*

*
**
***
**** 

*/
 class pattern2 {
public static void main(String[] args) {
    
    for (int i = 1; i <= 4; i++) // rows = 4
    {
        for(int j =1 ;j <=i;j++)// colums = i
        {
            System.out.print("*");
        }
    System.out.println();
     }
}
    
}

class pattern3{

    public static void main(String[] args){
/* 
   *
  **
 ***
****
 */
        int size =4;
        for (int i = 1; i <= size; i++) {
            for (int k =size; k>i; k--) {
                System.out.print(" ");
            }
            for (int j = 1; j <=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
class pattern4{
    public static void main(String[] args){
/*
*****
****
***
**
* 
 */
int size = 5;
        for (int i = 1; i <= size; i++) 
        {
            for (int j = size; j >= i; j--) {
                System.out.print("*");
            }
            System.out.println();
         }
    }
}
class pattern5{
    public static void main(String[] args){
/*

*****
 ****
  ***
   **
    *
 */
int size = 5;
        for (int i = size; i >= 1; i--) 
        {
            for (int k =size ; k > i ; k--)
            {
               System.out.print(" ");
            }
            for (int j =1; j <= i; j++)
             {
                System.out.print("*");
             }
            System.out.println();
         }
    }
}