class BinarySearch {

    public static int search(int[] nums, int target) {
        int l=0, r=nums.length-1;
        while(l<=r) {
            int mid=l+(r-l)/2;
            if(target == nums[mid]) {
                return mid;
            } else if(target > nums[mid]) {
                l=nums[mid]+1;
            } else{
                r=nums[mid]-1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = {-1,0,3,5,9,12};
        System.out.println(search(nums, 9));
    }
}