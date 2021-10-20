import java.util.*;

public class Studyarray{
    public static void main(String args[]){
        int[] array = {0,0,0,0};
        int[] array2 = new int[4];
        
        System.out.println(Arrays.toString(array)); //[0, 0, 0, 0]
        System.out.println(Arrays.toString(array2)); //[0, 0, 0, 0]

        Arrays.fill(array2, 100);
        System.out.println(Arrays.toString(array2)); //[100, 100, 100, 100]

        int[] array3= {10,20,40,30,100,50};

        Arrays.sort(array3);
        System.out.println(Arrays.toString(array3)); //[10, 20, 30, 40, 50, 100] 오름차순 정렬

        Integer[] array4= {10,20,40,30,100,50}; 

        Arrays.sort(array4,Collections.reverseOrder()); //int 불가 Integer 가능
        System.out.println(Arrays.toString(array4)); //[100, 50, 40, 30, 20, 10] 오름차순 정렬


    }
}