package javaSE.dataStructure.linkedList;

/**
 * @Author Diao Rui
 * @Date 2023/7/3 9:55
 * @PackageName:javaSE.dataStructure.linkedList
 * @ClassName: MyLinkedList
 * @Description: TODO
 * @Version 1.0
 */
public class MyLinkedList {
    public MyNode node;
    private MyNode rear;

    public MyLinkedList(MyNode node) {
        this.node = node;
        this.node.next = null;
        rear = this.node;
    }

    public void addRear(int val) {
        rear.next = new MyNode(val);
        rear = rear.next;
        rear.next = null;
    }

    public void addHead(int val) {
        MyNode node = new MyNode(val);
        node.next = this.node;
        this.node = node;
    }

    public void addIndex(int index, int val) {
        if(index==1){
            addHead(val);
            return;
        }
        MyNode cur = this.node;
        int i = 0;
        while (cur != null && i < index - 1) {
            cur = cur.next;
            i++;
        }
        if (i < index - 1) {
            System.out.println("输入的索引不对");
        } else {
            MyNode node = new MyNode(val);
            node.next = cur.next;
            cur.next = node;
        }

    }

    public void reverse() {
        MyNode pre = null;
        MyNode cur = this.node;
        while (cur != null) {
            MyNode temp = cur.next;
            cur.next = pre;
            pre = cur;
            cur = temp;
        }
        this.node = pre;
    }

    public boolean contains(int val) {
        MyNode cur = node;
        while (cur != null && cur.val != val) {
            cur = cur.next;
        }
        return cur != null;
    }

    public void remove(int val) {
        MyNode cur = node;
        while (cur != null && cur.val != val) {
            cur = cur.next;
        }
        if (cur == null) {
            System.out.println("没有这个节点");
        } else {
            if (cur.next != null) {
                cur.val = cur.next.val;
                cur.next = cur.next.next;
            } else {
                cur = null;
            }
        }
    }

    public void clear() {
        this.node = null;
    }

    public int size() {
        int res = 0;
        MyNode cur = node;
        while (cur != null) {
            res++;
            cur = cur.next;
        }
        return res;
    }

}
