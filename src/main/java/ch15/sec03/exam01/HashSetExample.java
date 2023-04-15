package ch15.sec03.exam01;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample {
    public static void main(String[] args) {
        // 1) HashSet 컬렉션 생성
        Set<String> set = new HashSet<String>();

        // 2) 객체 저장
        set.add("Java");
        set.add("Spring");
        set.add("JPA");
        set.add("Java");  // 동등 객체라 저장되지 않음
        set.add("JDBC");

        // 3) 저장된 객체 수 출력
        int size = set.size();
        System.out.println("총 객체수 : " + size);
    }
}
