import java.util.Arrays;

public class practiceBubble {
    public static void main(String[] args) {
        int[] arr={-1,54,65,-8,36,11};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void bubbleSort(int []arr){
        for(int i=0;i<arr.length;i++){
            boolean swapped=false;
            for(int j=1;j<arr.length-i;j++){
                if(arr[j]<arr[j-1]){
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                    swapped=true;
                }
            }
            if(swapped!=true){
                break;
            }
        }
    }
}
