package Algorithm.Stack;

import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class LeetCode20 {
    static class Solution{
        //括号判断
        //直接用栈
        public boolean algorithm(String s){
            char[] str = s.toCharArray();
            Deque<Character> stack = new LinkedList<>();
            stack.push(str[0]);
            for (int i = 1; i < str.length; i++) {
                if (str[i] == '(' || str[i] == '[' || str[i] == '{') {
                    stack.push(str[i]);
                } else {
                    if (stack.size() == 0) return false;
                    else {
                        if (stack.peek() == '(' && str[i] == ')') {
                            stack.pop();
                        } else if (stack.peek() == '[' && str[i] == ']') {
                            stack.pop();
                        } else if (stack.peek() == '{' && str[i] == '}') {
                            stack.pop();
                        } else {
                            return false;
                        }
                    }
                }
            }
            if (stack.size() != 0) return false;
            return true;
        }
        //构建map，简化判断条件
        public boolean algorithm1(String s){
            Map<Character, Character> map = new HashMap<>();
            map.put('(', ')');
            map.put('[', ']');
            map.put('{', '}');
            Deque<Character> stack = new LinkedList<>();
            for (char c : s.toCharArray()) {
                if (map.containsKey(c)) stack.push(c);
                else if (stack.size() == 0 || map.get(stack.pop()) != c) return false;
            }
            return stack.size() == 0;
        }

    }
}
