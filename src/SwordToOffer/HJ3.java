package SwordToOffer;
import java.util.*;

public class HJ3 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while (in.hasNext()){
            int num = in.nextInt();
            TreeSet<Integer> set = new TreeSet<>();
            for (int i = 0; i < num; i++){
                set.add(in.nextInt());
            }
            System.out.println(set.first());
            System.out.println(set.last());
//            Iterator iterator = set.iterator();
//            while (iterator.hasNext()){
//                System.out.println(iterator.next());
//            }
            for (int x : set){
                System.out.println(x);
            }
        }
    }
}
