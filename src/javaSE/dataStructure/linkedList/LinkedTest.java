package javaSE.dataStructure.linkedList;

import org.junit.Test;

/**
 * @Author Diao Rui
 * @Date 2023/6/9 13:45
 * @PackageName:javaSE.dataStructure.linkedList
 * @ClassName: LinkedTest
 * @Description: TODO
 * @Version 1.0
 */
public class LinkedTest {
    @Test
    public void test1() {
        MyLinkedList head = new MyLinkedList(0);
        for (int i = 0; i < 10; i++)
            add(head, (int) (Math.random() * 100 + 1));
        show(head);
    }

    public void add(MyLinkedList head, int value) {
        if (head == null) {
            head = new MyLinkedList(0);
            head.setNext(new MyLinkedList(value));
        } else if (head.getNext() == null) {
            head.setNext(new MyLinkedList(value));
        } else {
            MyLinkedList p = head.getNext();
            while (p.getNext() != null)
                p = p.getNext();
            p.setNext(new MyLinkedList(value));
        }
    }

    public void show(MyLinkedList head) {
        if (head == null || head.getNext() == null) {
            System.out.println("链表为空");
            return;
        }
        MyLinkedList p = head.getNext();
        while (p != null) {
            System.out.print(p.getValue() + "--->");
            p = p.getNext();
        }
    }
}
