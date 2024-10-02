package practice.normalPractice;

public class Rst {
    public static void main(String[] args) {
        String str="Bhushan";
//        String res="";
////        for(int i=str.length()-1;i>=0;i--){
////            res+=str.charAt(i);
////        }
////        System.out.println(res);
//        char[]arr=str.toCharArray();
//        for(int i=arr.length-1;i>=0;i--){
//            res+=arr[i];
//        }
//        System.out.println(res);

        StringBuilder sb=new StringBuilder(str);
        sb=sb.reverse();
        System.out.println(sb);
    }
}
