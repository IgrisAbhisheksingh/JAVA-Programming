class Array {
    public static void main(String args[]) {
        int a[] = new int[5];
        a[0] = 10;
        a[1] = 4;
        a[2] = 5;
        a[3] = 67;
        a[4] = 9;

        System.out.println("Number of elements in array = " + a.length);

        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}
