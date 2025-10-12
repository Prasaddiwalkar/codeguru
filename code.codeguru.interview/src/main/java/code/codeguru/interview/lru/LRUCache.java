package code.codeguru.interview.lru;

import java.util.Map;

public class LRUCache {
    private final int capacity;
    private final Map<Integer, Node> map;
    private final DoublyLinkedList dll;

    public LRUCache(int capacity) {
        this.capacity = capacity;
        this.map = new java.util.HashMap<>();
        this.dll = new DoublyLinkedList();
    }

    public int get(int key) {
        if (!map.containsKey(key)) {
            return -1; // Key not found
        }
        Node node = map.get(key);
        dll.moveToFront(node);
        return node.value;
    }

    public void put(int key, int value) {
        if (map.containsKey(key)) {
            Node node = map.get(key);
            node.value = value;
            dll.moveToFront(node);
        } else {
            if (map.size() >= capacity) {
                Node lruNode = dll.removeLast();
                if (lruNode != null) {
                    map.remove(lruNode.key);
                }
            }
            Node newNode = new Node(key, value);
            dll.addToFront(newNode);
            map.put(key, newNode);
        }
    }

    private static class Node {
        int key;
        int value;
        Node prev;
        Node next;

        Node(int key, int value) {
            this.key = key;
            this.value = value;
        }
    }

    private static class DoublyLinkedList {
        private Node head;
        private Node tail;

        DoublyLinkedList() {
            head = new Node(0, 0); // Dummy head
            tail = new Node(0, 0); // Dummy tail
            head.next = tail;
            tail.prev = head;
        }

        void addToFront(Node node) {
            node.next = head.next;
            node.prev = head;
            head.next.prev = node;
            head.next = node;
        }

        void moveToFront(Node node) {
            remove(node);
            addToFront(node);
        }

        void remove(Node node) {
            node.prev.next = node.next;
            node.next.prev = node.prev;
        }

        Node removeLast() {
            if (tail.prev == head) {
                return null; // List is empty
            }
            Node lastNode = tail.prev;
            remove(lastNode);
            return lastNode;
        }
    }
}
