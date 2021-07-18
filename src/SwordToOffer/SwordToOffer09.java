package SwordToOffer;

import java.util.LinkedList;

public class SwordToOffer09 {
    //使用LinkedList结构作为栈
    //LinkedList是双向列表,getFirst获取第一个元素，getLast获取最后一个元素
    //add、addLast在最后添加一个元素，addFirst在最前面添加一个元素
    //remove删除第一个元素；removeFirst删除第一个元素并返回，remove(index)删除指定元素，removeLast删除最后一个元素并返回
    LinkedList<Integer> Stack_A;
    LinkedList<Integer> Stack_B;
    public class CQueue{

        public CQueue(){
            Stack_A = new LinkedList<Integer>();
            Stack_B = new LinkedList<Integer>();
        }

        public void appendTail(int value){
            Stack_A.addLast(value);
        }

        public int deleteHead(){
            if (!Stack_B.isEmpty()){
                return Stack_B.removeLast();
            }else {
                if (!Stack_A.isEmpty()){
                    while (!Stack_A.isEmpty()){
                        Stack_B.addLast(Stack_A.removeLast());
                    }
                    Stack_B.removeLast();
                }
            }
            return -1;
        }
    }
}
