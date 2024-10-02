package practice.Accenture;
import java.util.*;

public class BinaryStringEvaluation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String input=sc.nextLine();
        System.out.println(OperationsBinaryString(input));
    }
    static int OperationsBinaryString(String str){
        if(str.equals("")){
            return -1;
        }
        int result=str.charAt(0)-'0';
        for(int i=1;i<str.length();i+=2){
            char optimal=str.charAt(i);
            if(optimal=='A'){
                result &=str.charAt(i +1)-'0';
            }else if(optimal=='C'){
                result^=str.charAt(i +1)-'0';
            }else{
                result|=str.charAt(i +1)-'0';
            }
        }
        return result;
    }
}
