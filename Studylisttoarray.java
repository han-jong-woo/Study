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

        
        // 1. mapToInt에 메서드 참조를 이용하는 방법
        int[] b = Arrays.stream(arr2).mapToInt(Integer::intValue).toArray();
        
        // 2. mapToInt에 람다식을 이용하는 방법 
        int[] c = Arrays.stream(arr2).mapToInt(i -> i).toArray();

		int[] array = {1, 2, 3, 4};
        Integer[] b2 = Arrays.stream(array).boxed().toArray(Integer[]::new);

		System.out.println(b.getClass().getSimpleName()); // int[]
		System.out.println(Arrays.toString(b)); //[1, 2, 3, 4]

		System.out.println(c.getClass().getSimpleName()); //int[]
		System.out.println(Arrays.toString(c)); //[1, 2, 3, 4]

		System.out.println(b2.getClass().getSimpleName()); //Integer[]
		System.out.println(Arrays.toString(b2)); //[1, 2, 3, 4]
    }
}
