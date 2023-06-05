public class LinkedList<K,V> {

MyMapNode<K,V> head;
MyMapNode<K,V> tail;


    public void push(K key, V value) {
        MyMapNode<K, V> newNode = new MyMapNode(key, value);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }
}
