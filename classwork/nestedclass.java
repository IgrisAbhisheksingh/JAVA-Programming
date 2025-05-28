class Outer {
    int a = 50;

    void access() {
        System.out.println("outer class msg");
    }

    void display() {
        class Inner {
            int b = 30;

            void inDisplay() {
                access();
                System.out.println("a = " + a);
                System.out.println("b = " + b);
                System.out.println("hello inner class");
            }
        }

        Inner i = new Inner();
        System.out.println("inner class var = " + i.b);
        i.inDisplay();
    }
}

class Mainnested {
    public static void main(String[] args) {
        Outer o = new Outer();
        o.display();
    }
}
