package day04;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class demoHashMap {
    public static void main(String[] args) {
        HashMap<Student,String> hashMap = new HashMap<>();
        hashMap.put(new Student("jian","44"),"地球");
        hashMap.put(new Student("jian1","12"),"火星");
        hashMap.put(new Student("jian2","12"),"木星");
        hashMap.put(new Student("jian3","12"),"月球");
        Set<Map.Entry<Student, String>> entries = hashMap.entrySet();
        for (Map.Entry<Student, String> entry : entries) {
            System.out.println(entry.getKey().getName()+"来自"+entry.getValue());
        }
    }
}
