package LinkedList.prackcticeLL;

public class BubbleSort {
    public static void main(String[] arg){
        int arr[]={1,2,3,4,5,6,7,8,9,10};
        int target=-1;
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]==target){
                System.out.println(mid);
                return;
            }else if(arr[mid]>target){
                end=mid-1;
            }else{
                start=mid+1;
            }
        }
    }
}
