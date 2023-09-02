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
    public ListNode removeElements(ListNode head, int val) {
        if(head == null) return null;
        ListNode tempHead = new ListNode();
        // if(head.val == val){
        //     return null;
        // }
     
        ListNode temp = tempHead;
        // head = head.next;
        while(head != null){
            if(head.val != val){ 
                ListNode newNode = new ListNode(head.val);
                temp.next = newNode;
                temp = temp.next;
            }
            head = head.next;
        }

        return tempHead.next;
    }
}