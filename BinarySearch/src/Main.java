public class Main {
    public static void main(String[] args) {
        int [] arr={2,3,5,23,43,56,76,89,90,97};
        int target=43;
        System.out.println(binarySearch(arr,target));
    }
    static int binarySearch(int [] arr,int target){
        int start=arr[0];
        int end=arr.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(target<arr[mid]){
                end=mid-1;
            } else if (target>arr[mid]) {
                start=mid+1;
            }else{
                return mid;
            }
        }
        return -1;
    }
}