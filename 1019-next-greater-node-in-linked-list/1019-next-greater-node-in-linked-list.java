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
    public int[] nextLargerNodes(ListNode head) {
        if(head==null) return null; 
        ListNode temp=head;
        int c=0;
        while(temp!=null){
            temp=temp.next;
            c++;
        }
        temp=head;
        int a[]=new int[c];
        int i=0;
        while(temp!=null){
              ListNode cur=temp.next;
              a[i]=0;
              while(cur!=null){
                if(cur.val>temp.val){
                    a[i]=cur.val;
                    break;
                }
                cur=cur.next;
              }
              temp=temp.next;
              i++;
        }
        return a;
    }
}