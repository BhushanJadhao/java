package practice;

import java.util.Arrays;

public class mergeSort {
    public static void main(String[] args) {
        int [] arr={5,4,3,2,1};
        arr=mergeSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static int[] mergeSort(int [] arr){
        if(arr.length==1){
            return arr;
        }
        int mid=arr.length/2;
        int[] left=mergeSort(Arrays.copyOfRange(arr,0,mid));
        int[]right=mergeSort(Arrays.copyOfRange(arr,mid,arr.length));

        return merge(left,right);
 
    }
    public static int [] merge(int [] left ,int [] right){
        int[] finalMerged =new int[left.length + right.length];
        int i=0;
        int j=0;
        int k=0;

        while(i<left.length && j<right.length){
            if(left[i]<right[j]){
                finalMerged[k]=left[i];
                i++;
            }else{
                finalMerged[k]=right[j];
                j++;
            }
            k++;
        }
        while(i<left.length){
            finalMerged[k]=left[i];
            i++;
            k++;
        }
        while(j<right.length){
            finalMerged[k]=right[j];
            j++;
            k++;
        }
        return finalMerged;
    }
}
