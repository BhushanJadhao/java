import java.util.Arrays;

public class practice_selectionSort {
    public static void main(String[] args) {
        int arr[]={3,1,5,4,2};
        selection(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void selection(int [] arr){
        for(int i=0;i<arr.length;i++){
            int last=arr.length-i-1;
            int maxIndex=maxIndex(arr,0,last);
            swap(arr,last,maxIndex);
        }
    }
    public static int maxIndex(int [] arr,int start,int end){
        int max=start;
        for(int i=0;i<=end;i++){
            if(arr[i]>arr[max]){
                max=i;
            }
        }
        return max;
    }
    public static void swap(int [] arr,int first,int last){
        int temp=arr[first];
        arr[first]=arr[last];
        arr[last]=temp;
    }
}
