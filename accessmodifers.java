


//1.public class can bee accessed by class , package, subclass, world
//Please refer file modifiers.java
 public class accessmodifers {

    int x= 10;
    
    public void display()
    {
    System.out.println("using public method "+x);
    }
  
    private void display1()
    {
        System.out.println("using private in it"+x);
    }
     void display2()
    {
        System.out.println("using Non_modifier in it"+x);
    }
    protected void display3()
    {
        System.out.println("using protected method it"+x);
    }
   
    }
//2.no modifer class default modifer it can only access class and package 
class accessmodifers1{
  private int  x= 10;
  int y=10;
  protected int z =122;
    
    public void display()
    {
    System.out.println("using public in it"+x);
    }
  
    private void display1()
    {
        System.out.println("using private in it"+x);
    }
     void display2()
    {
        System.out.println("using Non-Modidfier  in it"+x);
    }
    protected void display3()
    {
        System.out.println("using protected method it"+x);
    }
    public static void main(String[] args) {
        accessmodifers1 acc1 = new accessmodifers1();
        acc1.display1();////accessable to only its won class --> private in it10
    }
}
class sagar{
    public static void main(String[] args) {
        accessmodifers1 x = new accessmodifers1();
        x.display();//accessable to subclass -->using public in it10
        //x.display1();error because it not accessiable to subclass 
        x.display2();//accessable to subclass-->using Non-Modidfier  in it10
        x.display3();//accessable to subclass-->using protected method it10
    }
}