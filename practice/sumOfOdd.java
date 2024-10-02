package practice;
/*
. Sum of odd integers in array
Problem statement
An odd number is an integer which is not a multiple of 2.
You are required to implement the following function:
Int SumOddIntegers(int arr[], int n);
The function accepts an integer array ‘arr’ of length ‘n’ as its argument. You are required to
calculate the sum of all odd integers in an array ‘an’ and return the same.
Note:
Array can have negative integers
n > 0
Computed values lie within integer range
Example:
Input:
arr: 1 4 6 7 10 12 11 5
n: 8
Output:
24
Explanation:
The odd integers in array {1, 4, 6, 7, 10, 12, 11, 5} are {1, 7,11, 5} and their sum is 24, hence 24 is
returned.
The custom input format for the above case:
8
1 4 6 7 10 12 11 5
(The first line represents ‘n’ the second line represents the elements of the array)
Sample Input
arr: 2 4 9 7 11 13 25 31 6 8 10 24
n: 12
Sample Output
96
The custom input format for the above case:
12
2 4 9 7 11 13 25 31 6 8 10 24
(The first line represents ‘n’, the second line represents the elements of the array


public class Solution {

    public class sumOfOdd {
    public static int SumOddIntegers(int arr[], int n) {
        int sum=0;
        for(int num:arr){
            if(num%2!=0){
                sum+=num;
            }
        }
        return sum;
    }
        // Return the sum of odd integers
        return sum;
    }

    public static void main(String[] args) {
        // Define test cases
        int[][] testCases = {
            {1, 4, 6, 7, 10, 12, 11, 5},
            {2, 4, 9, 7, 11, 13, 25, 31, 6, 8, 10, 24},
            {1, 3, 5, 7, 9},
            {2, 4, 6, 8, 10},
            {-1, -2, -3, -4, -5},
            {0, 0, 0, 0, 0},
            {1},
            {-1},
            {1000000, 1000001, 1000002, 1000003, 1000004},
            {0, 1, -1, 2, -2}
        };

        // Define expected results for each test case
        int[] expectedResults = {
            24,  // Test case 1
            96,  // Test case 2
            25,  // Test case 3
            0,   // Test case 4
            -9,  // Test case 5
            0,   // Test case 6
            1,   // Test case 7
            -1,  // Test case 8
            2000004, // Test case 9
            0    // Test case 10
        };

        // Loop through the test cases
        for (int i = 0; i < testCases.length; i++) {
            // Get the current test case array
            int[] arr = testCases[i];
            // Get the length of the current test case array
            int n = arr.length;
            // Calculate the sum of odd integers using the function
            int result = SumOddIntegers(arr, n);
            // Check if the result matches the expected result
            if (result == expectedResults[i]) {
                System.out.println("Test case " + (i + 1) + " passed.");
            } else {
                System.out.println("Test case " + (i + 1) + " failed. Expected " + expectedResults[i] + " but got " + result);
            }
        }
    }
}

* */

public class sumOfOdd {
    public static int SumOddIntegers(int arr[], int n) {
        int sum=0;
        for(int num:arr){
            if(num%2!=0){
                sum+=num;
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        // Example usage
        int[] arr = {1, 4, 6, 7, 10, 12, 11, 5};
        int n = 8;
        System.out.println(SumOddIntegers(arr, n)); // Output should be 24
    }
}
