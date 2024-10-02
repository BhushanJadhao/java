import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr={4,2,7,1};
        selectionSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    static void selectionSort(int [] arr,int start,int end){
       if(start>=end){
           return;
       }
       int maxIndex=start;
       for(int i=start+1;i<=end;i++){
           if(arr[i]>arr[maxIndex]){
               maxIndex=i;
           }
       }
       int temp=arr[maxIndex];
       arr[maxIndex]=arr[end];
       arr[end]=temp;
       selectionSort(arr,start,end-1);
    }
}
