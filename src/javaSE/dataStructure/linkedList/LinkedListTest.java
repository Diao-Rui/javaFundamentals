package javaSE.dataStructure.linkedList;

/**
 * @Author Diao Rui
 * @Date 2023/7/2 13:11
 * @PackageName:javaSE.dataStructure.linkedList
 * @ClassName: LinkedListTest
 * @Description: TODO
 * @Version 1.0
 */
public class LinkedListTest {
    public static void main(String[] args) {
        MyLinkedList list=new MyLinkedList(new MyNode(15));
        list.addRear(25);
        list.addRear(30);
        list.addHead(40);
        list.addHead(50);
        list.addRear(115);
        list.addIndex(1,555);
        show(list);
        list.reverse();
        show(list);
        System.out.println(list.contains(11));
        System.out.println(list.size());
        list.remove(50);
        show(list);
        list.clear();
        show(list);
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
}
