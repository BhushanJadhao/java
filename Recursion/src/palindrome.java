public class palindrome {
    static int rev(int n){
        int reversed=0;
        while(n!=0){
            int rem=n%10;
            reversed=reversed*10+rem;
            n=n/10;
        }
        return reversed;
    }
    static boolean palin(int n){
        return n==rev(n);
    }
    public static void main(String[] args) {
        System.out.println(palin(1234321));
    }
}
