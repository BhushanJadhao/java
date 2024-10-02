public class minimumElement {
    public static void main(String[] args) {
        int[] A={1,4,45,6,-50,10,2};
        int n=A.length;
        System.out.println(findMin(A,n));
    }
    static int findMin(int []A,int n){
        if(n==1){
            return A[0];
        }
        return Math.min(A[n-1],findMin(A,n-1));
    }
}
