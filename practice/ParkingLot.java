package practice;

public class ParkingLot {
    public static void main(String[] args) {
        char[] arr = {'X', 'X', 'X', 'S', 'X', 'X', 'S', 'X', 'X', 'S', 'S', 'X', 'X', 'S', 'X', 'X'};
        int result = maxCarsParked(arr);
        System.out.println(result);  // Output: 5
    }
    static int maxCarsParked(char[]arr){
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]=='S'){
                count ++;
            }
        }
        return count;
    }
}
