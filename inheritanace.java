public class inheritanace {
    
int age =10;
String gender="male";
String name ="tanash";

 void setname(String gender,String name,int age){
    this.age=age;
    this.name=name;
    this.gender=gender;
}
public String getname(){
    return("In the Base class (Parent class) Name : "+this.name +"&  Gender :"+ this.gender);
}
inheritanace(){
    System.out.println("In the Base class (Parent class) age is ="+this.age);
}

    }
class inhe extends inheritanace{
    int sal =1000;
    public static void main(String[] args) {
       inhe in = new inhe();
       in.setname("Male", "Tanash" , 20);
       System.out.println(in.getname());
       System.out.println("Salary Is SubClass(Child Class)"+in.sal);
    }
} 

