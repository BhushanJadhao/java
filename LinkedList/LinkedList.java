package LinkedList;

public class LinkedList {
    private Node head;
    private Node tail;
    private int size;
    public LinkedList(){
        this.size=0;
    }

    public LinkedList(int value){
        Node newNode=new Node(value);
        head=newNode;
        tail=newNode;
        size=1;
    }
    class Node{
        int value;
        Node next;
        Node(int value){
            this.value=value;
        }
    }
    public void prepend(int value){
        Node newNode=new Node(value);
        newNode.next=head;
        head=newNode;
        if(tail==null){
            tail=head;
        }
        size++;

    }
    public void append(int value){
        Node newNode=new Node(value);
        if(tail==null){
            prepend(value);
            return;

        }
        tail.next=newNode;
        tail=newNode;
        size++;
    }
    public Node get(int index){
        if(index<0 || index >= size){
            return null;
        }
        Node temp=head;
        for(int i=0;i<index;i++){
            temp=temp.next;
        }
        return temp;
    }
    public void setIndex(int index,int value){
        Node temp=get(index);
        if(temp!=null){
            temp.value=value;
        }
    }
    public boolean insert(int index,int value){
        if(index<0 || index>size){
            return false;
        }
        if(index==0){
            prepend(value);
            return true;
        }
        if(index==size){
            append(value);
            return true;
        }
        Node newNode=new Node(value);
        Node temp=get(index-1);
        newNode.next=temp.next;
        temp.next=newNode;
        size++;
        return true;

    }

    public int deletFirst(){
        int val=head.value;
        head=head.next;
        if(head==null){
            tail=null;
        }
        return val;
    }
    public int deletLast(){
        if(size<2){
            return deletFirst();
        }
        Node secondLast=get(size-2);
        int val=tail.value;
        tail=secondLast;
        tail.next=null;
        size--;
        return val;
    }

    public int Delete(int index){
        if(index==0){
            return deletFirst();
        }
        if(index==size-1){
            return deletLast();
        }
        Node prev=get(index-1);
        int value=prev.next.value;
        prev.next=prev.next.next;
        prev.next.next=null;
        return value;
    }
    public void display(){
        Node temp=head;
        while(temp != null){
            System.out.print(temp.value + "->");
            temp=temp.next;
        }
        System.out.println("End");
    }

}
