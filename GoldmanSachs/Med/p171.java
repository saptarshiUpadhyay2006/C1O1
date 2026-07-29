//Reorder list(LC 143)
//chalk out

package GoldmanSachs.Med;

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
class p171{
    public void reorderList(ListNode head) {
        ListNode temp=head;
        int n=0;
        while(temp!=null)
        {
            n++;
            temp=temp.next;
        }
        temp=head;
        int arr[]=new int[n];
        int c=0;
        while(temp!=null)
        {
            arr[c]=temp.val;
            c++;
            temp=temp.next;
        }
        int arr1[]=new int[(n + 1) / 2];
        int arr2[]=new int[n/2];
        for(int i=0;i<(n + 1)/2;i++)
        {
            arr1[i]=arr[i];
        }
        c=0;
        for(int i=(n+1)/2;i<n;i++)
        {
            arr2[c]=arr[i];
            c++;
        }
        for (int i = 0, j = arr2.length - 1; i < j; i++, j--) {
            int tmp=arr2[i];
            arr2[i]=arr2[j];
            arr2[j]=tmp;
        }
        ListNode head2 = new ListNode(arr[0]);
        ListNode curr=head2;
        int j=0,k=1;
        for(int i=1;i<n;i++)
        {
            if(i%2==1)
            {
                curr.next=new ListNode(arr2[j]);
                j++;
                curr = curr.next;
            }
            else{
                curr.next=new ListNode(arr1[k]);
                k++;
                curr=curr.next;
            }
        }
        ListNode p1=head;
        ListNode p2=head2;
        while (p1!=null&&p2!=null){
            p1.val=p2.val;
            p1=p1.next;
            p2=p2.next;
        }
    }
}