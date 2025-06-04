import java.util.*;
public class weekday {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("0 for exit ");
        while (true) {
            System.out.println("Enter day no :");
            int a = sc.nextInt();
            switch(a){
                case 0:
                    System.out.println("Exiting... Goodbye!");
                    System.exit(0);
                case 1 : System.out.println("SUNDAY"); break;
                case 2 : System.out.println("MONDAY"); break;
                case 3 : System.out.println("TUESDAY"); break;
                case 4 : System.out.println("WEDNESDAY"); break;
                case 5 : System.out.println("THURSDAY"); break;
                case 6 : System.out.println("FRIDAY"); break;
                case 7 : System.out.println("SATURDAY"); break;

                default :System.out.println("invalid input PLEASE enter a number between 1 to 7");
            }

        }
    }
}
