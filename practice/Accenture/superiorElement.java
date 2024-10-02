package practice.Accenture;
import java.util.*;

public class superiorElement {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int []arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int result=superiorElement(arr);
        System.out.println("Number of superior element in this arr are : "+result);

    }
    public static int superiorElement(int [] arr){

        if(arr.length==0){
            return 0;
        }
        int superior=Integer.MIN_VALUE;
        int count=0;
        for(int i=arr.length-1;i>=0;i--){
            if(arr[i]>superior){
                superior=arr[i];
                count ++;

            }
        }
        return count;
    }
}
