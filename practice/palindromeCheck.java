package practice;

public class palindromeCheck {
    public static void main(String[] args) {
        String str = "madam";
        System.out.println(isPalindrome(str)); // Output: 1

        str = "hello";
        System.out.println(isPalindrome(str));
    }

    static int isPalindrome(String str){
        int start=0;
        int end=str.length()-1;
        while(start<end){
            if(str.charAt(start)!=str.charAt(end)){
                return 0;
            }
            start++;
            end--;
        }
        return 1;
    }
}
