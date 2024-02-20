

public class AddFirst {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;

    // *method

    public void addFirst(int data) {

        // !step1- create new node
        Node newNode = new Node(data);

        if (head == null) {
            head = tail = newNode;
            return;
        }
        // !step2- newNode next=head
        newNode.next = head;
        // !step3- head=newNode
        head = newNode;
    }

    public void printLinkedList() {
        
        if (head == null) {
            System.out.println("Linked list Empty");
            return;
        }
        
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");

    }

    public static void main(String[] args) {
        AddFirst ll = new AddFirst();
        // ll.headnNode = new Node(1);
        // ll.headnNode.next = new Node(2);
        ll.printLinkedList();
        ll.addFirst(1);
        ll.printLinkedList();
        ll.addFirst(2);

        ll.printLinkedList();
    }
}
