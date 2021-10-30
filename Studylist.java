import java.util.*;

public class Studylist{
    public static void main(String args[]){
        List<Integer> list = new ArrayList<>();

        List<Integer> list2 = new LinkedList<>();

        list.add(2); //추가
        list.add(3);
        list.add(1);

        list2.add(4); //추가
        list2.add(6);
        list2.add(5);

        System.out.println(list.toString()); //[3,3,1]
        System.out.println();
        System.out.println(list2.toString()); //[4,6,5]
        System.out.println();

        Collections.sort(list);
        Collections.sort(list2);

        System.out.println(list.toString()); //[1,2,3]
        System.out.println();
        System.out.println(list2.toString()); //[4,5,6]
        System.out.println();

        Collections.sort(list, (o1,o2)->o2.compareTo(o1));
        Collections.sort(list2, (o1,o2)->o2.compareTo(o1));

        System.out.println(list.toString()); //[3,2,1]
        System.out.println();
        System.out.println(list2.toString()); //[6,5,4]
        System.out.println();

        list.remove(1);
        list2.remove(1);

        System.out.println(list.toString()); //[3,1]
        System.out.println();
        System.out.println(list2.toString()); //[6,4]
        System.out.println();


        List<Integer> list3 = new LinkedList<>();

        list3.add(1);
        list3.add(2);
        list3.add(3);
        list3.add(4);
        list3.add(4);
        list3.add(5);

        System.out.println(list3.toString()); // 1,2,3,4,4,5
        System.out.println(list3.indexOf(4)+" "+ list3.lastIndexOf(4)); // 3 4
        System.out.println(list3.indexOf(6)); // -1


    }
}