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
    public int getDecimalValue(ListNode head) {
        if(head.val==0 && head.next==null)return 0;
        if(head.val==1 && head.next==null)return 1;
        int n=head.val;
        ListNode curr=head.next;
        while(curr!=null){
            if(curr.val==0)n*=2;
            else n=n*2+1;
            curr=curr.next;
        }
        return n;
    }
}