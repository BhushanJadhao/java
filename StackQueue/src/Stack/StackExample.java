
package Stack;
import java.util.*;

public class StackExample {
    public static void main(String[] args) {
        Stack<Integer> stack=new Stack<>();
        stack.push(10);
        stack.push(15);
        stack.push(45);
        stack.push(100);

        System.out.println(stack.pop());
        System.out.println(stack.peek());
        System.out.println(stack.isEmpty());

    }
}
