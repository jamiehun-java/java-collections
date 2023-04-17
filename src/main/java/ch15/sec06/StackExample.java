package ch15.sec06;

import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        Stack<Coin> stack = new Stack<>();

        // 1) stack - push
        stack.push(new Coin(100));
        stack.push(new Coin(50));
        stack.push(new Coin(500));
        stack.push(new Coin(10));

        // 2) stack - pop
        while(!stack.isEmpty()){
            Coin temp = stack.pop();
            System.out.println(temp.getValue() + "원");
        }

    }



}
