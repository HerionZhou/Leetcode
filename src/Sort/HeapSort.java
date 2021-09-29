package Sort;

public class HeapSort {
    public void healSort(int[] nums) {
        for (int i = nums.length / 2 - 1; i >= 0; i--) {
            adjustHeap(nums, i, nums.length);
        }

        for (int i = nums.length - 1; i > 0; i--) {
            int temp = nums[0];
            nums[0] = nums[i];
            nums[i] = temp;
            adjustHeap(nums, 0, i);
        }
    }

    public void adjustHeap(int[] nums, int root, int length) {
        int temp = nums[root];
        int leftChild = root * 2;
        while (leftChild < length) {
            int rightChild = leftChild + 1;
            if (rightChild < length && nums[rightChild] > nums[leftChild]) {
                leftChild = rightChild;
            }
            if (temp >= nums[leftChild]) {
                break;
            }
            nums[root] = nums[leftChild];
            root = leftChild;
            leftChild = root * 2;
        }
        nums[root] = temp;
    }

    public static void main(String[] args) {
        int[] nums = {16, 7, 3, 20, 17, 8};
        HeapSort heapSort = new HeapSort();
        heapSort.healSort(nums);
        for (int num : nums) {
            System.out.print(num + ",");
        }
    }
}
