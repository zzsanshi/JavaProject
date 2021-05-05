package 回溯.排列;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class _46全排列 {
    List<List<Integer>> res = new ArrayList<>();
    List<Integer> path = new ArrayList<>();
    public List<List<Integer>> permute(int[] nums) {
        boolean[] used = new boolean[nums.length];
        backtracking(nums,used);
        return res;

    }
    void backtracking(int[] nums,boolean[] used) {
        if(path.size() == nums.length) {
            res.add(new ArrayList<>(path));
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if (used[i] == true) {
                continue;
            }
            used[i] = true;
            path.add(nums[i]);
            backtracking(nums,used);
            path.remove(path.size()-1);
            used[i] = false;
        }

    }

}
