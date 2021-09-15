package LearnJava;

import java.util.Scanner;

public class Binary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.close();

        if (num == 0) {
            System.out.println(num);
            return;
        }
        StringBuilder stringBuilder = new StringBuilder();
        while (num != 0) {
            stringBuilder.append(num & 1);
            num = num >>> 1;
        }
        String res = stringBuilder.reverse().toString();
        System.out.println(res);
    }
}
