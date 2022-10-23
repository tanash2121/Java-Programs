import java.util.*;

class Plaindrome{

public static void main(String [] args){

int num=1221;
int rem=0;
int result =0;
int value=num;
while(num > 0){
rem = num%10;
result=result*10+rem;
num=num/10;

}
System.out.println(result);
if(result==value){

System.out.println("is Palindrome");
}else
{
System.out.println("is not a palindrome");}

}
}












