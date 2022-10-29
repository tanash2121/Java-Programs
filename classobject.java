public class classobject {
//float has complications
//her class is classobject
//her objects are name , age , ctc
//  void setname(datatype variable){// used to write a object or assign it, void doenot return anyting }
//void method_name(){}
//  String getname(){here data type of object must be given as_it_is or it will give an error}
//also get id used to read*** Return is used to print the things***
//syntax: - datatype method_name(datatype variable){}
    String name;
    int age;
    int ctc;

   classobject(int a, String b , int c)
    {
        this.name =b;
        this.age = a;
        this.ctc=c;
        }
        public void setname(String b)
        {
        this.name=b;
        }
        public String getname()
        {
            return (this.name);
        }
        void setname(int a)
        {
            this.age= a;
        }
         int getage()
         {
            return this.age;
         }
        void setctc(int c)
        {
            this.ctc= c;
        }
         int getctc()
         {
            return this.ctc;
         }
    
    
    
    
    public static void main(String[] args) {

      classobject bb= new classobject(1,"tanash", 4);
      System.out.println(bb.getname());
      System.out.println(bb.getage());
      System.out.println(bb.getctc());
    }
}
