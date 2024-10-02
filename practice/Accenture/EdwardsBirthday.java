/*
*
*
* */
package practice.Accenture;

import java.util.Scanner;

public class EdwardsBirthday {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number of cuts:");
        int cuts=sc.nextInt();
        int result=maxNumOfPices(cuts);
        System.out.println(result);


    }
    public static int maxNumOfPices(int numCut){
        int maxNumOfPices=0;
        maxNumOfPices=numCut*(numCut+1)/2 +1;
        return maxNumOfPices % 1000000007;
    }
}
