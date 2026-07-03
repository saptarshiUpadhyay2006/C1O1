//Merge Two Sorted Lists(LC 21)
//Optimal Approach---Pointer Approach----T.C:O(n+m)------S.C:O(1)
//USING THE LC TEMPLATE
package Amazon.Easy;

class ListNode {
     int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }
class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        
        if(list1==null)
        return list2;
        if(list2==null)
        return list1;

        ListNode res=list1;
        while(list1!=null && list2!=null)
        {
            ListNode t=list1;
            while(list1!=null && list1.val<=list2.val)
            {
                t=list1;
                list1=list1.next;
            }
            t.next=list2;
            ListNode t2=list1;
            list1=list2;
            list2=t2;
        }
        return res;
    }
}