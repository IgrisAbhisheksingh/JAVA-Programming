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
        int temp=p;
        while(temp!=null){
            System.out.print(p.data)
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
