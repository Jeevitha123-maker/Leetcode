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
    public void reorderList(ListNode head) {

        ListNode s=head;
        ListNode f=head;
        while(f!=null && f.next!=null){
            s=s.next;
            f=f.next.next;
        }
        ListNode c=s.next;
        s.next=null;
        ListNode p=null;
        ListNode n=null;
        while(c!=null){
            n=c.next;
            c.next=p;
            p=c;
            c=n;
        }
        ListNode l1=head;
        ListNode l2=p;
        while(l2!=null){
            ListNode t1=l1.next;
            ListNode t2=l2.next;
            l1.next=l2;
            l2.next=t1;
            l1=t1;
            l2=t2;
        }
        return ;
    }
}
// /**
//  * Definition for singly-linked list.
//  * public class ListNode {
//  *     int val;
//  *     ListNode next;
//  *     ListNode() {}
//  *     ListNode(int val) { this.val = val; }
//  *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
//  * }
//  */
// class Solution {
//     public void reorderList(ListNode head) {
//         if(head==null ||head.next==null) return head;
//         ListNode fast=head;
//         ListNode slow=head;
//         while(fast!=null && fast.next!=null){
//             slow=slow.next;
//             fast=fast.next.next;
//         }
//         ListNode fh=slow;
//         ListNode sh=slow.next;
//         slow.next=null;
//         ListNode prev=null;
//         ListNode sh=slow.next;
//         ListNode next=null;
//         while(sh!=null){ 
//           next=sh.next;
//           sh.next=prev;
//            prev=sh;
//            sh=next;
//         }
//         head=prev;
//     }
// }