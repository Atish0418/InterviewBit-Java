package Week1;

// Problem Link : Swap List Nodes in pairs -> https://www.interviewbit.com/problems/swap-list-nodes-in-pairs/
//   Definition for singly-linked list.
 class ListNode {
     public int val;
     public ListNode next;
      ListNode(int x) { val = x; next = null; }
  }
 
 

public class Solution2 {
    ListNode head;
    public ListNode swapPairs(ListNode A) {
        if(A == null || A.next == null){
            return A;
        }
        
        ListNode first = A;
        ListNode second = A.next;
        ListNode prev = null;
        
        while(first != null && second != null){
            ListNode third = second.next;
            second.next = first;    
            first.next = third;
            
            if(prev != null){
                prev.next = second;
            }
            else{
                A = second;
            }
            
            prev = first;
            first = third;
            
            if(third != null){
                second = third.next;
            }
            else{
                second = null;
            }
        }
        
        return A;
    }
}

