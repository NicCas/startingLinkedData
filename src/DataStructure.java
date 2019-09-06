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

    // Remove element from end of the list by 'hopscotching' through the nodes until reaching the end, then removing the
    // last Node by removing the .next reference to it, so it will then be removed by the 'garbage collector'
    public void removeBack () {
        Node leading = head;
        Node trailing = null;

        while (leading.next != null) {
            trailing = leading;
            leading = leading.next;
        }
        trailing.next = null;
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
