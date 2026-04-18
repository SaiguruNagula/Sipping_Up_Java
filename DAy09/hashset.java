package DAy09;

public class hashset {
    private static final int INITIAL_CAPACITY = 16;
    private static final double LOAD_FACTOR = 0.75;
    private Node[] table;
    private int size;

    private static class Node {
        Object key;
        Node next;

        Node(Object key) {
            this.key = key;
        }
    }

    public hashset() {
        table = new Node[INITIAL_CAPACITY];
        size = 0;
    }

    private int hash(Object key) {
        return key == null ? 0 : Math.abs(key.hashCode()) % table.length;
    }

    public boolean add(Object key) {
        int index = hash(key);
        Node current = table[index];
        while (current != null) {
            if (current.key.equals(key)) {
                return false;
            }
            current = current.next;
        }
        Node newNode = new Node(key);
        newNode.next = table[index];
        table[index] = newNode;
        size++;
        if (size > LOAD_FACTOR * table.length) {
            resize();
        }
        return true;
    }

    public boolean contains(Object key) {
        int index = hash(key);
        Node current = table[index];
        while (current != null) {
            if (current.key.equals(key)) {
                return true;
            }
            current = current.next;
        }
        return false;
    }

    public boolean remove(Object key) {
        int index = hash(key);
        Node current = table[index];
        Node prev = null;
        while (current != null) {
            if (current.key.equals(key)) {
                if (prev == null) {
                    table[index] = current.next;
                } else {
                    prev.next = current.next;
                }
                size--;
                return true;
            }
            prev = current;
            current = current.next;
        }
        return false;
    }

    public int size() {
        return size;
    }

    private void resize() {
        Node[] oldTable = table;
        table = new Node[oldTable.length * 2];
        size = 0;
        for (Node node : oldTable) {
            while (node != null) {
                add(node.key);
                node = node.next;
            }
        }
    }
}
