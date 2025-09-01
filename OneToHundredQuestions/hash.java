import java.util.*;
public class hash {
    public static void frag(String on ){
        String str1="",str2="";
        for(int i=0 ; i<on.length(); i++)
        {
            if(on.charAt(i)=='#')
            {
                str1=on.charAt(i)+str1;
            }
            else
            {
                str2+=on.charAt(i);
            }
        }

        System.out.println(str1+str2);
    }



    public static void main (String [] args)
    {
        Scanner b=new Scanner(System.in);
        System.out.print("Enter String ");
        String st=b.nextLine().trim();

        frag(st);

    }
}
