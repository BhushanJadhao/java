public class digitProduct {
    public static void main(String[] args) {
        int ans=product(345);
        System.out.println(ans);
    }
    static int product(int n){
        if(n==(n%10)){
            return n;
        }
        return (n%10)*product(n/10);
    }
}
