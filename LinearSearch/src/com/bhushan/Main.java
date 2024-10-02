package com.bhushan;
public class Main {
    public static void main(String[] args) {
        int[] arr={10,5,84,8,90,45,70,6,12,78};
        int key=84;
        int ans=linearSearch(arr,key);
        System.out.println(ans);
    }

    private static int linearSearch(int[] arr, int key) {
        if(arr.length==0){
            return -1;
        }
        for (int i=0;i<arr.length-1;i++){
            if (arr[i]==key){
                return i;
            }
        }
        //this line will be executed if no return statement above is heated
        //hence the target not found
        return -1;
    }
}