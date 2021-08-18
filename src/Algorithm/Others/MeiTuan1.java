package Algorithm.Others;

import java.util.*;

public class MeiTuan1 {
    public static void main(String[] args) {
        List<Integer> location = new ArrayList<>();
        List<Integer> direction = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int nums = sc.nextInt();
        int left = Integer.MIN_VALUE;
        int right = Integer.MAX_VALUE;
        while (nums-- > 0){
            int loc = sc.nextInt();
            int dir = sc.next().equals("L") ? -1 : 1;
            location.add(loc);
            direction.add(dir);
            if (dir == 1 && loc< right) {
                right = loc;
            }else if (dir == -1 && loc > left) {
                left = loc;
            }
        }
        Set<Integer> set = new HashSet<>();
        while (left > right){
            for (int i = 0; i < location.size(); i++) {
                int cur_loc = location.get(i);
                int cur_dir = direction.get(i);
                if (!set.contains(cur_loc)){
                    cur_loc = cur_loc + cur_dir;
                    location.set(i, cur_loc);
                    set.add(cur_loc);
                    if (cur_dir == 1 && right == cur_loc - 1){
                        right = cur_loc;
                    }else if (cur_dir == -1 && left == cur_loc + 1){
                        left = cur_loc;
                    }
                }
            }

        }
    }
}
