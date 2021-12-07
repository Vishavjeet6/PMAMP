package leetcode60;

public class AddTwoNumbers2 {

}

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
        ListNode lhead = new ListNode(0);
        ListNode l3 = lhead;
        int carry = 0;
        
        while(l1 != null || l2 != null || carry > 0){
            int sum = carry;
            if(l1 != null) sum += l1.val;
            if(l2 != null) sum += l2.val;
            carry = sum/10;
            l3.next = new ListNode(sum%10);
            l3 = l3.next;
            if(l1 != null) l1 = l1.next;
            if(l2 != null) l2 = l2.next;
        }
        return lhead.next;
// time- o(n)
// space- o(n)
    }
}