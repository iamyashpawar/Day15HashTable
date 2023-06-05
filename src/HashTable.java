import java.util.ArrayList;
import java.util.List;

public class HashTable<K,V> {

    int bucketSize;

     List<LinkedList<K,V>> bucketArray = new ArrayList<>(bucketSize);



    public HashTable() {

    }

    public HashTable(int bucketSize) {
        this.bucketSize = bucketSize;
        for (int i = 0; i < bucketSize; i++) {
            bucketArray.add(i, null);
        }
    }

    public int getIndex(K key) {
        int index = Math.abs(key.hashCode()) % bucketSize;
        return index;
    }
}


