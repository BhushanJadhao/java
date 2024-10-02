package com.bhushan;

public class evenNumberOfDigits {
    public static void main(String[] args) {

    }
    static int findNumber(int [] nums){
        int count=0;
        for (int i=0;i<nums.length;i++){
            if(nums[i]==even(num)){
                count++;
            }
        }
        return count;
    }
    static boolean even(int num){
        int numberOfDigits=digits(num);
        return numberOfDigits%2==0;
    }
    static int digits(int nums){

    }

}
