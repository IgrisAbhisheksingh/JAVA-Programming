import java.util.*;
public class FrequenceyCount {



    public static void main(String [] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the String:  ");
        String x=sc.nextLine();
        Map<Character,Integer> mp=new HashMap<>();
        System.out.println("Enter Arrays");
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
