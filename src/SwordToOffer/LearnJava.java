package SwordToOffer;

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
    }

    private static String getType(Object a) {
        return a.getClass().toString();

    }

    public static class Dog {

        String name;

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
}
