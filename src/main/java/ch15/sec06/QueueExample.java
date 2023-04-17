package ch15.sec06;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
        // 1) Queue 컬렉션 생성
        Queue<Message> queue = new LinkedList<Message>();

        // 2) 메시지 넣기
        queue.offer(new Message("sendMail", "A"));
        queue.offer(new Message("sendSMS", "B"));
        queue.offer(new Message("sendKaKao", "C"));

        // 3) 하나씩 꺼내어서 처리
        while (!queue.isEmpty()) {
            Message message = queue.poll();

            switch (message.command){
                case "sendMail":
                    System.out.println(message.to + "에게 메일을 보냅니다.");
                    break;
                case "sendSMS":
                    System.out.println(message.to + "에게 SMS를 보냅니다.");
                    break;
                case "sendKaKao":
                    System.out.println(message.to + "에게 kakaotalk을 보냅니다.");
                    break;
                default:
                    System.out.println("case를 추가하세요");
                    break;
            }
        }
    }
}
