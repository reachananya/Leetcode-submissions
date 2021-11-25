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
    public ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        
        //add every node in every list into our minHeap
        
        //ListNode automatically visists all the nodes in a 2D array.
        
        for(ListNode head : lists){
            while(head != null){    //since evrytime head is shifting to the next element at the end it will reach null
                minHeap.add(head.val);
                head = head.next;
            }
        }
         
        //creating a ListNode and point it to a dummy 
            
        ListNode dummy = new ListNode(-1);
            ListNode head = dummy;
            while(!minHeap.isEmpty()){
                head.next = new ListNode(minHeap.remove());
                head = head.next;
            }
            return dummy.next;    
            
        
        
        //removing all the elements from the minHeap and insert them into a new array
        
            
    }
}