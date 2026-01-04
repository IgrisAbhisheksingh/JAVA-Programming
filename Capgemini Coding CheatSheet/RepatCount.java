import java.util.*;
public class RepatCount {


    public static void main( String[] args)

    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a String ");
        String str=sc.nextLine();
        StringBuilder sb = new StringBuilder();

        HashMap<Character, Integer> map = new HashMap<>();

          
        for (char ch : str.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        // build result
        StringBuilder result = new StringBuilder();

        for (char ch : str.toCharArray()) {
            if (map.containsKey(ch)) {
                int count = map.get(ch);
                result.append(ch);
                if (count > 1) {
                    result.append(count);
                }
                map.remove(ch);
            }
        }

        System.out.println(result);
    }
}
