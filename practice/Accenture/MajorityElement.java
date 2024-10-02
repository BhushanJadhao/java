package practice.Accenture;
import java.util.*;

public class MajorityElement {
    public static void main(String[] args) {
        int [] arr={2,2,1,1,2,2};
        int result=majorityElement(arr);
        System.out.println(result);
    }
    static int majorityElement(int [] nums){
        HashMap<Integer,Integer> countMap=new HashMap<>();
        int n=nums.length;
        for(int value:nums){
            countMap.put(value,countMap.getOrDefault(value,0)+1);
            if(countMap.get(value)>=n/2) {
                return value;
            }
        }
        return -1;
    }
}
