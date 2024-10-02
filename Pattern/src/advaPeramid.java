 /*

        *
        * *
        * * *
        * * * *
        * * *
        * *
        *

  */

public class advaPeramid {
    public static void main(String[] args) {
        pattern4(4);
    }
    static void pattern4(int n){
        for(int row=0;row<2*n;row++){
           int totalRowInCol= row> n? 2*n-row :row;
           for(int col=0;col<totalRowInCol;col++){
               System.out.print("*"+" ");
           }
            System.out.println();
        }
    }
}
