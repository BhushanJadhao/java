package LinkedList.prackcticeLL;

public class Main {
    public static void main(String[] args) {
        LinkedList ll=new LinkedList();
        ll.prepend(1);
        ll.append(3);
        ll.insert(2,1);
        ll.display();
        ll.remove(1);
        ll.display();

        System.out.println(ll.get(0));
    }
}
