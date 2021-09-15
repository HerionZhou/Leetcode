package Algorithm.Others;

import java.util.Scanner;

public class HuLu1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long A = sc.nextLong();
        long B = sc.nextLong();
        sc.close();
        int count = 0;
        for (long i = A; i <= B; i++){
            if (calSum(i) % N == 0) count++;
        }
        System.out.println(count);
    }
    public static int calSum(long x){
        int sum = 0;
        while (x != 0){
            sum += x % 10;
            x = x / 10;
        }
        return sum;
    }
}
