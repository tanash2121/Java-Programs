public class constructor {
    /*
    A constructor in Java is a special method that is used to initialize objects. 
    The constructor is called when an object of a class is created.
    Constructor has same name Class_name 
    two types parameterized(1 or more parameter) and non parameterized(empty) constructors
    this is used to access the parameter, if we use same object to get parameters the compiler wil get confused
     */

     int para;
     int para1;
     int para2;
     int para3=1;

     constructor(int para,int para1,int para2 )
     //parameterized constructrotr
     {

        //para=para;//compiler will get confued and will return nulll
        this.para=para;
        this.para1=para1;
        this.para2=para2;
     }
     constructor(int a,int b){
//this.object = acccess is used to access parameters from the constructors
       this.para=a;
       //if object and the parameter doesnot have same name as object it can access parameters in constructors
        para1=b;
        
        para2=10;//here 10 is constsnat no need to declare 
     }
     constructor()//emty constructor or default constructor 
     {

        this.para=10;
        this.para1=18;
         this.para2=190;
      }

      int vloume(){
        return para*para1*para3;
      }
      int voloume(){
        return para*para1*para2;
      }

     public static void main(String[] args) {
        constructor cons = new constructor(1,2,4);
        int b = cons.para;
        System.out.println(b+","+cons.para1+","+cons.para2 );//1,2,4
       
        constructor cons1 = new constructor();
        int c = cons1.voloume();
        System.out.println(c);//34200
        int z=cons1.para;
        System.out.println(z+","+cons1.para1+","+cons1.para2);//10,18,190
       
        constructor cons2 = new constructor(10,20);
        int d = cons2.vloume();
        System.out.println(d);//10*20*1=200
        

     }

}
