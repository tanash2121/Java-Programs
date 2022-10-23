import java.util.*;

class month{

public static void main(String[] args){
System.out.println("enter the days ");
Scanner sc = new Scanner(System.in);
int i = sc.nextInt();
int res;
if(i<30){

System.out.println("Its not a month till now its day number "+ i);

}else if(i==30){

System.out.println("Its  month ");

}else if(i>30 && i<90){
res = i-30;
System.out.println("Its  month Plus Extra days number is "+ res);

}else if(i==90){

System.out.println("Its 3 months ");


}else if(i>90 && i<180){
    res = i-90;
System.out.println("Its 3  month Plus Extra days number is "+ res);

}else if(i==180){

System.out.println("Its 6 months ");


}
else if(i>180 && i<365){
    res = i-180;
System.out.println("Its 6 month Plus Extra days number is "+ res);

}else if(i==366 ||i==365){
    
System.out.println("Its 1 year ");

}else{
    System.out.println("value is extra than year");
}

}
}

