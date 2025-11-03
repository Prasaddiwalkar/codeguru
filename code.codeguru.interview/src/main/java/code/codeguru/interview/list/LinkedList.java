package code.codeguru.interview.list;

class ListNode<T> {
    T value;
    ListNode<T> next;

    ListNode(T value) {
        this.value = value;
        this.next = null;
    }
}

public class LinkedList {
    private ListNode head;
    private int size;

    public LinkedList() {
        this.head = null;
        this.size = 0;
    }

    public void add(int value) {
        // 1. Create new node
        // 2. check if head is null, if yes assign new node to head
        // 3. else traverse to the end of the list and add new node there
        // 4. increment size
        ListNode newNode = new ListNode(value);
        if (head == null) {
            head = newNode;
            ++this.size;
            return;
        }

        ListNode current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
        ++this.size;
    }

    public void add(int index, int value) {
        // 1. create new node
        // 2. Check if index is 0, if yes then mark newNode next to head and head to newNode
        // 3. else traverse till index-1
        // 4. Mark index-1.next to newNode and newNode.next to current index
        // 5. increment size
        ListNode newNode = new ListNode(value);
        if (index == 0) {
            newNode.next = head;
            head = newNode;
            ++this.size;
            return;
        }
        if (!isIndexValid(index)) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + this.size);
        }

        if (index == this.size) {
            add(value);
        } else {
            ListNode current = head;
            for (int i = 0; i < index - 1; i++) {
                current = current.next;
            }
            newNode.next = current.next;
            current.next = newNode;
            ++this.size;
        }
    }

    private boolean isIndexValid(int index) {
        return index >= 0 && index < size;
    }

    public void remove(int index) {
        // 1. Check if index is valid, if not throw exceptio
        // 2. Check if index is 0, if yes then mark head = head.next
        // 3. decrese size
        // 4. else traverse till index-1
        // 5. mark index-1.next = index+1
        // 6. decrease size

        if (!isIndexValid(index)) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + this.size);
        }

        if (index == 0) {
            head = head.next;
            --this.size;
        } else {
            ListNode current = head;
            for (int i = 0; i < index - 1; i++) {
                current = current.next;
            }
            ListNode nodeToRemove = current.next;
            current.next = nodeToRemove.next;
            nodeToRemove = null;
            --this.size;
        }
    }

    public int size() {
        return size;
    }

    public ListNode get(int index) {
        if (!isIndexValid(index)) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + this.size);
        }
        ListNode current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current;
    }

    public void printList() {

        ListNode current = head;

        while (current != null) {
            System.out.print(current.value);

            if (current.next != null) {
                System.out.print(" -> ");
            } else {
                System.out.print("\n");
            }
            current = current.next;
        }
    }
}
