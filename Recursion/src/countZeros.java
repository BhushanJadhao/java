public class countZeros {
    public static void main(String[] args) {
        System.out.println(count(900032450));
    }
    static int count(int n){
       return  healper(n,0);
    }
    private static int healper(int n,int c){
        if(n==0){
            return c;
        }
        int rem=n%10;
        if(rem==0){
            return healper(n/10,c+1);
        }else{
            return healper(n/10,c);
        }
    }
}
