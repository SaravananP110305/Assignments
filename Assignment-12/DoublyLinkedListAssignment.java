import java.util.Scanner;

class Node {
    int data;
    Node prev, next;

    Node(int data) {
        this.data = data;
        this.prev = null;
        this.next = null;
    }
}

public class DoublyLinkedListAssignment {
    Node head = null;

    public void createList(int n, Scanner sc) {
        for (int i = 0; i < n; i++) {
            System.out.print("Enter value for node " + (i + 1) + ": ");
            int val = sc.nextInt();
            insertAtEnd(val);
        }
    }

    public void insertAtBeginning(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
    }

    public void insertAtEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != null)
                temp = temp.next;

            temp.next = newNode;
            newNode.prev = temp;
        }
    }

    public void insertAtPosition(int data, int position) {
        if (position == 1) {
            insertAtBeginning(data);
            return;
        }

        Node newNode = new Node(data);
        Node temp = head;

        for (int i = 1; i < position - 1 && temp != null; i++) {
            temp = temp.next;
        }

        if (temp == null || temp.next == null) {
            insertAtEnd(data);
        } else {
            newNode.next = temp.next;
            newNode.prev = temp;
            temp.next.prev = newNode;
            temp.next = newNode;
        }
    }

    public void deleteFirst() {
        if (head == null) return;

        if (head.next == null) {
            head = null;
        } else {
            head = head.next;
            head.prev = null;
        }
    }

    public void deleteLast() {
        if (head == null) return;

        if (head.next == null) {
            head = null;
        } else {
            Node temp = head;
            while (temp.next != null)
                temp = temp.next;

            temp.prev.next = null;
        }
    }

    public void deleteAtPosition(int position) {
        if (head == null) return;

        if (position == 1) {
            deleteFirst();
            return;
        }

        Node temp = head;

        for (int i = 1; i < position && temp != null; i++) {
            temp = temp.next;
        }

        if (temp == null || temp.prev == null) return;

        if (temp.next == null) {
            deleteLast();
        } else {
            temp.prev.next = temp.next;
            temp.next.prev = temp.prev;
        }
    }

    public void displayForward() {
        Node temp = head;
        System.out.print("List (forward): ");
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DoublyLinkedListAssignment dll = new DoublyLinkedListAssignment();

        System.out.print("Enter the number of nodes: ");
        int n = sc.nextInt();
        dll.createList(n, sc);
        dll.displayForward();

        System.out.print("Insert at beginning (value): ");
        dll.insertAtBeginning(sc.nextInt());
        dll.displayForward();

        System.out.print("Insert at end (value): ");
        dll.insertAtEnd(sc.nextInt());
        dll.displayForward();

        System.out.print("Insert at 3rd position (value): ");
        dll.insertAtPosition(sc.nextInt(), 3);
        dll.displayForward();

        System.out.println("Delete first node:");
        dll.deleteFirst();
        dll.displayForward();

        System.out.println("Delete last node:");
        dll.deleteLast();
        dll.displayForward();

        System.out.println("Delete middle node (3rd position):");
        dll.deleteAtPosition(3);
        dll.displayForward();
    }
}
