package code.codeguru.interview.list;

import java.util.Map;

public class DLinkedList<T> {
    // Implementation of Doubly Linked list
    // Define Node class with next prev, size and data
    // add hashmap for O(1)  access

    private class Node<T> {
        T value;
        Node<T> next;
        Node<T> prev;

        Node(T value) {
            this.value = value;
            this.next = null;
            this.prev = null;
        }
    }

    private Node<T> head;
    private Node<T> tail;
    private int size;
    private Map<Integer, Node<T>> map;

    public DLinkedList(T value) {

        //        head = new Node<>();
    }

    // ---- Common methods ----
    // Add methods
    //    public void addFirst(T data);
    //    public void addLast(T data);
    //    public void addAtIndex(int index, T data);
    //
    //    // Remove methods
    //    public T removeFirst();
    //    public T removeLast();
    //    public T removeAtIndex(int index);
    //    public boolean remove(T data);
    //
    //    // Get methods
    //    public T getFirst();
    //    public T getLast();
    //    public T getAtIndex(int index);
    //
    //    // Utility methods
    //    public boolean isEmpty();
    //    public int size();
    //    public void clear();
    //
    //    // Traversal methods
    //    public void printForward();
    //    public void printBackward();
    //
    //    // Search
    //    public boolean contains(T data);
    //    public int indexOf(T data);
    //    public int lastIndexOf(T data);

}
