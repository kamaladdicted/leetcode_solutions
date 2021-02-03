/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int headValue = l1.val + l2.val;
        int carry = 0;
        if(headValue >= 9){
            carry = headValue/10;
            headValue = headValue%10;
        }
        ListNode output = new ListNode(headValue);
        ListNode current = output;
        while(l1.next != null || l2.next != null){
            int value = carry;
            if(l1.next != null){
                l1 = l1.next;
                value = value + l1.val;
            }
            if(l2.next != null){
                l2 = l2.next;
                value = value + l2.val;
            }
            carry = value/10;
            current.next = new ListNode(value%10);
            current = current.next;
        }
        if(carry != 0){
            current.next = new ListNode(carry);
        }
        return output;
    }
}