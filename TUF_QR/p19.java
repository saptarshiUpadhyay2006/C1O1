package TUF_QR;

class ListNode{
    public int data;
    public ListNode next;
    ListNode() { data = 0; next = null; }
    ListNode(int x) { data = x; next = null; }
    ListNode(int x, ListNode next) { data = x; this.next = next; }
}

class p19{
    public ListNode sortList(ListNode head) {
        //YOUR CODE GOES HERE
        if(head==null||head.next==null)
        return head;
        ListNode temp=head;
        ListNode zero=new ListNode(-1);
        ListNode one=new ListNode(-1);
        ListNode two=new ListNode(-1);
        ListNode z=zero;
        ListNode o=one;
        ListNode t=two;

        while(temp!=null)
        {
            if(temp.data==0)
            {
                z.next=temp;
                z=temp;
            }
            else if(temp.data==1)
            {
                o.next=temp;
                o=temp;
            }
            else if(temp.data==2)
            {
                t.next=temp;
                t=temp;
            }
            temp=temp.next;
        }

        z.next=(one.next!=null)?one.next:two.next;
        o.next=two.next;
        t.next=null;
        ListNode f=zero.next;
        return f;
    }
}