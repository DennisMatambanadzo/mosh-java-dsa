package LinearDSA;

import java.util.NoSuchElementException;

public class LinkedList {


    private static class Node {

        private int value;

        private Node next;

        public Node(int value) {
            this.value = value;
        }

        public Node() {

        }

    }

    private Node first;
    private Node last;
    private int count = 0;


    public void addFirst(int item) {
        var node = new Node(item);

        if (isEmpty())
            first = last = node;
        else {
            node.next = first;
            first = node;
        }

    }

    public void addLast(int item) {
        var node = new Node(item);

        if (isEmpty())
            first = last = node;
        else {
            last.next = node;
            last = node;
        }
        count++;
    }

    public int indexOf(int value) {
        var current = first;
        int index = 0;
        while (current != null) {

            if (current.value == value) {
                return index;
            }
            current = current.next;
            index++;
        }
        return -1;
    }

    private boolean isEmpty() {

        return first == null;
    }

    public boolean contains(int value) {

        return indexOf(value) != -1;
    }

    public void deleteFirst() {
        if (first == null) {
            throw new NoSuchElementException();
        }
        if (first == last) {
            first = null;
        } else {

            first = first.next;
        }

        count--;
    }

    public void deleteLast() {
        var current = first;
        if (first == null) {
            throw new NoSuchElementException();
        }
        if (first == last) {
            first = last = null;
        }
        while (current != null) {

            if (current.next == last) {
                current.next = null;
                last = current;
            }
            current = current.next;
        }
        count--;
    }

    public int[] toArray() {
        int[] array = new int[count];

        var current = first;
        int index = 0;
        while (current.next != null) {

            array[index++] = current.value;
            current = current.next;

        }
        return array;
    }

    public void reverse() {
        if (isEmpty()) return;
        var current = first;
        Node prev = new Node();
        while (current != null) {
            var nextNode = current.next;
            current.next = prev;
            prev = current;
            current = nextNode;

        }
        var hF = first;
        first = last;
        last = hF;

    }

    public void print() {

        var current = first;

        while (current != null) {

            if (current.next != null) {
                System.out.println(current.value + " -- " + count--);
            }
            current = current.next;

        }
    }

    public int size() {
        return count;
    }
    // addFirst
    // addLast
    // deleteFirst
    // deleteLast
    // contains
    // indexOf

    public void getKthNodeFromTheEnd(int K) {
        var current = first;
        var hold = 0;

        var node = new Node();
//        while (current != null) {
//            if (hold == K - 1) {
//                node = current;
//            }
//            current = current.next;
//            hold++;
//        }


    }

}
