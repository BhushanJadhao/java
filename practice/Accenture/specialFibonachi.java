package practice.Accenture;
import java.util.Scanner;


public class specialFibonachi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of N:");
        int N = sc.nextInt();


        int result = specialFibonacci(N);
        System.out.println("The Nth term of the special Fibonacci sequence modulo 47 is: " + result);
    }
    static int specialFibonacci(int n){
        if(n==0 || n==1){
            return 1;
        }
        int[]fibo=new int[n+1];
        fibo[0]=1;
        fibo[1]=1;
        for(int i=2;i<=n;i++){
            fibo[i]=(fibo[i-1]*fibo[i-1] + fibo[i-2]*fibo[i-2])%47;
        }
        return fibo[n];
    }

}
