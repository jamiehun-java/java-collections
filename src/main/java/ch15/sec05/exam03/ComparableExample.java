package ch15.sec05.exam03;

import java.util.TreeSet;

public class ComparableExample {
    public static void main(String[] args) {
        // 1) TreeSet 컬렉션 생성
        TreeSet<Person> treeSet = new TreeSet<>();

        // 2) 객체 저장
        treeSet.add(new Person("A" , 45));
        treeSet.add(new Person("B", 25));
        treeSet.add(new Person("C", 31));

        // 3) 객체를 하나씩 가져오기
        for(Person person: treeSet){
            System.out.println(person.name + " : " + person.age);
        }
    }
}
