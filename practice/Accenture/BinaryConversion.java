package practice.Accenture;
import java.util.Scanner;
public class BinaryConversion {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        String output=binaryString(num);
        System.out.println(output);
    }
    static String binaryString(int num){
        StringBuilder result=new StringBuilder();
        if(num>0){
            int remainder=num%2;
            result.append(remainder);
            num=num/2;
        }
        return result.reverse().toString();
    }
}
