package Algorithm.Others;

import java.util.*;

public class HuLu5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        float[][] repository = new float[num][2];
        float[][] gradient = new float[num][2];
        List<Deque<Integer>> list = new ArrayList<>();
        for (int i = 0; i < num; i++){
            repository[i][0] = sc.nextFloat();
            repository[i][1] = sc.nextFloat();
        }
        for (int i = 0; i < num; i++){
            gradient[i][0] = (1 - repository[i][1]) / (- repository[i][0]);
            gradient[i][1] = (-1 - repository[i][1]) / (- repository[i][0]);
        }
        for (int i = 0; i < num; i++){
            if (list.size() == 0){
                Deque<Integer> queue = new LinkedList<>();
                queue.addFirst(i);
                list.add(queue);
            } else {
                boolean flag = false;
                for (Deque<Integer> temp : list){
                    if (canContain1(gradient, i, temp.getFirst())){
                        temp.addFirst(i);
                        flag = true;
                        continue;
                    }
                    if (canContain2(gradient, i, temp.getLast())){
                        temp.addLast(i);
                        flag = true;
                        continue;
                    }
                }
                if (!flag){
                    Deque<Integer> queue = new LinkedList<>();
                    queue.addFirst(i);
                    list.add(queue);
                }
            }
        }
        int res = 0;
        for (Deque<Integer> queue : list){
            if (queue.size() > res) res = queue.size();
        }
        System.out.println(res);
    }
    //里面
    public static boolean canContain1(float[][] gradient, int i, int j){
        if (gradient[i][0] < gradient[j][0] && gradient[i][1] > gradient[j][1]){
            return true;
        } else {
            return false;
        }
    }
    //外面
    public static boolean canContain2(float[][] gradient, int i, int j){
        if (gradient[i][0] > gradient[j][0] && gradient[i][1] < gradient[j][1]){
            return true;
        } else {
            return false;
        }
    }
}
