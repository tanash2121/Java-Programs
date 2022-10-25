import java.util.HashSet;
import java.util.jar.Manifest;

public class hashset {
    public static void main(String[] args) {
       
        //has Doesnot Contains Duplicate values

    HashSet <String> hashset = new HashSet<>();
    HashSet <String> hashset1 = new HashSet<>();
    hashset.add("a");
    hashset.add("b");
    hashset.add("d");
    hashset.add("d");

    System.out.println(hashset);//abd (d) will not get printed 
 
    Boolean a = hashset.add("a");//boolean will check weather its true or false
  
    System.out.println(a);//false --> Duplicates value is not allowed
  
    hashset1.add("1");//1 add
 
    hashset1.addAll(hashset);//hashset will be empty and all elements will be in hashset1
  
    System.out.println(hashset1);//1abd
  
    hashset1.remove("1");//1 is removed from hashset1
  
    for(String i :hashset1){
 
        System.out.println(i);//abd 
 
    }
    Boolean b =  hashset1.contains("1");
    System.out.println(b);//false
}
}
