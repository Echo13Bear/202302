public class MergeSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        //[1, 2, 3, 0, 0, 0] [2, 5, 6]
        int cur = nums1.length - 1;
        m = m - 1;
        n = n - 1;
        while (m >= 0 && n >= 0) {
            if (nums1[m] >= nums2[n]) {
                nums1[cur--] = nums1[m--];
            } else {
                nums1[cur--] = nums2[n--];
            }
        }
        while (n >= 0) {
            nums1[cur--] = nums2[n--];
        }
    }

}
