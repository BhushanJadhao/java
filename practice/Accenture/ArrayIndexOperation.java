package practice.Accenture;

public class ArrayIndexOperation {
    public static void main(String[] args) {
        int [] arr={1,2,4,2,1};
        int sumValue=0;
        int xorValue=0;
        for(int i=0;i<arr.length;i++){
           if(i%2==0){
               sumValue+=arr[i];
           }else{
               xorValue^=arr[i];
           }
        }
        System.out.println(sumValue+xorValue);
    }
}
