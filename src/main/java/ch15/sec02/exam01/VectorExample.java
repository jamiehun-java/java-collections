package ch15.sec02.exam01;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class VectorExample {
    public static void main(String[] args) {
        // 1) Vector 컬렉션 생성
        List<Board> list = new Vector<>();

        /** 예외) List 컬렉션 생성 => 경합이 발생 */
//        List<Board> list = new ArrayList<>();

        // 2) 작업 스레드 객체 생성
        Thread threadA = new Thread(){
            @Override
            public void run(){
                // 객체 1000개 추가
                for(int i = 1; i<=1000; i++){
                    list.add(new Board("Title" + i, "Content" + i, "Writer" + i));
                }
            }
        };

        // 2-1) 작업 스레드 객체 생성
        Thread threadB = new Thread(){
            @Override
            public void run(){
                // 객체 1000개 추가
                for(int i = 1001; i<=2000; i++){
                    list.add(new Board("Title" + i, "Content" + i, "Writer" + i));
                }
            }
        };

        // 3) 작업 스레드 실행
        threadA.start();
        threadB.start();

        // 4) 작업 스레드들이 모두 종료될 때까지 메인 스레드를 기다리게 함
        try{
            threadA.join();
            threadB.join();
        } catch (Exception e){
        }

        // 5) 저장된 총 객체 수 얻기
        int size = list.size();
        System.out.println("총 객체 수:" + size);
        System.out.println();
    }
}
