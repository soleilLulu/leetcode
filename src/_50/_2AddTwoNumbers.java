package _50;
/*
* @author:soleil
* @version 2018年2月23日 上午11:19:15
* 解释：You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order and each of their nodes contain a single digit. Add the two numbers and return it as a linked list.
You may assume the two numbers do not contain any leading zero, except the number 0 itself.
*/
public class _2AddTwoNumbers {
//	//标准solution
//    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
//    	
//    	ListNode resHead = new ListNode(0);
//    	ListNode res = resHead;
//    	ListNode p = l1;
//    	ListNode q = l2;
//    	int carry = 0;
//    	
//    	while(p != null || q != null){
//    		int x = (p != null) ? p.val : 0;
//    		int y = (q != null) ? q.val : 0;
//    		int sum = x + y + carry;
//    		carry = sum / 10;
//    		res.next = new ListNode(sum % 10);
//    		res = res.next;
//    		if(p != null)p = p.next;
//    		if(q != null)q = q.next;
//    		
//    	}
//    	if(carry != 0){
//    		res.next = new ListNode(carry);
//    	}
//    	return resHead.next;
//    }
    //较快的方法
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		ListNode p = l1;
		ListNode q = l2;
		ListNode head = new ListNode(0);
		ListNode curr = head;
		int sum =0;
		
		while(p != null || q != null){
			sum = sum / 10;
			if(p != null){
				sum += p.val;
				p = p.next;
			}
			if(q != null){
				sum += q.val;
				q = q.next;
			}
			curr.next = new ListNode(sum % 10);
			curr = curr.next;
		}
		if(sum >= 10){
			curr.next = new ListNode(1);
		}
		
		return head.next;
	}
}
