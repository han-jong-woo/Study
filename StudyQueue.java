import java.util.*;

public class StudyQueue {
    public static void main(String args[]){
        Queue<Integer> queue = new LinkedList<>();

        queue.add(1); // 추가 
        queue.offer(2); //추가

        System.out.println(queue.peek()); // 최상위 값 반환 //1
        System.out.println(queue.poll()); // 최상위 값 제거 후 반환 //1

        System.out.println(queue.toString()); //[2]
        queue.remove(); // 제거 

        System.out.println(queue.toString()); // []

        System.out.println(queue.isEmpty()); // 비어있는지 체크  true


    }
}
