/**
 * Definition for singly-linked list.
 * class ListNode {
 *     constructor(val = 0, next = null) {
 *         this.val = val;
 *         this.next = next;
 *     }
 * }
 */

class Solution {
    /**
     * @param {ListNode} head
     * @param {number} n
     * @return {ListNode}
     */
    removeNthFromEnd(head, n) {
        let reversedHead = this.reverseList(head);
        let copy = reversedHead;

        if (n == 1) {
            return reversedHead.next ? this.reverseList(reversedHead.next) : null;
        }

        while (true) {
            if ((--n - 1) > 0) {
                copy = copy.next;
            } else {
                break;
            }
        }

        if (copy?.next) {
            copy.next = copy.next.next;
        }

        return this.reverseList(reversedHead);
    }

    reverseList(node) {
        let prevNode = null;
        let currentNode = node;
        let tempNode = null;
        
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
