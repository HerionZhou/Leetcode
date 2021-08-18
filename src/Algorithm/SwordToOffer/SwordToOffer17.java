package Algorithm.SwordToOffer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SwordToOffer17 {
    public static int[] algorithm(int n){
        int nums = 0;
        while (n > 0){
            nums += 9 * Math.pow(10, n - 1);
            n--;
        }
        int[] res = new int[nums];
        for (int i = 0; i < nums; i++){
            res[i] = i + 1;
        }
        return res;
    }
    static class Solution{
        //考虑大数
        StringBuilder res;
        int n;
        char[] num, loop = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
        public  String algorithm1(int n){
            this.n = n;
            res = new StringBuilder();
            num = new char[n];
            dfs(1);
            res.deleteCharAt(res.length() - 1);
            return res.toString();
        }

        public  void dfs(int x){
            if (n < x){
                res.append(String.valueOf(num) + ',');
                return;
            }
            for (char c: loop){
                num[x - 1] = c;
                dfs(x + 1);
            }
        }
    }


    public static void main(String[] args) throws IOException {
//        Solution sl = new Solution();
//        System.out.println(sl.algorithm1(3));
        Integer i = 40;
        Integer j = Integer.valueOf(40);
        System.out.println(i.equals(j));
//        Scanner input = new Scanner(System.in);
//        String s = input.nextLine();
//        input.close();
//        System.out.println(s);
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String s = bufferedReader.readLine();
        System.out.println(s);
    }
}
