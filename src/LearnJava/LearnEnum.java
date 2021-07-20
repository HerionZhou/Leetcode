package LearnJava;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.concurrent.ConcurrentHashMap;

public class LearnEnum {
    public enum Pizza{
        Pizza1,
        Pizza2,
        Pizza3;
    }

    public static void main(String[] args) {
        System.out.println(Pizza.Pizza1.getClass());
        LinkedList myList = new LinkedList();
        myList.add(1);
        myList.add(2);
        System.out.println(myList.get(1));
    }
}
