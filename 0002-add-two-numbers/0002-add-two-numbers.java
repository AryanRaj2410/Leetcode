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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0);
        ListNode temp = dummy;
        int carry = 0;
        while(l1!=null || l2!=null)
        {
            int d1=0,d2=0;
            if(l1!=null){
                d1 = l1.val;
            }
            if(l2!=null){
                d2 = l2.val;
            }
            int sum = d1 + d2 + carry;
            int val = sum % 10;
            carry = (int)(sum/10);
            temp.next = new ListNode(val);
            temp = temp.next;
            if(l1!=null) l1 = l1.next;
            if(l2!=null) l2 = l2.next;
        }
        if(carry!=0) temp.next = new ListNode(carry);
        return dummy.next;
        
    }
}