import java.util.*;
public class Studyset {

    public static void main(String args[]){
        Set<Integer> set = new HashSet<>(); //중복 X

        set.add(1);
        set.add(2);
        set.add(3);
        set.add(1);
        set.add(2);
        set.add(3);

        System.out.println(set.toString()); //[1, 2, 3]

        set.remove(1);

        System.out.println(set.toString()); // [2, 3]

        set.add(1);
        set.add(5);
        set.add(4);

        System.out.println(set.toString()); //[1, 2, 3, 4, 5] hashmap 넣은 순서 보장 x

        Set<Integer> set2 = new LinkedHashSet<>();

        set2.add(1);
        set2.add(2);
        set2.add(3);
        set2.add(1);
        set2.add(2);
        set2.add(3);

        set2.remove(1);

        set2.add(1);
        set2.add(5);
        set2.add(4);

        System.out.println(set2.toString()); //[2, 3, 1, 5, 4] LinkedHashSet 넣은 순서 보장 

        List<Integer> list = new ArrayList<>(set2);

        Collections.sort(list);

        System.out.println(list.toString()); // [1, 2, 3, 4, 5]

        for(Integer i : set2){ // 반복 값 출력 2 3 1 5 4 
            System.out.print(i+" "); 
        }
    }
    
}
