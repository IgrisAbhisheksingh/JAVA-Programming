import java.util.*;
public class GST {
    public static void main(String [] args )
    {
      Scanner sc=new Scanner (System.in);
      float pencil=sc.nextFloat();
      float pen = sc.nextFloat();
      float eraser= sc.nextFloat();
      float result=((pencil+pen+eraser)*18)/100;
      System.out.println("the total amount " + result);
    }
}
