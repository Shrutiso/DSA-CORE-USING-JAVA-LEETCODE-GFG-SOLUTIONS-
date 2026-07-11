class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode dummy = new ListNode(-1);
        ListNode ans = dummy;

        int carry = 0;
        ListNode c1 = l1;
        ListNode c2 = l2;

        while (c1 != null || c2 != null || carry != 0) {

            int x = (c1 != null) ? c1.val : 0;
            int y = (c2 != null) ? c2.val : 0;

            int sum = x + y + carry;
            carry = sum / 10;

            ans.next = new ListNode(sum % 10);
            ans = ans.next;

            if (c1 != null) c1 = c1.next;
            if (c2 != null) c2 = c2.next;
        }

        return dummy.next;
    }
}