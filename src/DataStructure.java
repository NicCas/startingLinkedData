public class DataStructure<T> {
    Node head = null;
    Node tail = null;

    // Adding Node to the front of the list
    public void addFront (T element) {
        head = new Node(element, head);
        if (tail == null) {
            tail = head;
        }
    }

    public void addEnd (T element) {
        Node tmp = new Node(element, tail);
        tail.next = null;
        if (head == null) {
            head = tail;
        }
    }

    private class Node {
        T element;
        Node next;

        private Node()
        {
            this(null, null);
        }

        private Node (T element)
        {
            this(element, null);
        }

        private Node (T element, Node next)
        {
            this.element = element;
            this.next = next;
        }
    }
}
