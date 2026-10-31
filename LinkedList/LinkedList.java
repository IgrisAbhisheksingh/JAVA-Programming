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
    public static void delFi(){

        if(head==null){
            return;
        }
        if(head==tail){
            head=tail=null;

        }
        else {
            head = head.next;
        }
    }

    public static void addFi(int data){
        Node p=new Node(data);
        if(head==null) {
            head = tail = p;
        }
        else{
            p.next=head;
            head=p;
        }

    }

    public static void display(){
        Node  temp=head;
        while(temp!=null){
            System.out.print(temp.data +" -> ");
            temp=temp.next;
        }
    }


    public static void main(String[] args){
        add(10);
        add(13);
        add(15);
        add(55);
        addFi(25);

        delFi();
        display();

    }
}
