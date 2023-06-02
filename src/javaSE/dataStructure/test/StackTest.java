package javaSE.dataStructure.test;

import javaSE.dataStructure.stack.MyStack;
import javaSE.dataStructure.stack.MySuperStack;

/**
 * @Author Diao Rui
 * @Date 2023/5/26 11:31
 * @PackageName:javaSE.dataStructure.test
 * @ClassName: StackTest
 * @Description: 测试栈
 * @Version 1.0
 */
public class StackTest {
    public static void main(String[] args) {
        System.out.println("测试普通栈");
        testStack();
        System.out.println("测试无穷栈");
        testSuperStack();
    }

    public static void testStack() {
        MyStack stack = new MyStack(10);
        for (int i = 0; i < 20; i++) {
            stack.push((int) (Math.random() * (100) + 1));
        }
        System.out.println(stack.getTop());
        System.out.println(stack.getLength());
        while (!stack.isEmpty()) {
            System.out.print(stack.getTop() + " ");
            stack.pop();
        }
    }

    public static void testSuperStack() {
        MySuperStack stack = new MySuperStack();
        for (int i = 0; i < 20; i++) {
            stack.push((int) (Math.random() * (100) + 1));
        }
        System.out.println(stack.getTop());
        System.out.println(stack.getLength());
        while (!stack.isEmpty()) {
            System.out.print(stack.getTop() + " ");
            stack.pop();
        }
    }
}
