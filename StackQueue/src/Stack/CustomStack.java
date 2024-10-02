package Stack;

public class CustomStack {
    protected int[] data;
    private static final int DEFAULT_SIZE=10;

    int ptr=-1;
    public CustomStack(){

        this.data=new int[DEFAULT_SIZE];
    }

    public CustomStack(int Size){

        this.data=new int[Size];
    }

    public boolean push(int value) throws Exception {
        if(isFull()){
            throw new Exception("Sorry Stack reaches its maximum length!!");
        }
        ptr++;
        data[ptr]=value;
        return true;
    }
    public int pop() throws Exception{
        if(isNull()){
            throw new Exception("Sorry your Stack is Empty!!!");
        }
        int removed=data[ptr];
        ptr--;
        return removed;
    }
    public boolean isFull(){
        return ptr==data.length-1;
    }
    public boolean isNull(){
        return ptr==-1;
    }

    public static void main(String[] args) throws Exception{
        CustomStack stack=new CustomStack();
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(11);
        stack.push(43);
        stack.push(23);
        System.out.println(stack.pop());
        System.out.println(stack.pop());


    }
}
