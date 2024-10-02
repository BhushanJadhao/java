public class stack {
    private Node top;
    private int height;

    class Node{
        int value;
        Node next;
        Node(int value){
            this.value=value;
        }
    }
    stack(int value){
        Node newNode=new Node(value);
        top=newNode;
        height=1;
    }
    public void printStack(){
        Node temp=top;
        while(temp!=null){
            System.out.print("->"+temp.value);
            temp=temp.next;
        }
    }
    public void push(int value){
        Node newNode=new Node(value);
        if(top==null){
            top=newNode;
        }
        else{
            newNode.next=top;
            top=newNode;
        }
        height++;

    }
    public void getTop(){
        System.out.println("currently on the top of the stack is :"+top.value+"\n");

    }
    public void height(){
        System.out.println("height of the stack is : "+ height +"\n");
    }
    public Node pop(){
        Node temp=top;
        if(top==null){
                return null;
        }
        else{
        top=temp.next;
        temp.next=null;
        height--;
        }
        return temp;
      
    }
    public static void main(String[] args){
        stack mystack=new stack(5);
        mystack.push(10);
        mystack.push(32);
        mystack.push(54);
        mystack.getTop();
        mystack.height();
        mystack.pop();
        mystack.getTop();
        mystack.height();
         mystack.printStack();


    }
    
}
