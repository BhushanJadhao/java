package practice.Accenture;

import java.util.Scanner;

public class characterSwap {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Type your String : ");
        String str=sc.nextLine();
        System.out.println("Enter your char1 : ");
        char ch1=sc.next().charAt(0);
        System.out.println("Enter your char2 : ");
        char ch2=sc.next().charAt(0);

        String output=swapString(str,ch1,ch2);
        System.out.println(output);

    }
    static String swapString(String str,char ch1,char ch2){
        StringBuilder result=new StringBuilder();
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==ch1){
                result.append(ch2);
            }else if(str.charAt(i)==ch2){
                result.append(ch1);
            }else{
                result.append(str.charAt(i));
            }
        }
        return result.toString();
    }
}
