package Algorithm.SwordToOffer;

import java.util.Stack;

public class SwordToOffer30 {
    public class MinStack{
        Stack<Integer> A;
        Stack<Integer> B;
        public MinStack(){
            A = new Stack<>();
            B = new Stack<>();
        }

        public void push(int x){
            A.add(x);
            if (B.isEmpty() || B.peek() >= x){
                B.add(x);
            }
        }
        //对象中的数值类型是Integer类，不能用==判断相等，要用equals
        public void pop(){
            if (A.peek().equals(B.peek())) B.pop();
            A.pop();
        }

        public int top(){
            return A.peek();
        }

        public int min(){
            return B.peek();
        }
    }

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.add(123);
        System.out.println(stack.peek().getClass());
    }
}
