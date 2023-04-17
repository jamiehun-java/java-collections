package ch15.sec05.exam04;

import java.util.TreeSet;

public class ComparableExample {
    public static void main(String[] args) {
        // 1) 비교자를 제공한 TreeSet 컬렉션 생성
        TreeSet<Fruit> treeSet = new TreeSet<Fruit>(new FruitComparator());

        // 2) 객체 저장
        treeSet.add(new Fruit("grape", 3000));
        treeSet.add(new Fruit("apple", 4000));
        treeSet.add(new Fruit("strawberry", 5000));

        // 3) 객체를 하나씩 가져오기
        for(Fruit fruit : treeSet){
            System.out.println(fruit.name + " : " + fruit.price);

        }
    }
}
