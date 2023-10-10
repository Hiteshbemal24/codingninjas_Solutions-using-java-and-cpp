import java.util.* ;
import java.io.*; 
/****************************************************************

    Following is the class structure of the LinkedListNode class:
	
	class LinkedListNode<T> {
    	T data;
    	LinkedListNode<T> next;

    	public LinkedListNode(T data) {
        	this.data = data;
    	}
	}

*****************************************************************/

public class Solution {

	public static boolean isPalindrome(LinkedListNode<Integer> head) {
		 if (head == null || head.next == null) {
            return true; 
        }

        LinkedListNode<Integer> slow = head;
        LinkedListNode<Integer> fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        LinkedListNode<Integer> reversedHalf = reverseLinkedList(slow);

        while (reversedHalf != null) {
            if (!head.data.equals(reversedHalf.data)) {
                return false;
            }
            head = head.next;
            reversedHalf = reversedHalf.next;
        }

        return true;
    }

    private static LinkedListNode<Integer> reverseLinkedList(LinkedListNode<Integer> head) {
        LinkedListNode<Integer> prev = null;
        LinkedListNode<Integer> current = head;
        LinkedListNode<Integer> next = null;

        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }

        return prev;
	}
}
