package LearningCode3._07Map集合;


import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Demo2 {
    public static void main(String[] args) {
        Map<Character, Integer> maps = new HashMap<>();
        String s = "shakjhdkahk";
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (maps.containsKey(ch)) {
                maps.put(ch, maps.get(ch) + 1);
            } else {
                maps.put(ch, 1);
            }
        }
        System.out.println(maps);

    }
}
