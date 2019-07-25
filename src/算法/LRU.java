package 算法;

import java.util.LinkedList;

//Least Recently Used 最少使用策略
public class LRU<T> {
    private int maxCount = 3;

    private LinkedList<T> LRUCache = new LinkedList<>();

    public synchronized void add(T t){
        LRUCache.remove(t);
        if(LRUCache.size() == 3){
            LRUCache.removeLast();
        }
        LRUCache.addFirst(t);
    }

    @Override
    public String toString() {
        return LRUCache.toString();
    }

    public static void main(String[] args) {
        LRU<String> stringLRU = new LRU<>();
        for (int i = 0; i < 10; i++) {
            stringLRU.add("xxx"+i+"xxx");
            System.out.println(stringLRU);
        }
        stringLRU.add("xxx"+8+"xxx");
        System.out.println(stringLRU);
    }
}
