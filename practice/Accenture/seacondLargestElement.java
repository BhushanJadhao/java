package practice.Accenture;
import java.util.Scanner;

public class seacondLargestElement {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter yours Array Size : ");
        int n=sc.nextInt();
        int []arr=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int secLastElement=seacondLargestElement(arr);
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==secLastElement){
                count++;
            }
        }
        System.out.println("count of seacond largest Element is : "+ count);
    }
    static int seacondLargestElement(int [] arr){
        int last=arr.length-1;
        int secLastElement=0;
        for(int i=arr.length-2;i>=0;i--){
            if(arr[i]!=arr[i+1]){
                secLastElement=arr[i];
                break;
            }
        }
        return secLastElement;
    }
}
