package ch15.sec02.exam01;

import java.util.ArrayList;
import java.util.List;
public class ArrayListExample {
    public static void main(String[] args) {
        List<Board> list = new ArrayList<>();

        list.add(new Board("title1", "content1", "writer1"));
        list.add(new Board("title2", "content2", "writer2"));
        list.add(new Board("title3", "content3", "writer3"));

        int size = list.size();
        System.out.println("Object size:" + size);
        System.out.println();

        // 특정 인덱스 가져오기
        Board board = list.get(2);
        System.out.println(board.getSubject() + "\t" + board.getContent() + "\t" + board.getWriter());
        System.out.println();

        // 모든 객체를 하나씩 가져오기
        for(int i = 0; i < size; i++){
            Board b = list.get(i);
            System.out.println(b.getSubject() + "\t" + board.getContent() + "\t" + board.getWriter());
        }
        System.out.println();

        // 객체 삭제
        list.remove(1);
        list.remove(1);

        for(Board b:list){
            System.out.println(b.getSubject() + "\t" + b.getContent() + "\t" + b.getWriter());
        }
    }

}
