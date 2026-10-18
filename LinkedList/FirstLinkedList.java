public class FirstLinkedList {


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
            Node temp = a;
            while (temp != null) {
                System.out.println(temp.data);
                temp = temp.next;
            }
        }
    }
