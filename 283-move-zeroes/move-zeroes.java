import java.util.ArrayList;

class Solution {
    public void moveZeroes(int[] nums) {
        ArrayList<Integer> array2 = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                array2.add(nums[i]);
            }
        }

        for (int i = 0; i < array2.size(); i++) {
            nums[i] = array2.get(i);
        }

        for (int i = array2.size(); i < nums.length; i++) {
            nums[i] = 0;
        }
    }
}