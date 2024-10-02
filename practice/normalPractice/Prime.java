package practice.normalPractice;

import java.util.*;

public class Prime {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter tour number");
        int n=sc.nextInt();
        System.out.println(checkPrime(n));
    }
    static boolean checkPrime(int n){
// ------------------>>BruteForce<<------------------------------
//        int count=0;
//        for(int i=1;i<=n;i++){
//            if((n%i)==0){
//                count++;
//            }
//        }
//        if(count==2){
//            return true;
//        }
//        return false;

        if(n<=1){
            return false;
        }
        else{
            for(int i=2;i<=Math.sqrt(n);i++){
                if(n%i==0){
                    return false;
                }
            }
        }
        return true;
    }



}
