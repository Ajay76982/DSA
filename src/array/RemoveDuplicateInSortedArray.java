package src.array;

public class RemoveDuplicateInSortedArray {
    public static void main(String[] args) {
       int[] nums = {1,1};
        removeDuplicates(nums);
    }

    public static int removeDuplicates(int[] nums) {
        int i = 0;
        int k = 0;
        int j = i + 1;

        if (nums.length == 1) {
            return 1;
        }
        while (j < nums.length) {

            if (nums[i] != nums[j]) {
                nums[k] = nums[i];
                k++;
            }
            j++;
            i++;
        }

        if (nums.length > 1 && nums[nums.length - 2] != nums[nums.length - 1]) {
            nums[k] = nums[j - 1];
            k++;
        }

        return k;
    }
}
