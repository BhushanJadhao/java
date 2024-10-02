import java.util.Arrays;
public class maxMin {
    public static void main(String[] args) {
        int[] myList1={5,3,8,1,6,9};
        int []result1=findMaxMin(myList1);
        System.out.println("myList1 max and the min vaiues are"+ Arrays.toString(result1));
    }
    public static int [] findMaxMin(int[] myList){
        int maximum=myList[0];
        int minimum=myList[0];
        for (int i=0;i<myList.length;i++){
            if(myList[i]>maximum){
                maximum=myList[i];
            }else if(myList[i]<minimum){
                minimum=myList[i];
            }
        }
        return new int[] {maximum,minimum};
    }

}
