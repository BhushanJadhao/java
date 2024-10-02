package practice.Accenture;
import java.util.*;

public class areaOfCircularField {
    public static void main(String[] args) {
        int l=4;
        int result=area(l);
        System.out.println(result);
    }
    static int area(int l){
        return (int)(3.142*l*l);
    }
}
