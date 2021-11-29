import java.util.*;
public class StudyPriorityQueue{
    public static void main(String args[]){
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        pq.offer(3);
        pq.offer(2);
        pq.offer(5);
        pq.offer(7);
        pq.offer(1);
        System.out.println(pq.toString()); // [1, 2, 5, 7, 3]

        System.out.println(pq.poll()); // 1
        System.out.println(pq.peek()); // 2

    }
}
