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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if( head == null ) return head;
        int countNodes = 0;
        ListNode curr = head;
        while( curr != null ) {
            countNodes += 1;
            curr = curr.next;
        }
        if( countNodes == n ) return head.next;
        int index = countNodes-1;
        curr = head.next;
        ListNode prev = head;
        while( index != n ) {
            prev = curr;
            curr = curr.next;
            index -= 1;
        }
        prev.next = curr.next;
        return head;
    }
}
