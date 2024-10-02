package LinkedList;

public class DoubleyLinkedList {
    private Node head;
    private Node tail;
    private int length;

    public DoubleyLinkedList(){
        this.length=0;
    }
    class Node{
        int value;
        Node next;
        Node prev;
        public Node(int value){
            this.value=value;
        }

    }
    public void prepend(int value){
        Node newNode = new Node(value);
        if(length==0){
            head=newNode;
            tail=newNode;
        }else{
            newNode.next=head;
            head.prev=newNode;
            head=newNode;
        }

        length++;

    }
    public Node get(int index){
        if(index<0 || index>length-1){
            return null;
        }
        Node temp=head;
        for(int i=0;i<index;i++){
            temp=temp.next;
        }
        return temp;
    }
    public void append(int value){
        if(length==0){
            prepend(value);
        }
        Node newNode=new Node(value);
        tail.next=newNode;
        newNode.prev=tail;
        tail=newNode;
        length++;
    }
//   public void display(){
//        Node temp=head;
//        while(temp!=null){
//            System.out.print(temp.value + "->");
//            temp=temp.next;
//        }
//       System.out.println("end");
//   }
    public boolean insert(int index,int value){
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
        Node before=get(index-1);
        Node after=before.next;
        newNode.prev=before;
        newNode.next=after;
        before.next=newNode;
        after.prev=newNode;
        length++;
        return true;
    }
public void display() {
    Node temp = head;
    while (temp != null) {
        System.out.print(temp.value + "->");
        temp = temp.next;
    }
    System.out.println("end");
}
}
