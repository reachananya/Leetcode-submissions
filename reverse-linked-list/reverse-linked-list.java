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
    public ListNode reverseList(ListNode head) {
        Stack<ListNode> st = new Stack<ListNode>();
        while(head!=null){   //inserting something in the stack is done by "PUSH"
            st.push(head);
            head = head.next; 
            
            // In linkedlist you can't iterate using for loop (using i) that's stupid 
            // you have to use a while loop and then use head = head.next to move to the next node.
   
        }
        //now when you are taking those nodes out of the list we will have to add those to some node and that called a dummy node 
        
        ListNode dummy = new ListNode(-1);   //giving some random value like -1 to the dummy 
        head = dummy; //to keep track of the nodes in our new LinkedList (counter)
        while(!st.isEmpty()){
            //we will have to make a new node 
            ListNode curr = st.pop();
            head.next = new ListNode(curr.val);
            head = head.next;
        }   
        return dummy.next;
    }
}