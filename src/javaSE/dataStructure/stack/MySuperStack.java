package javaSE.dataStructure.stack;

/**
 * @Author Diao Rui
 * @Date 2023/5/27 10:51
 * @PackageName:javaSE.dataStructure.stack
 * @ClassName: MySuperStack
 * @Description: TODO
 * @Version 1.0
 */
public class MySuperStack extends MyStack {
    public MySuperStack() {
        super();
    }

    private void expansion() {
        int[] temp = new int[getLength() * 2];
        int[] arr = getArr();
        for (int i = 0; i < getLength(); i++) {
            temp[i] = arr[i];
        }
        setArr(temp);
    }

    @Override
    public void push(int e) {
        //如果栈满了，就先扩容在添加
        if (isFull()) {
            expansion();
        }
        super.push(e);
    }
}
