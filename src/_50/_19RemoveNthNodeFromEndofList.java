package _50;
/*
* @author:soleil
* @version 2018年3月11日 下午7:59:19
* 解释：
* Given a linked list, remove the nth node from the end of list and return its head.

For example,

   Given linked list: 1->2->3->4->5, and n = 2.

   After removing the second node from the end, the linked list becomes 1->2->3->5.

*/
public class _19RemoveNthNodeFromEndofList {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode start = new ListNode(0);
        
        ListNode slow = start , fast = start;
        slow.next = head;
        
        //使fast点和slow点的差距为n
        for(int i=1;i<=n+1;i++){
        	fast = fast.next;
        }
        
        //同时移动fast和slow 使得fast到达listnode的末尾
        while(fast != null){
        	slow = slow.next;
        	fast = fast.next;
        }
        
        //删除倒数第n个节点
        slow.next = slow.next.next;      
        
        return start.next;
    }
}
