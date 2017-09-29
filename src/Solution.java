public class Solution {

    public static void main(String []args){
        int [] nums = {4, 5, 6, 7, 0, 1, 2};
        Solution a = new Solution();
        System.out.println(a.findMin(nums));
    }

    /*
     * @param nums: a rotated sorted array
     * @return: the minimum number in the array
     */
    public int findMin(int[] nums) {

        if(nums == null || nums.length == 0){
            return -1;
        }
        int start = 0 ;
        int end = nums.length -1;
        int last = nums[nums.length-1];
        while (start + 1 < end){
            int mid = (end - start) /2 + start;
            if(nums[mid] > last){
                start = mid;
            }
            if(nums[mid] < last) {
                end = mid;
            }
        }
        if(nums[start] < nums[end]){
            return nums[start];
        }
        else{
            return nums[end];
        }

    }
}