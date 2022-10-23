import java.util.*;
public class atm {
    
    public static void main(String[] args) {
        int i =1;
        System.out.println("Enter the pin ");
        Scanner sc = new Scanner(System.in);
        
     while (i<=3)
     {
        int pin = sc.nextInt();
        int old = 1234;
        if(pin==old)
        {
          System.out.println();
          System.out.println("Welcome to the Atm machine");
          System.out.println();
          System.out.println("Enter 1 to Check Balance ");
          System.out.println("Enter 2 For Credit ");
          System.out.println("Enter 3 For Debit ");

          int bal =1000;
          int res;
          int key = sc.nextInt();
            switch (key) {
                case 1:System.out.println("Your Acoount balance is "+bal);
                break;
                case 2:
                System.out.println("Enter the amount you want Credit  ");
                int cre = sc.nextInt();
                res = bal+cre;
                System.out.println("Your Acoount balance is "+res);
                break;
                case 3:
                System.out.println("Enter the amount you want Debit  ");
                int deb = sc.nextInt();
                res = bal-deb;
                if (res<0)
                {
                System.out.println("Oooo... Bodske Bete --> Bhag yha see ");
                break;
                }
                System.out.println("Your Acoount balance After Debit is "+res);
                break;
                default:
                System.out.println("Entered invalid key ");
                break;
                        }           
              break;  
        }else if(i==3)
        {
            System.out.println("Atm card has been Blocked ");
            break;
        }else
        {
            int c =3-i;
            System.out.println("you have only "+c+" Attempts  remaining After 3 Attempts card will get blocked");
        }
       i++;

         }

    }
}
