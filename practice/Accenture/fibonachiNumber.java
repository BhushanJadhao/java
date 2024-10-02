package practice.Accenture;
import  java.util.Scanner;

public class fibonachiNumber {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int output=fiboNum(n);
        System.out.println(output);
    }
    static int fiboNum(int n){
        if(n<2){
            return n;
        }
        return fiboNum(n-1)+fiboNum(n-2);
    }
}
