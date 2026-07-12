//Del Node in LL(LC 237)
//Optimal---Node ops---T.C:O(n)------S.C:O(1)
//USING THE LC TEMPLATE

package Microsoft.Medium;
class p7{
    public void deleteNode(ListNode node) {
        ListNode prev=null;
        while(node.next!=null)
        {
            node.val=node.next.val;
            prev=node;
            node=node.next;
        }
        prev.next=null;
    }
}

class ListNode {
     int val;
     ListNode next;
     ListNode(int x) { val = x; }
}