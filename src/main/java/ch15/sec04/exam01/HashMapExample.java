package ch15.sec04.exam01;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapExample {
    public static void main(String[] args) {
        // 1) Map 컬렉션 생성
        Map<String, Integer> map = new HashMap<>();

        // 2) 객체 저장
        map.put("a", 85);
        map.put("b", 90);
        map.put("c", 80);
        map.put("d", 95);
        System.out.println("총 객체 수: " + map.size());
        System.out.println();

        // 3) 키로 값 얻기
        String key = "a";
        int value = map.get(key);
        System.out.println(key + ": " + value);
        System.out.println();

        // 4) 키 Set 컬렉션 얻고 반복해서 키와 값 얻기
        Set<String> keySet = map.keySet();
        Iterator<String> keyIterator = keySet.iterator();
        while(keyIterator.hasNext()){
            String k = keyIterator.next();
            Integer v = map.get(k);
            System.out.println(k + ": " + v);
        }
        System.out.println();

        // 5) 엔트리 Set 컬렉션 얻고, 반복해서 키와 값을 얻기
        Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
        Iterator<Map.Entry<String, Integer>> entryIterator = entrySet.iterator();
        while(entryIterator.hasNext()){
            Map.Entry<String, Integer> entry = entryIterator.next();
            String k = entry.getKey();
            Integer v = entry.getValue();
            System.out.println(k + ": " + v);
        }
        System.out.println();

        // 6) 키로 엔트리 삭제
        map.remove("a");
        System.out.println("총 엔트리 수: " + map.size());
        System.out.println();
    }
}
