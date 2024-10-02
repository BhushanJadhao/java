import java.util.Arrays;

public class Traingles {


    public static void main(String[] args) {
        traingle(4,0);
        traingle2(4,0);
        int[] arr={4,3,5,1};
        bubble(arr,arr.length-1);
        System.out.println(Arrays.toString(arr));

    }
    static void traingle(int r,int c){
        if(r==0){
            return;
        }
        if(c<r){
            System.out.print("*");
            traingle(r,c+1);
        }else{
            System.out.println(" ");
            traingle(r-1,0);
        }
    }
    static void traingle2(int r,int c){
        if(r==0){
            return;
        }
        if(c<r){
            traingle2(r,c+1);
            System.out.print("*");
        }else{
            traingle2(r-1,0);
            System.out.println(" ");
        }
    }
    static void bubble(int [] arr,int end){
        if(end==0){
            return;
        }
        for(int i=0;i<end;i++){
            if(arr[i]>arr[i+1]){
                int temp=arr[i];
                arr[i]=arr[i + 1];
                arr[i+1]=temp;
            }
        }
        bubble(arr,end-1);
    }


}
