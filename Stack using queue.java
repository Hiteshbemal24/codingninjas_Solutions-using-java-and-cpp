import java.util.LinkedList;
import java.util.Queue;

public class Solution {
    static class Stack {
        Queue<Integer> queue;

        public Stack() {
            this.queue = new LinkedList<Integer>();
        }

        /*----------------- Public Functions of Stack -----------------*/

        public int getSize() {
            return queue.size();
        }

        public boolean isEmpty() {
            return queue.isEmpty();
        }

        public void push(int element) {
            int size = queue.size();
            queue.add(element);

            // Rotate the elements within the queue so that the newly pushed element is at the front
            for (int i = 0; i < size; i++) {
                queue.add(queue.poll());
            }
        }

        public int pop() {
            if (isEmpty()) {
                return -1; // Return -1 to indicate an empty stack or choose another value as needed
            }
            return queue.poll();
        }

        public int top() {
            if (isEmpty()) {
                return -1; // Return -1 to indicate an empty stack or choose another value as needed
            }
            return queue.peek();
        }
    }
}
