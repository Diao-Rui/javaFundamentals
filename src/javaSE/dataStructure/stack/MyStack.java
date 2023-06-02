package javaSE.dataStructure.stack;

/**
 * @Author Diao Rui
 * @Date 2023/5/26 11:23
 * @PackageName:javaSE.dataStructure.stack
 * @ClassName: MyStack
 * @Description: 自定义栈
 * @Version 1.0
 */
public class MyStack {
    private int[] arr;
    private int top;

    /*
     * 用于子类继承使用
     * */
    MyStack() {
        //默认长度为10
        arr = new int[10];
        top = -1;
    }

    public MyStack(int length) {
        arr = new int[length];
        top = -1;
    }

    int[] getArr() {
        return arr;
    }

    void setArr(int[] arr) {
        this.arr = arr;
    }

    /*
     * 获取栈顶元素
     * */
    public int getTop() {
        return arr[top];
    }

    /*
     * 获取栈中元素个数
     * */
    public int getLength() {
        return top + 1;
    }

    /*
     * 判断站是否为空
     * */
    public boolean isEmpty() {
        return top == -1;
    }

    boolean isFull() {
        return top == arr.length - 1;
    }

    /*
     * 入栈
     * */
    public void push(int e) {
        if (isFull()) {
            System.out.println("栈已满不能继续添加元素");
            return;
        }
        arr[++top] = e;
    }

    /*
     * 出栈
     * */
    public void pop() {
        if (isEmpty()) {
            System.out.println("栈空，不能出栈");
            return;
        }
        top--;
    }

    /*
     * 清空栈
     * */
    public void clear() {
        top = -1;
    }

}
