package LinkedList;

public class circularLinkedList {
    private Node head;
    private Node tail;


    public circularLinkedList(){
    this.head=null;
    this.tail=null;
    }
    public void insert(int val){
        Node newNode=new Node(val);
        if(head==null){
            head=newNode;
            tail=newNode;
            return;
        }
        tail.next=newNode;
        newNode.next=head;
        tail=newNode;
    }
    public void display(){
        Node temp=head;
        if(head!=null){
            do{
                System.out.print(temp.value + "->");
                temp=temp.next;
            }while(temp!=head);
            System.out.println("HEAD");
        }

    }
    class Node{
        int value;
        Node next;
        public Node(int value){
            this.value=value;
        }
    }
}
