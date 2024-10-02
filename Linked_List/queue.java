public class queue {
    class Node{
        int value;
        Node next;

        Node(int value){
            this.value=value;
        }


    }
    private Node first;
    private Node last;
    private int length;
    public queue(int value){
        Node newNode=new Node(value);
        first=newNode;
        last=newNode;
        length=1;
    }
    public void print(){
        Node temp=first;
        while(temp!=null){
            System.out.print("->"+temp.value+"");
            temp=temp.next;
        }
       
    }
    public void enqueue(int value){
        Node newNode=new Node(value);
        if(first==null){
            first=newNode;
            last=newNode;
        }
        last.next=newNode;
        last=newNode;
        length++;
    }
    public Node dequeue(){
        Node temp=first;
        if(length==0){
            return null;
        }
        if(length==1){
            first=null;
            last=null;
        }
        else
        {
            first=first.next;
            temp.next=null;
            length--;
        }
        return temp;

    }
    public void length(){
        System.out.print("\n Length of the queue is :"+length+"\n");
    }

    public void getFirst(){
        System.out.println("\nthe First value of the queue is :"+first.value+"\n");
    }
    public void getLast(){
        System.out.println("\nthe last value of the queue is :"+last.value+"\n");
    }
    public static void main(String[] args){
        queue myQueue=new queue(2);
       myQueue.enqueue(23);
       myQueue.enqueue(21);
       myQueue.enqueue(90);
       myQueue.print();
       System.out.println("\n--------------------------");
       System.out.println(myQueue.dequeue().value); 
       myQueue.print();
       myQueue.length();
       myQueue.getFirst();
       myQueue.getLast();
    }

    
}
