package com.bhushan;

public class searchInRange {
    public static void main(String[] args) {
    int arr[]={9,18,67,34,54,21,14};
    int target=34;//if we search for 9 or 14 it will give -1 as its out of the range
        System.out.println(search(arr,target,1,5));
    }
    public static int search(int arr[],int target,int start,int end){
        if(arr==null){
            return -1;
        }
        for(int i=start;i<=end;i++){
            if(arr[i]==target){
                return i;
            }
        }
        return -1;
    }
}
