package practice;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSum{
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(candidates);
        backtrack(result, new ArrayList<>(), candidates, target, 0);
        return result;
    }

    private void backtrack(List<List<Integer>> result, List<Integer> tempList, int[] candidates, int remain, int start) {
        if (remain < 0) return; // if remain is less than zero, return
        if (remain == 0) {
            result.add(new ArrayList<>(tempList)); // found a valid combination
            return;
        }
        for (int i = start; i < candidates.length; i++) {
            tempList.add(candidates[i]); // add the candidate to the current path
            backtrack(result, tempList, candidates, remain - candidates[i], i); // not i + 1 because we can reuse same elements
             tempList.remove(tempList.size() - 1); // remove the candidate from the current path
        }
    }

    public static void main(String[] args) {
        CombinationSum cs = new CombinationSum();
        int[] candidates = {2, 3, 6, 7};
        int target = 7;
        List<List<Integer>> combinations = cs.combinationSum(candidates, target);
        for (List<Integer> combination : combinations) {
            System.out.println(combination);
        }
    }
}

