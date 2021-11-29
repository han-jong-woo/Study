import java.util.*;

public class StudyStack {
    public static void main(String args[]){
        Stack<Integer> stack = new Stack<>();
        
        stack.push(1); //추가
        stack.add(2);  //추가

        System.out.println(stack.toString()); // [1, 2]

        System.out.println(stack.peek()); //  최상위 값 2
        System.out.println(stack.pop()); // 최상위값 꺼내고 반환 2

        System.out.println(stack.toString()); // [1]

        System.out.println(stack.isEmpty()); // 비어있는지 체크 
        System.out.println(stack.search(2)); // 인덱스 반환 //없으면 -1
        stack.clear(); // 전체 비우기 
        System.out.println(stack.toString()); // []
    }
}
