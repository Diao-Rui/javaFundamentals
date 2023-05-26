package javaSE.dataStructure.test;

import javaSE.dataStructure.stack.MyStack;

import java.util.Stack;

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
        testStack();
    }

    public static void testStack() {
        MyStack stack = new MyStack(10);
        for (int i = 0; i < 20; i++) {
            stack.push((int) (Math.random() * (100) + 1));
        }
        System.out.println(stack.getTop());
        System.out.println(stack.getLength());
    }
}
