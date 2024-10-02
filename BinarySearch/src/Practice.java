public class Practice {
    public static void main(String[] args) {
        int [] arr={90,75,18,12,6,4,3};
        int target=75;
        System.out.println(orderAgnosticBS(arr,target));
    }
    static boolean orderAgnosticBS(int[]arr,int target){
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]==target){
                return true;
            }
            if(arr[start]<arr[end]){
                if(target<mid){
                    end=mid-1;
                }else {
                    start=mid + 1;
                }
            }else{
                if(target<mid){
                    start=mid +1;
                }else{
                    end=mid -1;
                }
            }
        }
        return false;
    }
}
