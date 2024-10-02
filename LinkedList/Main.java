package LinkedList;

import org.w3c.dom.css.CSSImportRule;

public class Main {
    public static void main(String[] args) {
        LinkedList ll=new LinkedList();
        ll.prepend(10);
        ll.prepend(20);
        ll.prepend(30);
        ll.prepend(40);
        ll.append(50);
        ll.display();
        ll.deletLast();
        ll.display();
        System.out.println(ll.Delete(2));
        ll.display();
//        DoubleyLinkedList dll=new DoubleyLinkedList();
//        dll.prepend(4);
//        dll.prepend(3);
//        dll.prepend(2);
//        dll.prepend(1);
//        dll.append(5);
//        dll.insert(0,10);
//
//        dll.display();
//        System.out.println("Circular Linked List");
//        circularLinkedList cll=new circularLinkedList();
//        cll.insert(10);
//        cll.insert(20);
//        cll.insert(30);
//        cll.insert(40);
//        cll.display();


    }
}
