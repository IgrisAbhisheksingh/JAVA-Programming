import java.util.*;
public class Palindrome {

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
      System.out.print("Enter a String: ");
      String s=sc.nextLine();
      int flag=0;
      int i=0,j=s.length()-1;
      while(i<j)
      {
          if(s.charAt(i)!=s.charAt(j))
          {
              flag=1;
              break;
          }

          i++;
          j--;
      }
      if(flag==1)
      {
          System.out.print("This Is not a palindrome");
      }
      else
      {
          System.out.print("This is a Palindrome");
      }
    }
}
