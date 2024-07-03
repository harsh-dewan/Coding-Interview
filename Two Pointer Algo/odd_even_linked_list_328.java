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
    public ListNode oddEvenList(ListNode head) {
        if( head == null || head.next == null ) return head;
        ListNode odd = head;
        ListNode even = head.next;
        ListNode curr = even.next;
        ListNode evenHead = even;
        boolean oddIndex = true;
        while( curr != null ) {
            if( oddIndex == true ) {
                //curr is at odd index
                odd.next  = curr;
                odd = odd.next;
                oddIndex = false;
            }
            else {
                //curr is at even index
                oddIndex = true;
                even.next = curr;
                even = even.next;
            }
            curr = curr.next;
        }
        odd.next = evenHead;
        even.next = null;
        return head;

    }
}
