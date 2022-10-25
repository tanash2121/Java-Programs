import java.util.*;

public class queue {
//Queue is fifo structure element first will get poped firs
    public static void main(String[] args) {
        Queue <String> que = new PriorityQueue<>();
        que.add("america");
        que.add("sttst");
        que.add("uhd");
System.out.println(que);
que.remove();    
System.out.println(que);

que.poll();
System.out.println(que);

que.add("ds");
System.out.println(que);

}
}
