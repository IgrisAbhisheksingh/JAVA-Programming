public class FloydTriangle {


    public static void main(String[] args) {
        int x = 5;
        int j = 0;
        for (int i = 1; i <= x; i++) {

            for (int k = 1; k <= i; k++) {
                j +=1;
                System.out.print(" " +j);
            }
            System.out.println();
        }

    }


}



