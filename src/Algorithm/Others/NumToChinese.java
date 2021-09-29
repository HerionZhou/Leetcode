package Algorithm.Others;

import java.util.Scanner;

public class NumToChinese {
    char[] nums = {'零', '一', '二', '三', '四', '五', '六', '七', '八', '九'};
    char[] units = {' ', '十', '百', '千', '万', '十', '百', '千', '亿'};
    public void num2Chinese(int num) {
        StringBuilder stringBuilder = new StringBuilder();
        int unit = 0;
        while (num != 0) {
            stringBuilder.append(units[unit]);
            int temp = num % 10;
            stringBuilder.append(nums[temp]);
            unit++;
            num /= 10;
        }
        System.out.println(stringBuilder.reverse().toString().replaceAll("零[十百千]", "零").replaceAll("零+万", "万").replaceAll("零+ ", "").replaceAll(" ", ""));
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.close();

        NumToChinese numToChinese = new NumToChinese();
        numToChinese.num2Chinese(num);
    }
}
