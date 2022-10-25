import java.util.*;

public class stack {
    public static void main(String[] args) {
        //Stack :- its like a book of set int structured 
        //Last book will be peeked first So,
        //Stack runs on LIFO feature.
       
        Stack <String> stack = new Stack<>();
        stack.push("abcd");
        stack.push("cd");
        stack.push("cdf");

        Stack <Integer> stc = new Stack<>();
        stc.push(2);
        stc.push(25);
        stc.push(23);
        stc.push(22);
        stc.push(12);


        for (String string : stack) {
            System.out.println(string);
        }

        String  a =stack.pop();
        System.out.println("Last Elements Poped ="+a+"  {remaining stack is "+stack);

        int b= stc.peek();
        System.out.println("Peak Elements menas top is  ="+b+"  {remaining stack is "+stc);

    
    }
}
