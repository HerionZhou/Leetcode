package Algorithm.Others;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PinDuoDuo1 {
    //幸运儿
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> resultList = new ArrayList<>();
        int groups = sc.nextInt();
        for (int i = 0; i < groups; i++) {
            int N = sc.nextInt();
            int K = sc.nextInt();
            int D = sc.nextInt();
            int Q = sc.nextInt();
            int[] res = new int[N];
            int[] score = new int[N];
//            int[] L = new int[K];
//            int[] P = new int[K];
            boolean flag = false;
            for (int j = 0; j < K; j++) {
//                L[j] = sc.nextInt();
//                P[j] = sc.nextInt();
                int l = sc.nextInt();
                int p = sc.nextInt();
                if (flag) continue;
                score[p] = l;
                int fenshu = calculation(score, p, N, D);
                res[p] = fenshu;
                if (p - 1 >= 0 && score[p - 1] != 0) res[p - 1] = calculation(score, p - 1, N, D);
                if (p + 1 < N && score[p + 1] != 0) res[p + 1] = calculation(score, p + 1, N, D);
                for (int i1 = 0; i1 < res.length; i1++) {
                    if (res[i1] >= Q) {
                        resultList.add(j);
                        flag = true;
                        break;
                    }
                }
            }
            if (flag) continue;
            resultList.add(-1);
        }
        for (int res : resultList) {
            System.out.println(res);
        }

    }

    public static int calculation(int[] score, int p, int N, int D){
        int left = p - 1, right = p + 1;
        int temp = score[p];
        while (left >= 0 && left >= p - D){
            temp += score[left];
            left--;
        }
        while (right < N && right <= p + D){
            temp += score[right];
            right++;
        }
        return temp;
    }
}
