package LearnJava;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LearnJava {
    public static void main(String[] args){
        Integer a = 1;
        Short b = 99;
        String c = new String("123");
        String d = "123";
        Dog dog = new Dog("kk");
        System.out.println(a.hashCode());
        System.out.println(dog.toString());
        System.out.println(c.hashCode());
        System.out.println(d.hashCode());
        ClassExample example = new ClassExample();
        example.fc1();
        String[] atp = {"Rafael Nadal", "Novak Djokovic",
                "Stanislas Wawrinka",
                "David Ferrer","Roger Federer",
                "Andy Murray","Tomas Berdych",
                "Juan Martin Del Potro"};
        List<String> players =  Arrays.asList(atp);
        players.forEach((player) -> System.out.println(player+ ';'));

        BigDecimal aB = new BigDecimal(1.0);
        BigDecimal bB = new BigDecimal("2.0");
        String[] str = {"das", "dasd"};
        List myList = Arrays.asList(str);
        List<String> numList = new ArrayList<String>();
        numList.add("1");
        numList.add("2");
        numList.add("3");
        String[] numArray = numList.toArray(new String[0]);
        System.out.println(numArray[1]);
    }

    private static String getType(Object a) {
        return a.getClass().toString();

    }

    public static class Dog {

        String name;
        private int age;

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        Dog(String name) {
            this.name = name;
        }

        String getName() {
            return this.name;
        }

        void setName(String name) {
            this.name = name;
        }

        String getObjectAddress() {
            return super.toString();
        }
    }

    public static abstract class AbstractExample{
        private int x;
        protected int y;
        public abstract void fc1();

        public void fc2(){
            System.out.println("fc2");
        }
    }

    public static class ClassExample extends AbstractExample{

        @Override
        public void fc1() {
            System.out.println("fc1");
        }
    }
    //?????????
    public static class Generic<T>{
        private T key;
        public Generic(T key){
            this.key = key;
        }
        public T getKey(){
            return this.key;
        }
    }
    //????????????
    public <T> T function(Generic<T> generic){
        T test = generic.getKey();
        return test;
    }
}
