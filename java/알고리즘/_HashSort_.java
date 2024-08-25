import java.util.*;

/* 별도 리스트를 이용한 value 분류
public class _HashSort_ {
    public static void main(String[] args) {
        Map<String , Integer> table1 = new HashMap<>();
        table1.put("apple" , 4);
        table1.put("banana" , 25);
        table1.put("crab" , 32);
        table1.put("dragonfruits" , 1);

        List<Integer> number_table = new ArrayList<>(table1.values());
        number_table.sort(Integer::compareTo);
        for (Integer val : number_table) {
            System.out.println(val);
        }
    }
}
 */

/* TreeSet을 이용한 key 값 정렬 (value값 정렬은 불가능함)
public class _HashSort_ {
    public static void main(String[] args) {
        Comparator<String> comparator = (s1 , s2) -> s1.compareTo(s2);
        Map<String , Character> table1 = new TreeMap<>(comparator);
        table1.put("apple" , 'd');
        table1.put("banana" , 'c');
        table1.put("crab" , 'b');
        table1.put("dragonfruits" , 'a');

        for (Map.Entry<String , Character> entry : table1.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

    }
}
 */

public class _HashSort_ {
    public static void main(String[] args) {
        Map<String , Character> table1 = new TreeMap<>();
        table1.put("apple" , 'd');
        table1.put("banana" , 'c');
        table1.put("crab" , 'b');
        table1.put("dragonfruits" , 'a');
    }
}