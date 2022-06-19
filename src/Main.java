import java.util.*;

public class Main {
    public static void main(String[] args) {
        //test1();
        //test2();
        //test3();
        test4();
    }

    private static void test1() {
     List<Integer> nums = new ArrayList<>(List.of(1,1,2,3,4,5,5,6,7));
     for(Integer i : nums){
         if(Objects.nonNull(i) && i % 2 == 1){
             System.out.println(i);
         }
     }
    }

    private static void test2 (){
      List<Integer> nums = new ArrayList<>(List.of(1,1,2,3,4,5,5,6,7));
      Set<Integer> set = new TreeSet<>();
        for(Integer i : nums){
            if(Objects.nonNull(i) && i % 2 == 0){
                set.add(i);
            }
        }
        for(Integer i : set){
            System.out.println(i);
        }
    }

    private static void test3(){
        List<String> nums = List.of("alex","lex","maria","zed","nova","asd","nova");
        System.out.println(new HashSet<>(nums));
    }

    private static void test4(){
        List<String> nums = List.of("alex","lex","maria","zed","nova","asd","nova","lex");
        Map<String,Integer> result = new HashMap<>();
        for (String st : nums){
            if(result.containsKey(st)){
                result.put(st,result.get(st)+1);
            }else {
                result.put(st,1);
            }
        }
        for (Map.Entry<String,Integer> entry: result.entrySet()){
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }
    }
}