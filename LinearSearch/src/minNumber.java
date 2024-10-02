public class minNumber {
    public static void main(String[] args) {
        int arr[]={12,34,-7,90,13,90};
        System.out.println(min(arr));
    }
    public static int min(int arr[]){
        int minimum=arr[0];
        for(int num:arr){
            if(num<minimum){
                minimum=num;
                return minimum;
            }
        }
        return minimum;
    }
}
