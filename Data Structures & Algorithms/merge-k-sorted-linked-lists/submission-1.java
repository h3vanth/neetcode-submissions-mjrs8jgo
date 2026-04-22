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
    private ListNode mergeLists(ListNode list1, ListNode list2) {
        ListNode dummy = new ListNode();
        ListNode tail = dummy;
        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                tail.next = list1;
                list1 = list1.next;
            } else {
                tail.next = list2;
                list2 = list2.next;
            }
            tail = tail.next;
        }
        if (list1 != null) {
            tail.next = list1;
        } else {
            tail.next = list2;
        }
        return dummy.next;
    }

    public ListNode mergeKLists(ListNode[] lists) {
        // Divide and Conquer - Strategy to recursively split and merge lists in pairs
        if (lists == null || lists.length == 0) return null;

        while (lists.length > 1) {
            List<ListNode> merged = new LinkedList<>();
            for (int i = 0; i < lists.length; i = i + 2) {
                ListNode n1 = lists[i];
                ListNode n2;
                if (i + 1 == lists.length) {
                    n2 = null;
                } else {
                    n2 = lists[i + 1];
                }
                merged.add(mergeLists(n1, n2));
            }
            lists = merged.toArray(ListNode[]::new);
        }
        return lists[0];
    }
}
