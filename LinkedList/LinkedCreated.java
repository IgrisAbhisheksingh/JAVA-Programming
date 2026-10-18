class  LinkedCreated {
    public static void display(Node head){
        if(head==null)
            return;
        display(head.next);
        System.out.print(head.data +" ");



    }
    public static int len(Node head){
        Node temp=head;
        int count=0;
        while(temp!=null){
            count++;
            temp=temp.next;
        }
        return count;
    }

    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    public static void main(String[] args) {
        Node a = new Node(5);
        Node b = new Node(15);
        Node c = new Node(25);
        Node d = new Node(35);

        a.next = b;
        b.next = c;
        c.next = d;

        // Loop through the list using a temporary node
        display(a);
        System.out.println();
        System.out.println(len(a));

    }
}