/****************************************************************

 Following is the class structure of the Node class:

 class Node {
     public int data;
     public Node next;

     Node()
     {
         this.data = 0;
         this.next = null;
     }

     Node(int data)
     {
         this.data = data;
         this.next = null;
     }

     Node(int data, Node next)
     {
         this.data = data;
         this.next = next;
     }
 };

 *****************************************************************/

public class Solution {
    public static Node rotate(Node head, int k) {
        Node slow = head;
        Node fast = head;
        if (head == null) {
            return null;
        }
        Node tmp = head;
        int count = 0;
        while (tmp!= null) {
            tmp = tmp.next;
            count ++;
        }
        k = k % count;
        for (int i = 0; i < k ; i++) {
            fast = fast.next;
        }
        while(fast.next != null) {
            slow = slow.next;
            fast = fast.next;
        }
        fast.next = head;
        Node result = slow.next;
        slow.next = null;
        return result;
    }
}
