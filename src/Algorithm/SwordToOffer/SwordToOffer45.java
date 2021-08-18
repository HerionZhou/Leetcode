package Algorithm.SwordToOffer;

public class SwordToOffer45 {
    static class Solution{
        //暴力
        public String algorithm(int[] nums){
            StringBuilder res = new StringBuilder();
            for (int i = 0; i < nums.length; i++){
                for (int j = i + 1; j < nums.length; j++){
                    if ((String.valueOf(nums[i]) + String.valueOf(nums[j])).compareTo(String.valueOf(nums[j]) + String.valueOf(nums[i])) > 0){
                        int temp = nums[i];
                        nums[i] = nums[j];
                        nums[j] = temp;
                    }
                }
            }
            for (int num: nums){
                res.append(num);
            }
            return res.toString();
        }
        //快速排序
        public String algorithm1(int[] nums){
            String[] str = new String[nums.length];
            for (int i = 0; i < nums.length; i++){
                str[i] = String.valueOf(nums[i]);
            }
            quickSort(str, 0, nums.length - 1);
            StringBuilder res = new StringBuilder();
            for (String s: str){
                res.append(s);
            }
            return res.toString();
        }

        public void quickSort(String[] str, int l, int r){
            if (l >= r) return;
            int i = l, j = r;
            while (i < j){
                while (i < j && (str[l] + str[j]).compareTo(str[j] + str[l]) <= 0) j--;
                while (i < j && (str[i] + str[l]).compareTo(str[l] + str[i]) <= 0) i++;
                String temp = str[i];
                str[i] = str[j];
                str[j] = temp;
            }
            String temp = str[l];
            str[l] = str[i];
            str[i] = temp;
            quickSort(str, l, i -1);
            quickSort(str, i + 1, r);
        }


    }
    public static void main(String[] args) {
        Solution solution = new Solution();
    }

}
