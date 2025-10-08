import java.util.*;
public class HashMove {


    public static void main (String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a String :");
        String s=sc.nextLine();
        int count=0;
        String ans="";
        for(int i=0 ; i< s.length(); i++)
        {
           if(s.charAt(i)=='#')
           {
               count++;
           }
        }
        for(int i =0 ; i<count; i++)
        {
            ans=ans +'#';
        }
        for(int i =0 ; i<s.length(); i++)
        {
            if(s.charAt(i)!='#')
            {
                ans=ans + s.charAt(i);
            }
        }
        System.out.print("After Moving # "+ ans);
    }
}
