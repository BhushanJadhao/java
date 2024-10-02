package practice.Accenture;

public class ReboundHeight {
    public static void main(String[] args) {
        int H=100;
        int V=20;
        int Vn=10;
        int n=3;
        int result=reboundHeight(H,V,Vn,n);
        System.out.println(result);

    }

    private static int reboundHeight(int h, int v, int vn, int n) {
        double e=(double)v/vn;
        return (int)(h*Math.pow(e,n));
    }

}
