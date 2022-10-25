import java.util.*;
public class treeset {
    public static void main(String[] args) {
        //TreeSet will not include Duplicate Elements as well as 
        //Format of sorting elements in assending order[ Number>Capital Letter >Small Letters]
        TreeSet <String> tree = new TreeSet<>();
        tree.add("C");
        tree.add("A");
        tree.add("C");
        tree.add("B");
        tree.add("9");
        tree.add("Z");
        tree.add("a");

        System.out.println(tree);
      
        int size =tree.size();//calculate the size of tree
        System.out.println(size);//6
        
        tree.remove("Z");//remving Z
        for (String i : tree) {
           
            System.out.println("Elements are "+ i);//9ABCa
        }
    }
}
