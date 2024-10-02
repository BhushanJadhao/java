package practice.normalPractice;
import java.util.Arrays;

public class RevArr {
    public static void main(String[] args) {
        int []arr={1,2,3,4,5,6,7};
        int left=0;
        int right=arr.length-1;
        while(left<=right){
            int temp=arr[right];
            arr[right]=arr[left];
            arr[left]=temp;
            left++;
            right--;
        }
        System.out.println(Arrays.toString(arr));
    }
}
