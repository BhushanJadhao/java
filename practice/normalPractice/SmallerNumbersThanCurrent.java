package practice.normalPractice;
import java.util.HashMap;
import java.util.Arrays;


public class SmallerNumbersThanCurrent {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int [] copyArray=Arrays.copyOfRange(nums,0,nums.length);
        Arrays.sort(copyArray);
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<copyArray.length;i++){
            hm.putIfAbsent(copyArray[i],i);
        }
        for(int j=0;j<nums.length;j++){
            nums[j]=hm.get(nums[j]);
        }
        return nums;
    }


    public static void main(String[] args) {
        SmallerNumbersThanCurrent solution = new SmallerNumbersThanCurrent();
        int[] nums = {8, 1, 2, 2, 3};
        int[] result = solution.smallerNumbersThanCurrent(nums);
        for (int num : result) {
            System.out.print(num + " ");  // Expected output: 4 0 1 1 3
        }
    }
}
