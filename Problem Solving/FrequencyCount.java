import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FrequencyCount {







        public static void main(String [] args){
            Scanner sc= new Scanner(System.in);
            System.out.println("Enter the Strings:  ");
            String x=sc.nextLine();
            Map<Character,Integer> mp=new HashMap<>();
            System.out.println("Total Frequency of every alphabet");
            for(int i=0 ; i<x.length();i++){
                char ch=x.charAt(i);
                if(mp.containsKey(ch)){
                    mp.put(ch,mp.get(ch)+1);

                }

                else {
                    mp.put(ch,1);
                }
            }
            System.out.print(mp);
        }
    }







