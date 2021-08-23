package Algorithm.Others;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PinDuoDuo {
    //能被M整除的最小的N位正整数
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> resList = new ArrayList<>();
        int groups = sc.nextInt();
        for (int i = 1; i <= groups; i++){
            int digit = sc.nextInt();
            int num = sc.nextInt();
            int minNum = 1;
            while (digit-- > 1){
                minNum *= 10;
            }
            int maxNum = minNum * 10 - 1;
            //比最大的digit位数大，返回-1
            if (num > maxNum){
                resList.add(-1);
                continue;
            }
            int res = num;
            while (res < minNum){
                res += num;
            }
            //比最大的digit位数大，返回-1
            if (res > maxNum){
                resList.add(-1);
                continue;
            }
            resList.add(res);
        }
        for (int res : resList) {
            System.out.println(res);
        }
    }
}
