package practice;
/*
* Problem statement
Let j and k be two indices in an array A.
If j < K and A[j] > A[k], then the pair (j,k) is known as an “Inversion pair”.
You are required to implement the following function:
int InversionCount(int *A, int n);
The function accepts an array ‘A’ of ‘n’ unique integers as its argument. You are required to
calculate the number of ‘Inversion pair’ in an array A, and return.
Note:
If ‘A’ is NULL (None in case of python), return -1
If ‘n’ <2, return 0
Example:
Input:
A: 1 20 6 4 5
n: 5
Output:
5
Explanation:
The inversion pair in array A are (20,6),(20,4),(20,5),(6,4) and (6,5), the count of the inversions are
5, hence 5 is returned.
The custom input format for the above case:
5
1 20 6 4 5
(The first line represents the size of the array, the second line represents the elements of the array)
Sample Input
A: 13 10 9 6 21 15 14
n: 7
Sample Output
9
The custom input format for the above case:
7
13 10 9 6 21 15 14
* */
public class InversionCountInArr {
    public static int InversionCount(int[] A, int n) {
        int count=0;
        if(A==null){
            return -1;
        }
       for(int i=0;i<A.length;i++){
           for(int j=i+1;j<A.length;j++){
               if(A[i]>A[j]){
                   count+=1;
               }
           }
       }
        return count; // Placeholder return value
    }

    public static void main(String[] args) {
        // Example usage
        int[] arr1 = {1, 20, 6, 4, 5};
        int n1 = 5;
        System.out.println("Inversion Count for arr1: " + InversionCount(arr1, n1)); // Expected output: 5

        int[] arr2 = {13, 10, 9, 6, 21, 15, 14};
        int n2 = 7;
        System.out.println("Inversion Count for arr2: " + InversionCount(arr2, n2)); // Expected output: 9

        int[] arr3 = null;
        int n3 = 0;
        System.out.println("Inversion Count for arr3: " + InversionCount(arr3, n3)); // Expected output: -1
    }
}
