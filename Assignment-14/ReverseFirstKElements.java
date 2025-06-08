import java.util.*;

public class ReverseFirstKElements {

    public static Queue<Integer> reverseKElements(Queue<Integer> queue, int k) {
        if (queue == null || k > queue.size() || k < 0) {
            throw new IllegalArgumentException("Invalid value of k");
        }

        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < k; i++) {
            stack.push(queue.poll());
        }

        while (!stack.isEmpty()) {
            queue.add(stack.pop());
        }

        int size = queue.size();
        for (int i = 0; i < size - k; i++) {
            queue.add(queue.poll());
        }

        return queue;
    }

    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);

        int k = 3;
        Queue<Integer> result = reverseKElements(q, k);

        System.out.print("Modified Queue: ");
        while (!result.isEmpty()) {
            System.out.print(result.poll() + " ");
        }
    }
}
