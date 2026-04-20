import java.util.*;
public class TwoStackQueue {




        static class Queue {
            Stack<Integer> s1 = new Stack<>(); // input stack
            Stack<Integer> s2 = new Stack<>(); // output stack

            public boolean isEmpty() {
                return s1.isEmpty() && s2.isEmpty();
            }

            // Enqueue (O(1))
            public void add(int data) {
                s1.push(data);
            }

            // Dequeue
            public int remove() {
                if (isEmpty()) {
                    System.out.println("Queue is empty");
                    return -1;
                }

                if (s2.isEmpty()) {
                    while (!s1.isEmpty()) {
                        s2.push(s1.pop());
                    }
                }

                return s2.pop();
            }

            // Peek
            public int peek() {
                if (isEmpty()) {
                    System.out.println("Queue is empty");
                    return -1;
                }

                if (s2.isEmpty()) {
                    while (!s1.isEmpty()) {
                        s2.push(s1.pop());
                    }
                }

                return s2.peek();
            }
        }

        public static void main(String[] args) {
            Queue q = new Queue();

            q.add(1);
            q.add(2);
            q.add(3);

            while (!q.isEmpty()) {
                System.out.println(q.peek());
                q.remove();
            }
        }
    }

