//Merge k sorted lists(LC 23)
//Optimal Approach----T.C:O(m*n)------S.C:O(n)
//USING THE LC TEMPLATE

package Amazon.Hard;

class ListNode{
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
class p3{
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists==null||lists.length==0)
            return null;
        int k=lists.length;
        for(int i=1;i<k;i++)
        lists[0]=merge(lists[0],lists[i]);
        return lists[0];
    }
    private static ListNode merge(ListNode l1,ListNode l2)
    {
        ListNode p,dummy=new ListNode(0);
        p=dummy;
        while(l1!=null && l2!=null)
        {
            if(l1.val<l2.val)
            {
                p.next=l1;
                l1=l1.next;
            }
            else{
                p.next=l2;
                l2=l2.next;
            }
            p=p.next;
        }
        p.next=(l1==null)?l2:l1;
        return dummy.next;
    }
}