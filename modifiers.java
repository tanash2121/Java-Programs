 class modifiers {
   /*
   Please refer file modifiers.java
   modifiers | class  | Package | subclass | World |
   Public    | yes    | Yes     | Yes      |yes    |
   Protected | yes    | Yes     | Yes      |No    |
Non Modifier | yes    | Yes     | NO       | NO   |
   Private   | yes    | No      | No       |NO   |
   
   */ 
    public static void main(String[] args) {
        accessmodifers acc = new accessmodifers();
        acc.display();//using public method 10
        //acc.display1();--> error because the method ids made private
       acc.display2();//using Non-Modidfier  in it10
        acc.display3();//using protected method it10
        System.out.println(acc.x);//10
       
accessmodifers1 acc1 = new accessmodifers1();
        System.out.println("acc1.x is not accessable because it is private");
        System.out.println(acc1.y);
        System.out.println(acc1.z);
       
    }
}
