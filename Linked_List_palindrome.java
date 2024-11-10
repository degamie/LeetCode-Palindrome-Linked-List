class Solution {
    public boolean isPalindrome(ListNode head) {
    //  S(C(N)==O(1)) and T(C(N)==O(N)) as it requires iterative searching in at each Data element
        ListNode slow=head,fast=head;//Slow and fast Pointer Nodes Declare
        while(fast!=null && fast.next!=null){//iterating throught LL's End Node
            slow=slow.next;fast=fast.next.next;//Slow and Fast Pointers decalew
        }
        ListNode prev=null;//Initialize the Prev Node 
        while(slow!=null){//iterating through Slow Pointer
            ListNode tmp=slow.next;//Temp Node's Declare
            slow.next=prev;//Slow and Prev Pointer Val Declare
            prev=slow;slow=tmp;//Swapping the Prev and Slow Pointer
        }
        while(prev!=null){//iterating through Slow Pointer
            if(head.val!=prev.val)return false;//Prininting False for Non Palidnrome LinkedList
                head=head.next;prev=prev.next;//Swapping The Prev and head Nodes
        }
        return true;//Palindrom linked List resultant True val Printing
    }
}
