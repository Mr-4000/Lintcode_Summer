/**
 * Definition for ListNode
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */

public class Solution {
    /**
     * @param head: the head of linked list.
     * @return: a middle node of the linked list
     */
    public ListNode middleNode(ListNode head) {
        if (head==null) {
            return null;
        }
        // write your code here
        ListNode a = new ListNode(0);
        ListNode b = new ListNode(0);
        a.next = head;
        b.next = head;
        int fl=1;
        while (b!=null) {
            if (fl==-1) {
                a=a.next;
            }
            b=b.next;
            fl = fl*-1;
        }
        return a;
    }
}