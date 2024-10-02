package com.bhushan;
import java.util.Arrays;
public class searchIn2DArray {
    public static void main(String[] args) {
        int[][]arr={
                {34,12,65,67},
                {69,2,21,90},
                {13,54,66}
        };
        int ans[]=search(arr,21);
        System.out.println(Arrays.toString(ans));

        int target= 2;
    }
    public static int[] search(int arr[][],int target){
        for (int row=0;row<arr.length;row++){
            for(int colum=0;colum<arr[row].length;colum++){
                if(arr[row][colum]==target){
                    return new int[]{row,colum};
                }
            }
        }
        return new int[]{-1,-1};
    }

}
