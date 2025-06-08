public class QueueUsingArray {
    private int[] queue = new int[100];
    private int front = 0, rear = 0;

    public void enqueue(int data) {
        if (rear == 100) {
            System.out.println("Queue is full");
            return;
        }
        queue[rear++] = data;
    }

    public void dequeue() {
        if (front == rear) {
            System.out.println("Queue is empty");
            return;
        }
        System.out.println("Dequeued: " + queue[front++]);
    }

    public void display() {
        if (front == rear) {
            System.out.println("Queue is empty");
            return;
        }
        System.out.print("Queue: ");
        for (int i = front; i < rear; i++) {
            System.out.print(queue[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        QueueUsingArray q = new QueueUsingArray();
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.display();
        q.dequeue();
        q.display();
    }
}
