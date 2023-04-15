package ch15.sec02.exam01;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {
    public static void main(String[] args) {
        // 1) ArrayList collection Create
        List<String> list1 = new ArrayList<String>();

        // 2) LinkedList collection Create
        List<String> list2 = new LinkedList<String>();

        // 3) 시작 시간과 끝 시간을 저장할 변수 선언
        long startTime;
        long endTime;

        // 4) ArrayList 컬렉션에 저장하는 시간 측정
        startTime = System.nanoTime();
        for(int i = 0; i<10000; i++){
            list1.add(0, String.valueOf(i));
        }
        endTime = System.nanoTime();
        System.out.printf("ArrayList: %d %s", (endTime - startTime), "ns");
        System.out.println();

        // 4-1) LinkedList 컬렉션에 저장하는 시간 측정
        startTime = System.nanoTime();
        for(int i = 0; i<10000; i++){
            list2.add(0, String.valueOf(i));
        }
        endTime = System.nanoTime();
        System.out.printf("LinkedList: %d %s", (endTime - startTime), "ns");
    }
}
