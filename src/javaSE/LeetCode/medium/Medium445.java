package javaSE.LeetCode.medium;

import javaSE.dataStructure.linkedList.MyLinkedList;
import javaSE.dataStructure.linkedList.MyNode;

/**
 * @Author Diao Rui
 * @Date 2023/7/3 15:58
 * @PackageName:javaSE.LeetCode.medium
 * @ClassName: Medium445
 * @Description: TODO
 * @Version 1.0
 */
public class Medium445 {
    public static void main(String[] args) {
        MyLinkedList L1 = create(new int[]{0});
        MyLinkedList L2 = create(new int[]{0});
        L1.reverse();
        L2.reverse();
        show(L1);
        show(L2);
        show(addTwoNumbers(L1, L2));
    }

    public static MyLinkedList create(int[] arr) {
        MyLinkedList list = new MyLinkedList(new MyNode(arr[0]));
        for (int i = 1; i < arr.length; i++) {
            list.addRear(arr[i]);
        }
        return list;
    }

    public static void show(MyLinkedList list) {
        MyNode cur = list.node;
        while (cur != null) {
            System.out.print(cur.val + "==>");
            cur = cur.next;
        }
        System.out.print("null");
        System.out.println();
    }

    public static MyLinkedList addTwoNumbers(MyLinkedList l1, MyLinkedList l2) {
        MyNode p = l1.node, q = l2.node;
        int flag = 0;
        int val = p.val + q.val + flag;
        MyLinkedList list = new MyLinkedList(new MyNode(val % 10));
        if (val >= 10)
            flag = 1;
        else
            flag = 0;
        p = p.next;
        q = q.next;
        while (p != null || q != null) {
            int x = p == null ? 0 : p.val;
            int y = p == null ? 0 : p.val;
            val = x + y + flag;
            list.addRear(val % 10);
            flag = val >= 10 ? 1 : 0;
            if (p != null) p = p.next;
            if (q != null) q = q.next;
        }
        if (flag > 0)
            list.addRear(1);
        list.reverse();
        return list;

    }
//    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
//        ListNode p = reverse(l1);
//        ListNode q = reverse(l2);
//        int flag = 0;
//        int val = 0;
//        ListNode head = new ListNode(0);
//        head.next = null;
//        while (p != null || q != null) {
//            if (p == null) {
//                val = q.val + flag;
//                q = q.next;
//            } else if (q == null) {
//                val = p.val + flag;
//                p = p.next;
//            } else {
//                val = p.val + q.val + flag;
//                p = p.next;
//                q = q.next;
//            }
//            ListNode node = new ListNode(val % 10);
//            node.next = head.next;
//            head.next = node;
//            if (val >= 10)
//                flag = 1;
//            else
//                flag = 0;
//        }
//        if (flag > 0){
//            ListNode node = new ListNode(1);
//            node.next = head.next;
//            head.next = node;
//        }
//        return head.next;
//    }
}
