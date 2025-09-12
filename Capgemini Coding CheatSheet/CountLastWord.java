import java.util.*;
public class CountLastWord {
    public static int Word(String str)
    {
        String s=str.trim();
        int count=0;

            for(int i =s.length()-1 ; i>=0; i--)
            {
                if(s.charAt(i)!=' ')
                {
                    count++;
                }
                else
                {
                    break;
                }

            }
        return count;

    }




    public static void main(String [] args )
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter A String : ");
        String str=sc.nextLine();
        int result=Word(str);
        System.out.print("The Last Word :" + result);
    }
}
