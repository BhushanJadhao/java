// Definition for singly-linked list.
class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}

public class Solution {

    // Recursive function to reverse the linked list
    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) {
            return head; // Base case: if head is null or only one node
        }

        // Recursively reverse the rest of the list
        ListNode newHead = reverseList(head.next);

        // Reverse the current node's pointer
        ListNode front = head.next;
        front.next = head;
        head.next = null; // Set current node's next to null

        return newHead; // Return the new head of the reversed list
    }

    // Function to print the linked list
    public void printList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
        System.out.println();
    }

    // Helper function to create a linked list from an array
    public ListNode createList(int[] values) {
        if (values.length == 0) return null;

        ListNode head = new ListNode(values[0]);
        ListNode current = head;

        for (int i = 1; i < values.length; i++) {
            current.next = new ListNode(values[i]);
            current = current.next;
        }

        return head;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        // Create a linked list from an array
        int[] values = {1, 2, 3, 4, 5};
        ListNode head = solution.createList(values);

        // Print the original list
        System.out.println("Original list:");
        solution.printList(head);

        // Reverse the list
        ListNode reversedHead = solution.reverseList(head);

        // Print the reversed list
        System.out.println("Reversed list:");
        solution.printList(reversedHead);
    }
}
