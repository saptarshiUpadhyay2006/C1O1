package TUF_QR;

class ListNode{
    int val;
    ListNode next;

    ListNode() {
        val = 0;
        next = null;
    }

    ListNode(int data1) {
        val = data1;
        next = null;
    }

    ListNode(int data1, ListNode next1) {
        val = data1;
        next = next1;
    }
}

class p20{
    public boolean isPalindrome(ListNode head) {
        if(head==null||head.next==null)
        return true;

        ListNode slow=head;
        ListNode fast=head;
        while(fast.next!=null && fast.next.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode newHead=rev(slow.next);
        ListNode f=head;
        ListNode s=newHead;
        while(s!=null)
        {
            if(f.val!=s.val)
            {
                rev(newHead);
                return false;
            }
            f=f.next;
            s=s.next;
        }
        rev(newHead);
        return true;
    }

    private ListNode rev(ListNode head)
    {
        ListNode prev=null;
        ListNode curr=head;
        while(curr!=null)
        {
            ListNode next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        return prev;
    }
}