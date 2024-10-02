package LinkedList.prackcticeLL;

public class linearSearch {
    public static void main(String[]arg){
        int [] arr={3,1,6,23,89,34};
        int target=23;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                System.out.println(i);
            }
        }
    }
}
