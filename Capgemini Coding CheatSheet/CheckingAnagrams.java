import java.util.Scanner;

public class CheckingAnagrams {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two  String: ");
        String s = sc.nextLine();
        String p=sc.nextLine();
        int count=1;
        int x=s.length();

        for(int i=0 ; i<s.length(); i++)
        {
            for(int j=0 ; j< p.length(); j++)
            {
                if(s.charAt(i)==p.charAt(j))
                {
                    count+=1;
                    break;
                }
            }
        }
        if(x==count)
        {
            System.out.print("The is a Anagram");
        }
        else {
            System.out.print("The is not a Anagram");
        }
    }
}
