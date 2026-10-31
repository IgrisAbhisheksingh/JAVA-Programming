public class LinkedList {
    public static class Node{
        int data;
        Node next;
         public Node(int data){
             this.data=data;
             this.next=null;
         }

    }

    public static Node head;
    public static Node tail;
    public static void add(int data){
        Node p=new Node(data);
        if(head==null){
            head=tail=p;
            return;
        }
        tail.next=p;
        tail=p;
    }

    public static void display(){
        int temp=head;
        while(temp!=null){
            System.out.print(head.data);
            head=head.next;
        }
    }


    public static void main(String[] args){
        add(10);
        add(13);
        add(15);
        add(55);
        display();

    }
}
