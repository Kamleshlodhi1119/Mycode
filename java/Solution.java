
class Solution {
    public static void main(String[] args) {
        int a[] = { 1, 3, 5, 6, 89, 7, 89, 9, 987 };
        System.out.println(singleNonDuplicate(a));
    }

    public static int singleNonDuplicate(int[] nums) {
        int l = 0;
        int h = nums.length - 1;
        while (l < h) {
            int m = l + (h - l) / 2;
            if (m % 2 == 0) { // check if mis even
                if (nums[m] == nums[m + 1]) {
                    l = m + 2;
                } else {
                    h = m;
                }
            } else { // mis odd
                if (nums[m] == nums[m - 1]) {
                    l = m + 1;
                } else {
                    l = m - 1;
                }
            }
            return nums[l];
        }
return 0;
    }
}