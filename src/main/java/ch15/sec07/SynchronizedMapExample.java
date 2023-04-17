package ch15.sec07;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class SynchronizedMapExample {
    public static void main(String[] args) {
        // 1) Map 컬렉션 생성
        Map<Integer, String> map = Collections.synchronizedMap(new HashMap<>());

        // 2) 작업 스레드 객체 생성
        Thread threadA = new Thread(){
            @Override
            public void run(){
                for(int i = 0; i < 1000; i++){
                    map.put(i, "내용" + i);
                }
            }
        };

        // 2-1) 작업 스레드 객체 생성
        Thread threadB = new Thread(){
            @Override
            public void run(){
                for(int i = 1001; i <= 2000; i++){
                    map.put(i, "내용" + i);
                }
            }
        };

        // 3) 작업 스레드 실행
        threadA.start();
        threadB.start();

        // 4) 작업 스레드들이 모두 종료될 때까지 메인스레드 기다리게 함
        try{
            threadA.join();
            threadB.join();
        } catch (Exception e){

        }

        // 5) 저장된 총 객체 수 얻기
        int size = map.size();
        System.out.println("총 객체 수: " + size);
        System.out.println();
    }
}
