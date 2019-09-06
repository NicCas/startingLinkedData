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

    // Adding Node to the back of the list
    public void addBack (T element) {
        Node temp = new Node (element);
        if (tail != null) {
            tail.next = temp;
        }
        tail = temp;

        if (head == null) {
            head = tail;
        }
        /*
         * In theory could say:
         *      tail.next = new Node (element);
         *      tail = tail.next;
         * However, this would fail if the list was empty, as tail would = null
         */

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

        private Node (T element, Node next) {
            this.element = element;
            this.next = next;
        }
    }
}
