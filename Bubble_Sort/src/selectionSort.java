import java.util.Arrays;

public class selectionSort {
    public static void main(String[] args) {
        int arr[]={3,1,5,4,2};
        selection(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void selection(int [] arr){
        for (int i=0;i<arr.length;i++) {
            int last = arr.length - i - 1;
            int maxIndex = maximum(arr, 0, last);
            swap(arr,maxIndex,last);
        }
    }
    static void swap(int[]arr,int first,int seacond){
        int temp=arr[first];
        arr[first]=arr[seacond];
        arr[seacond]=temp;
    }
    static int maximum(int []arr,int start,int last){
        int max=start;
        for(int i=start;i<=last;i++){
            if(arr[max]<arr[i]){
                max=i;
            }
        }

        return max;
    }
}
