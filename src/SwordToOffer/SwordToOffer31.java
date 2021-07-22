package SwordToOffer;

import java.util.Stack;

public class SwordToOffer31 {
    //返回值：如果辅助栈为空，则返回true。
    public static boolean algorithm(int[] pushed, int[] popped){
        Stack<Integer> stack = new Stack<>();
        int i = 0, j = 0;
        while(i < pushed.length && j < popped.length){
            stack.add(pushed[i]);
            while (!stack.isEmpty() && stack.peek().equals(popped[j])){
                stack.pop();
                j++;
            }
            i++;
        }
        return stack.isEmpty();
    }


}
