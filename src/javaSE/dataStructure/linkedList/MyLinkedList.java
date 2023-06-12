package javaSE.dataStructure.linkedList;

/**
 * @Author Diao Rui
 * @Date 2023/6/9 13:43
 * @PackageName:javaSE.dataStructure.linkedList
 * @ClassName: MyLinkedList
 * @Description: TODO
 * @Version 1.0
 */
public class MyLinkedList {
    private int value;
    private MyLinkedList next;

    public MyLinkedList(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public MyLinkedList getNext() {
        return next;
    }

    public void setNext(MyLinkedList next) {
        this.next = next;
    }
}
