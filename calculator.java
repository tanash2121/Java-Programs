import java.util.*;
public class calculator {
   

  public static void main(String[] args) {
     
    	
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Operator that you have to perform  number");
        String day= sc.nextLine();// /
        System.out.println("Enter the first number");
        int a= sc .nextInt();//10
         System.out.println("Enter the Second number");
        int b= sc .nextInt();//5
       
        
    switch (day) {
      case "+":
  				int c= a+b;
    		    System.out.println("Addtition== "+c);
        		break;
      case "-":
                 int e= a-b;
    		    System.out.println("Subtraction== "+e);
        		break;
      case "*":
      int f= a*b;
      System.out.println("Multiplication == "+f);
      break;
      case "/":
      int g= a/b;
      System.out.println("Divide== "+g);
      break;
      case "%":
      int z= a%b;
      System.out.println("Remender== "+z);
      break;
  
        default:
        		System.out.println("adhi maths skhikun yee");
                break;
    }
  }
}


