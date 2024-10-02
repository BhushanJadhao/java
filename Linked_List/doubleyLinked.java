
public class doubleyLinked {
    class Node{
    int value;
    Node next;
    Node prev;
        Node (int value){
        this.value=value;
        }

}
private Node head;
private Node tail;
private int length;
public doubleyLinked(int value){
    Node newNode=new Node(value);
    head=newNode;
    tail=newNode;
    length=1;
} 
public void printDlist(){
    Node temp=head;
    while(temp!=null){
        System.out.println(temp.value);
        temp=temp.next;
        
    }
}
public void getHead(){
    System.out.println("Head "+head.value);
}
public void getTail(){
    System.out.println("tail "+tail.value);
}
public void length(){
    System.out.println("length "+length);

}
public void append(int value){
    Node newNode=new Node(value);
    if(length==0){
        head=newNode;
        tail=newNode;
    }else{
        tail.next=newNode;
        newNode.prev=tail;
        tail=newNode;
    }
    length++;
}
public Node removeLast(){
     Node temp=tail;
    if(length==0){
        return null;
    }
    if(length==1){
        head=null;
        tail=null;
    }
    else{
        tail=tail.prev;
        temp.next=null;
        temp.prev=null;
    }
    length--;
    return temp;
}
public void prepend(int value){
    Node newNode=new Node(value);
    if(length==0){
        head=newNode;
        tail=newNode;
    }
    else{
    newNode.next=head;
    head=newNode;
    head.prev=null;
    }
    length++;
}
public Node removeFirst(){
     Node temp=head;
    if(length==0){
        return null;
    }
    if(length==1){
        head=null;
        tail=null;
    }
    else{
        head=head.next;
        head.prev=null;
        temp.next=null;
    }
    length--;
    return temp;
}
public Node get(int index){
    if(index<0 || index>=length){
        return null;
    }
    Node temp=head;
    if(index<=length/2){
        for(int i=0;i<index;i++){
            temp=temp.next;
        }
        return temp;
    }
    else{
        temp=tail;
        for(int i=length-1;i>index;i--){
            temp=temp.prev;
        }
        return temp;
    }
}
public boolean set(int value,int index){
    Node temp=get(index);
    if(temp!=null){
        temp.value=value;
        return true;
    }
    return false;
}
public boolean insert(int value,int index){
    if(index<0 || index>=length){
        return false;
    }
    if (index==0){
        prepend(value);
        return true;
    }
    if(index==(length )){
        append(value);
        return true;
    }
    Node newNode=new Node(value);
    Node before=get(index-1);
    Node after=before.next;
    newNode.next=after;
    before.next=newNode;
    after.prev=newNode;
    newNode.prev=before;
    length++;
    return true;
}
public Node remove(int index){
    if(index<0 || index>=length){
        return null;
    }
    Node temp=get(index);
    Node before=temp.prev;
    Node after=temp.next;
    before.next=after;
    temp.next=null;
    after.prev=before;
    temp.prev=null;
    length--;
    return temp;
}
public static void main(String [] args){
doubleyLinked myDDL=new doubleyLinked(0);
myDDL.append(1);
myDDL.append(2);
// System.out.println(myDDL.removeFirst().value);
// System.out.println("value at that index is :" +myDDL.get(0).value);
myDDL.insert(45,2);
myDDL.getHead();
myDDL.getTail();
myDDL.length();
myDDL.printDlist();
System.out.println("removed value is"+myDDL.remove(2).value);
myDDL.printDlist();
}
}
