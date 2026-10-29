import java.util.*;
class Solution {
    public int distinctAverages(int[] nums) {
        List<Integer> A = new ArrayList<>();
        for (int i=0;i<nums.length;i++) {
            A.add(nums[i]);
        }
        Collections.sort(A);
        Set<Integer> B = new HashSet<>();
        for (int i=0;i<nums.length/2;i++) {
            B.add(A.get(i)+A.get(nums.length-i-1));
        }
        return B.size();
    }
}