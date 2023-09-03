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
    public ListNode middleNode(ListNode head) {
        ListNode temp = head;
        int idx = 0;
        int i = 1;
        while(temp != null){
            idx++;
            temp = temp.next;
        }
        int mid = idx/2 + 1;
        temp = head;
        while(temp != null){
            if(i == mid){
                return temp;
            }
            i++;
            temp = temp.next;
        }
        return temp;
    }
}