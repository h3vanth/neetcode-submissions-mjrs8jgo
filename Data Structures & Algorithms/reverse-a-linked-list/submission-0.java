/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {
    public ListNode reverseList(ListNode head) {
        if (head == null) {
            return head;
        }

        ListNode prevNode = null;
        ListNode currentNode = head;
        ListNode tempNode = null;
        
        while (true) {
            tempNode = currentNode.next;
            currentNode.next = prevNode;
            prevNode = currentNode;
            if (tempNode == null) {
                break;
            }
            currentNode = tempNode;
        }
        return currentNode;
    }
}
