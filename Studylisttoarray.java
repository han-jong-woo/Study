import java.util.*;
public class Studylisttoarray {
    public static void main(String args[]){
        Integer arr[] = {1,2,3,4}; // 배열 생성
		
	
		ArrayList<Integer> list = new ArrayList<>(Arrays.asList(arr)); 	// 배열을 List로 변환
		
		System.out.println(list.toString()); //[1, 2, 3, 4]

		System.out.println();
		
        Integer[] arr2;
		arr2 = list.toArray(new Integer[list.size()]);// List를 배열로 변환
		
		System.out.println(Arrays.toString(arr2)); //[1, 2, 3, 4]

    }
}
