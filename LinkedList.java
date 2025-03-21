public class LinkedList {
    class Node {
        int data;
        Node next;
        
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    private Node head;
    public LinkedList() {
        this.head = null;
    }

    // Insert a node at the beginning
    public void insertAtBeginning(int data) {
        Node newNode = new Node(data);
        newNode.next = head;  // Point the new node to the current head
        head = newNode;       // Make the new node the head
        System.out.println("Node inserted at the beginning: " + data);
    }

    // Insert a node at the end
    public void insertAtEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;  // If the list is empty, make the new node the head
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;  // Traverse to the last node
            }
            temp.next = newNode;  // Insert the new node at the end
        }
        System.out.println("Node inserted at the end: " + data);
    }

    // Delete a node from the beginning
    public void deleteFromBeginning() {
        if (head == null) {
            System.out.println("List is empty, nothing to delete.");
        } else {
            int deletedData = head.data;
            head = head.next;  // Move head to the next node
            System.out.println("Node deleted from the beginning: " + deletedData);
        }
    }

    public void displayList() {
        if (head == null) {
            System.out.println("The list is empty.");
        } else {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " -> ");
                temp = temp.next;
            }
            System.out.println("null");
        }
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        list.insertAtBeginning(10);
        list.insertAtBeginning(20);
        list.insertAtEnd(30);
        list.insertAtEnd(40);
        
        list.displayList();
        list.deleteFromBeginning();
        list.displayList();
    }
}
