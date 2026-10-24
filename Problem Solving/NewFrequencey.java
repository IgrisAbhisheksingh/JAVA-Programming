import java.util.*;
public class NewFrequencey {









        public static void main(String[] args) {
            String s = "aabbbbccccc";

            Map<Character, Integer> map = new LinkedHashMap<>();

            for (int i = 0; i < s.length(); i++) {
                char ch = s.charAt(i);
                map.put(ch, map.getOrDefault(ch, 0) + 1);
            }

            for (int i = 0; i < map.size(); i++) {
                char ch = (char) map.keySet().toArray()[i];
                System.out.print(ch + "" + map.get(ch));
            }
        }
    }





