package practice.normalPractice;
import java.util.ArrayList;
import java.util.Scanner;
public class printAllDivisor {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your number: ");
        int n=sc.nextInt();
        ArrayList<Integer> al=new ArrayList<>();
        for(int i=1;i<=Math.sqrt(n);i++){
            if(n%i==0){
                al.add(i);
                if(n/i!=i){
                    al.add(n/i);
                }

            }
        }
        System.out.println(al);
    }
}
