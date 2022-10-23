import java.util.*;
class factorial {
    //factorial for 5
    public static void main(String[] args) {
        int fact = 1 ,num = 5;
        for (int i = 1; i <=num; i++) {
            fact = fact *i;
        }
        System.out.println(fact);
    }
}
