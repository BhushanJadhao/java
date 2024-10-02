package practice;
import java.util.HashSet;

class Duplicate {
    public int removeDuplicates(int[] nums) {
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
        }
        int index=0;
        for(int repetedValues:set){
            nums[index++]=repetedValues;
        }
        return set.size();
    }

    public static void main(String[] args) {
        Duplicate solution = new Duplicate();

        int[] nums = {1, 1, 2, 3, 3};
        System.out.println("Original array: ");
        for (int num : nums) {
            System.out.print(num + " ");
        }
        System.out.println();

        int newLength = solution.removeDuplicates(nums);

        System.out.println("Array after removing duplicates: ");
        for (int i = 0; i < newLength; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();

        System.out.println("New length of the array with unique elements: " + newLength);
    }
}
