import java.util.*;
public class hashmap {
    public static void main(String[] args) {
//Sorting According to the values 
//used in Database formats id_emp  and name_emp
        HashMap<String, Integer> map = new HashMap<>();

    map.put("Tanash",21);
    map.put("atharva", 23);
    map.put("A", 2);
    map.put("a", 3);

    for (String string : map.keySet()) 
    {
    System.out.println("Key Here is ="+string );
    }

    if (map . containsKey("a")) {
        System.out.println("yes" );
    }
    if (map . containsValue(21)) {
        System.out.println("yes" +map.get("a"));
    }
    
    map.remove("A");
    System.out.println(map);

    }
}
