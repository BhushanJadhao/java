package practice.Accenture;

public class loongestConsectiveTempDrop {
    public static void main(String[] args) {
        int[] arr={1,6,0,-1,-2,3,4,8};
        int result=tempDrop(arr);
        System.out.println(result);
    }
    static int tempDrop(int []arr){
        int maxCount=Integer.MIN_VALUE;
        int count=0;
        for(int i=1;i<arr.length;i++){
            if(arr[i]<arr[i-1]){
                count++;
            }else{
                maxCount=Math.max(count,maxCount);
                count=0;
            }
        }
        return Math.max(count,maxCount);
    }
}
