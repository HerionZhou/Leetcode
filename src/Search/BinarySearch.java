package Search;

public class BinarySearch {
    public static int binarySearch(int[] nums, int target){
        int left = 0, right = nums.length - 1;
        while (left <= right){
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) return mid;
            else if (nums[mid] > target) right = mid - 1;
            else if (nums[mid] < target) left = mid + 1;
        }
        return -1;
    }
    //查找左边界
    public static int binarySearchForLeft(int[] nums, int target){
        int left = 0, right = nums.length - 1;
        while (left < right){
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) right = mid;
            else if (nums[mid] > target) right = mid - 1;
            else if (nums[mid] < target) left = mid + 1;
        }
        if (left == nums.length) return -1;
        return nums[left] == target ? left : -1;
    }
    //查找右边界
    public static int binarySearchForRight(int[] nums, int target){
        int left = 0, right = nums.length - 1;
        while (left < right){
            int mid = (left + right) / 2;
            if (nums[mid] == target) left = mid;
            else if (nums[mid] < target) left = mid + 1;
            else if (nums[mid] > target) right = mid - 1;
        }
        if (left == nums.length) return -1;
        return nums[left] == target ? left : -1;

    }

    public static void main(String[] args){
        int[] test1 = {1,2,4,4,5,6,7};
        System.out.println(binarySearchForRight(test1, 0));
    }

}
