/*
* Given a number N your Task is to make N a single digit number by performing these operations

1) If N is odd

make it floor (N/2)

2) If N is even, make it floor ((N - 2) / 2)

3) If N is already a single digit, print as it is

Example:

Input 1: N = 25

Output 1: 12

Input 2: N = 10

Output: 4

Input 3: N=5

Output:5
*
* */


package practice.Accenture;
import  java.util.Scanner;
public class numberProblem {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter your number : ");
        int num=sc.nextInt();
        int result=0;
       while(num>=10){
           if(num%2==0){
               num=(int)Math.floor((num - 2) / 2);
           }else{
               num=(int)Math.floor(num/2);
           }
       }
       result=num;
        System.out.println(result);
    }
}
