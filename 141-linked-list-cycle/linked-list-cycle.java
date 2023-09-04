/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        while(head != null){
            if(head.val == -9999){
                return true;
            }
            if(head.next == null){
                return false;
            }
            head.val = -9999;
            head = head.next;
        }
        return false;
    }
}