//Palindrome linked Lists(LC 160)
//Optimal Approach---rev & use----T.C:O(n)------S.C:O(1)
//USING THE LC TEMPLATE
package Amazon.Easy;

class ListNode {
     int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }

 class p10{
    public boolean isPalindrome(ListNode head) {
        ListNode slow=head,fast=head;
        while(fast!=null && fast.next!=null)
        {
            fast=fast.next.next;
            slow=slow.next;
        }

        if(fast!=null)
        slow=slow.next;

        slow=rev(slow);
        fast=head;

        while(slow!=null && fast!=null)
        {
            if(slow.val!=fast.val)
            return false;

            fast=fast.next;
            slow=slow.next;
        }
        return true;
    }
    private static ListNode rev(ListNode head)
    {
        ListNode prev=null;
        while(head!=null)
        {
            ListNode next=head.next;
            head.next=prev;
            prev=head;
            head=next;
        }
        return prev;
    }
}