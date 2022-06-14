package factories;

import policies.LRUEvictionPolicy;
import storage.HashMapBasedStorage;

public class CacheFactory<Key, Value> {

    public Cache<Key, Value> getLRUCache(final int capacity) {
        return new Cache<>(new LRUEvictionPolicy<>(), new HashMapBasedStorage<>(capacity));
    }

}
