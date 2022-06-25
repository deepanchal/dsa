class Solution {
    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null)
            return l2;
        if (l2 == null)
            return l1;
        ListNode dummyHead = new ListNode(0);
        ListNode curr = dummyHead;

        while (l1 != null && l2 != null) {
            if (l1.val >= l2.val) {
                curr.next = new ListNode(l2.val);
                l2 = l2.next;
            } else {
                curr.next = new ListNode(l1.val);
                l1 = l1.next;
            }
            curr = curr.next;
        }

        if (l1 == null) {
            curr.next = l2;
        }

        if (l2 == null) {
            curr.next = l1;
        }

        return dummyHead.next;
    }

    public static void main(String[] args) {
        int list1[] = { 1, 2, 4, 5, 7, 9 };
        int list2[] = { 1, 3, 4, 5, 6, 9 };
        ListNode p = new ListNode();
        ListNode q = new ListNode();
        ListNode dummyHead1 = p;
        ListNode dummyHead2 = q;

        for (int i : list1) {
            p.next = new ListNode(i);
            p = p.next;
        }

        for (int i : list2) {
            q.next = new ListNode(i);
            q = q.next;
        }

        ListNode result = mergeTwoLists(dummyHead1.next, dummyHead2.next);
        while (result != null) {
            System.out.println(result.val);
            result = result.next;
        }
    }
}