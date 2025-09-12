import java.util.*;
public class RemoveDuplicateChar {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String");
        String str = sc.nextLine();
        String st = str.toLowerCase();
        for (int i=0; i<st.length()-1;i++)
        {
            for(int j=1 ; j<st.length(); j++)
            {
                if(st.charAt(i)!=st.charAt(j))
                {

                }
            }
        }
    }
}