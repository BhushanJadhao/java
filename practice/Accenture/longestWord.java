package practice.Accenture;
import java.util.Scanner;

public class longestWord {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter tour input String : ");
        String str=sc.nextLine();
        int size=longestSizeString(str);
        System.out.println("Maximum Size String in : " + size);
    }

    private static int longestSizeString(String str) {
//        if(str.equals(" ")){
//            return 0;
//        }
//        str=str.replace("."," ");
//        str=str.trim();
//        String[] words=str.split(" ");
//        int maxSize=0;
//        for(String wrd:words){
//            int size=wrd.length();
//            if(size>maxSize){
//                maxSize=size;
//            }
//        }
//        return maxSize;
        int maxSize=0;
        int startWindow=0;

        for(int endWindow=0;endWindow<=str.length();endWindow++){
            int size=0;
            if ( endWindow==str.length() ||  str.charAt(endWindow) == '.') {
                size=endWindow-startWindow;
                if(size>maxSize){
                    maxSize=size;
                }
                startWindow=endWindow+1;
            }
            }
        return maxSize;
        }
    }

