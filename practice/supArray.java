package practice;

public class supArray {
    public static void main(String[] args) {
        int n=6;
        int [] arr={7,9,5,8,7};
        int result=FindNumberOfSuperiorElements(arr, n);
        System.out.println(result);

    }
    static int FindNumberOfSuperiorElements(int[]arr,int n){
        if(arr.length==0){
            return 0;
        }
        int rightMost=arr.length-1;
        int count=1;
        for(int i=arr.length-2;i>=0;i--){
            if(arr[rightMost]>arr[i]){
                count ++;
                rightMost--;
            }
        }
        return count;
    }
}
