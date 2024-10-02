package LinkedList.prackcticeLL;

public class LinkedList {
    private Node head;
    private Node tail;
    private int length;
    public LinkedList(){
        this.length=0;
    }
    public void prepend(int value){
        Node newNode= new Node(value);
        if(length==0){
            head=newNode;
            tail=newNode;
        }else{
            newNode.next=head;
            head=newNode;
        }
        length++;
    }
    public Node get(int index){
        if(index<0 || index>=length){
            return null;
        }
        Node temp=head;
        for(int i=0;i<index;i++){
            temp=temp.next;
        }
        return temp;
    }
    public void append(int value){
        Node newNode=new Node(value);
        if(length==0){
            prepend(value);
        }
        Node temp=get(length-1);
        temp.next=newNode;
        length++;
    }
    public boolean insert(int value,int index){

        if(index<0 || index>length){
            return false;
        }
        if(index==0){
            prepend(value);
            return true;
        }
        if(index==length){
            append(value);
            return true;
        }
        Node newNode=new Node(value);
        Node temp=get(index-1);
        newNode.next=temp.next;
        temp.next=newNode;
        length++;
        return true;

    }
    public int removeFirst(){
        int val=head.value;
        head=head.next;
        if(head==null){
            tail.next=null;
        }
        length--;
        return val;
    }
    public int removeLast(){
      if(length<2){
          removeFirst();
      }
      Node temp=get(length-2);
      int val=temp.value;
      temp.next=null;
      length--;
      return val;
    }
    public int remove(int index){
        if(index==0){
             removeFirst();
        }
        if (index==length-1){
            removeLast();
        }
        Node temp=get(index-1);
        int val=temp.next.value;
        temp.next=temp.next.next;
        return val;
    }
    public void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.value + "->");
            temp=temp.next;
        }
        System.out.println("end");
    }

    class Node{
        int value;
        Node next;
        public Node(int value){
           this.value=value;
        }
    }
}
