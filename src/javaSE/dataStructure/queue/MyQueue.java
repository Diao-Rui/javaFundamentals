package javaSE.dataStructure.queue;

/**
 * @Author Diao Rui
 * @Date 2023/5/26 11:49
 * @PackageName:javaSE.dataStructure.queue
 * @ClassName: MyQueue
 * @Description: TODO
 * @Version 1.0
 */
public class MyQueue {
    private int arr[];
    private int rear;
    private int front;

    public MyQueue() {
        arr = new int[10];
        front = rear = 0;
    }

    public MyQueue(int length) {
        arr = new int[length];
        front = rear = 0;
    }

    int[] getArr() {
        return arr;
    }

    void setArr(int[] arr) {
        this.arr = arr;
    }

    public int getRear() {
        return rear;
    }

    public void setRear(int rear) {
        this.rear = rear;
    }

    public int getFront() {
        return front;
    }

    public void setFront(int front) {
        this.front = front;
    }

    public boolean isFull() {
        return rear == arr.length - 1;
    }

    public boolean isEmpty() {
        return front == rear;
    }

    public void enQueue(int e) {
        if (isFull()) {
            System.out.println("队列已满");
            return;
        }
        arr[rear++] = e;
    }

    public void deQueue(int e) {
        if (isEmpty()) {
            System.out.println("队列为空");
            return;
        }
        front++;
    }
}
