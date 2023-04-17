package ch15.sec05.exam01;

import java.util.NavigableSet;
import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args) {
        // 1) TreeSet 컬렉션 생성
        TreeSet<Integer> scores = new TreeSet<>();

        // 2) Integer 객체 저장
        scores.add(87);
        scores.add(98);
        scores.add(75);
        scores.add(95);
        scores.add(80);

        // 3) 정렬된 Integer 객체를 하나씩 가져오기
        for (Integer s : scores) {
            System.out.println(s + " ");
        }
        System.out.println("\n");

        // 4) 특정 Integer 객체를 가져오기
        System.out.println(scores.first());
        System.out.println(scores.last());
        System.out.println(scores.higher(95));
        System.out.println(scores.lower(80));
        System.out.println(scores.ceiling(95));
        System.out.println(scores.floor(80));
        System.out.println();

        // 5) 내림차순으로 정렬하기
        NavigableSet<Integer> descendingScores = scores.descendingSet();
        for(Integer s : descendingScores){
            System.out.println(s + " ");
        }
        System.out.println("\n");

        // 6) 범위 검색 (80 <= )
        NavigableSet<Integer> rangeSet = scores.tailSet(80, true);
        for(Integer s : rangeSet){
            System.out.println(s + " ");
        }
        System.out.println("\n");

        // 7) 범위 검색 (80 <= scores < 90)
        rangeSet = scores.subSet(80, true, 90, false);
        for (Integer s : rangeSet) {
            System.out.println(s + " ");
        }
    }
}
