package practice;

import java.util.ArrayList;

public class binarySearchRecr {
    public static void main(String[] args) {
        int []arr={1,2,3,4,5,6,7};
        int target=2;
        System.out.println(Binsearch(arr,target,0,arr.length-1));
        System.out.println(linearSearch(arr,target,0));

    }
    static int Binsearch(int [] arr,int target,int start,int end){
        if(start>end){
            return -1;
        }
        int mid=start+(end-start)/2;
        if(arr[mid]==target){
            return mid;
        }
        if(arr[mid]>target){
            return Binsearch(arr,target,start,mid-1);
        }else{
            return Binsearch(arr,target,mid+1,end);
        }
    }
    static ArrayList<Integer> list=new ArrayList<>();
    static int linearSearch(int [] arr,int target,int index){

        if (arr[index]==target){
            return index;
        }
        if(index==arr.length){
            return -1;
        }
        return linearSearch(arr,target,index + 1);

    }
}
