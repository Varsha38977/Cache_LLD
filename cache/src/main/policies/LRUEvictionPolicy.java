package policies;

import java.util.Deque;
import java.util.HashSet;
import java.util.LinkedList;

public class LRUEvictionPolicy<Key> implements EvictionPolicy<Key>{

    private Deque<Key> doublyQueue;

    private HashSet<Key> hashSet;

    public LRUEvictionPolicy() {
        doublyQueue = new LinkedList<>();
        hashSet = new HashSet<>();
    }

   public void keyAccessed(Key key) {
        if (hashSet.contains(key)) {
            doublyQueue.remove(key);
        }
        doublyQueue.push(key);
        hashSet.add(key);
   }

    public Key evictKey() {
        Key last = doublyQueue.removeLast();
        hashSet.remove(last);
        return last;
    }

}
