import java.util.*;

public class Studymap{
    public static void main(String args[]){
        Map<String,Integer> hm = new HashMap<>();

        hm.put("test1", 90); //값 넣기
        hm.put("test4", 88);
        hm.put("test3", 100);
        hm.put("test2", 70);

        System.out.println(hm.toString()); //{test4=88, test2=70, test3=100, test1=90}

        List<String> keySet = new ArrayList<>(hm.keySet());

        Collections.sort(keySet); //키로 오름차순 
        for(String key:keySet){
            System.out.println(key+" "+hm.get(key));
            //test1 90
            //test2 70
            //test3 100
            //test4 88
        }
        System.out.println();
        Collections.sort(keySet,(o1,o2)->o2.compareTo(o1)); //키로 내림차순 
        for(String key:keySet){
            System.out.println(key+" "+hm.get(key));
            //test4 88
            //test3 100
            //test2 70
            //test1 90
        }

        System.out.println();
        Collections.sort(keySet,(o1,o2)->hm.get(o1).compareTo(hm.get(o2))); //value로 오름차순 
        for(String key:keySet){
            System.out.println(key+" "+hm.get(key));
            //test2 70
            //test4 88
            //test1 90
            //test3 100
        }


        System.out.println();
        Collections.sort(keySet,(o1,o2)->hm.get(o2).compareTo(hm.get(o1))); //value로 내림차순 
        for(String key:keySet){
            System.out.println(key+" "+hm.get(key));
            //test3 100
            //test1 90
            //test4 88
            //test2 70
        }

        hm.remove("test3"); //key 삭제

        System.out.println(hm.toString()); //{test4=88, test2=70, test1=90}

        hm.put("test3",90);

        System.out.println(hm.toString());

        List<String> key = new ArrayList<>(hm.keySet()); //value 큰순서 + 값은 값일 경우 문자 순서 역순 
        Collections.sort(key,new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if(hm.get(o2).compareTo(hm.get(o1))==0){
                    return o2.compareTo(o1);
                }else{
                    return hm.get(o2).compareTo(hm.get(o1));
                }
            }
            
        });

        for(int i=0; i<key.size(); i++){
            System.out.println("key "+ key.get(i)+" value "+hm.get(key.get(i)));
        }


        if(hm.containsKey("test4")){ //test4 exist
            System.out.println("test4 exist");
        }else{
            System.out.println("test4 not exist");
        }

        if(hm.containsKey("test3")){ //test3 not exist
            System.out.println("test3 exist");
        }else{
            System.out.println("test3 not exist");
        }

        if(hm.containsValue(100)){ //value 100 not exist
            System.out.println("value 100 exist");
        }else{
            System.out.println("value 100 not exist");
        }

        if(hm.containsValue(88)){ //value 88 exist
            System.out.println("value 88 exist");
        }else{
            System.out.println("value 88 not exist");
        }

    }
}