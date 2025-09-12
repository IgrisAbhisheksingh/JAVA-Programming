import java.util.*;
public class LongestWord {

    public static void main(String [] args)
    {
        Scanner sc=new Scanner (System.in);
        System.out.print("Enter a String: ");
        String s=sc.nextLine();
      int count=0,max=0;
        for(int i= 0 ; i<s.length(); i++)
        {
            if(s.charAt(i)==' ')
            {
                count=0;
            }
            count++;
            if(max<count)
            {
                max=count-1;
            }

        }
        System.out.print("The Longest Word "+ max);

    }
}
