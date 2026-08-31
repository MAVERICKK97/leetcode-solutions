import java.util.*;

class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        ArrayList<Integer> list = new ArrayList<>();

        for (int n : nums1) {
            for (int i = 0; i < nums2.length; i++) {
                if (n == nums2[i]) {
                    list.add(n);
                    nums2[i] = -1;
                    break;
                }
            }
        }

        int[] ans = new int[list.size()];

        for (int i = 0; i < list.size(); i++) {
            ans[i] = list.get(i);
        }

        return ans;
    }
}