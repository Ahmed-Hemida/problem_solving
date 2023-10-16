
class Solution {
    public static void main(String[] arg) {
        int []nums1 = {1,2}; 
        int [] nums2 = {-1,3};
        System.out.println(findMedianSortedArrays(nums1, nums2));

    }

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int length1 = nums1.length;
        int length2 = nums2.length;
    
        if (length1 > length2) {
            return findMedianSortedArrays(nums2, nums1);
        }
    
        int low = 0, high = length1;
        int partition1, partition2;
        int maxLeft1, maxLeft2, minRight1, minRight2;
    
        while (low <= high) {
            partition1 = (low + high) / 2;
            partition2 = (length1 + length2 + 1) / 2 - partition1;
    
            maxLeft1 = (partition1 == 0) ? Integer.MIN_VALUE : nums1[partition1 - 1];
            minRight1 = (partition1 == length1) ? Integer.MAX_VALUE : nums1[partition1];
            maxLeft2 = (partition2 == 0) ? Integer.MIN_VALUE : nums2[partition2 - 1];
            minRight2 = (partition2 == length2) ? Integer.MAX_VALUE : nums2[partition2];
    
            if (maxLeft1 <= minRight2 && maxLeft2 <= minRight1) {
                if ((length1 + length2) % 2 == 0) {
                    return (Math.max(maxLeft1, maxLeft2) + Math.min(minRight1, minRight2)) / 2.0;
                } else {
                    return Math.max(maxLeft1, maxLeft2);
                }
            } else if (maxLeft1 > minRight2) {
                high = partition1 - 1;
            } else {
                low = partition1 + 1;
            }
        }
        return 0.0;
    }
}