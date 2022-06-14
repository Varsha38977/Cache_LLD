import factories.Cache;
import factories.CacheFactory;

public class Main {
    public static void main(String[] args) {
        CacheFactory<Integer, String> cacheFactory = new CacheFactory<>();
        Cache<Integer, String> lruCache = cacheFactory.getLRUCache(3);
        lruCache.put(5, "xfcgvbhnj");
        lruCache.put(4, "hhhbh");
        lruCache.put(3, "bhbsws");
        lruCache.put(20, "hjjhj");
        lruCache.get(5);
        lruCache.get(4);
        lruCache.get(20);
        lruCache.get(3);
        lruCache.put(56, "dfghjk");
        lruCache.get(56);
        lruCache.get(5);
        lruCache.get(4);
        lruCache.get(20);
        lruCache.get(3);
    }
}
