package javaSE.dataStructure.list;

/**
 * @Author Diao Rui
 * @Date 2023/5/25 13:33
 * @PackageName:javaSE.dataStructure.list
 * @ClassName: MyVector
 * @Description: 向量，支持向某一个方向无限添加元素
 * @Version 1.0
 */
public class MyVector extends MyList {
    /*
     * 无参数构造，调用父类
     * */
    public MyVector() {
        super();
    }

    /**
     * 调用父类有参数构造器
     */
    public MyVector(int[] arr) {
        super(arr);
    }

    /*
     * 当长度大于等于数组的长度时，进行扩容
     * */
    private void expansion() {
        int[] temp = new int[getLength() * 2];
        int[] arr = getArr();
        for (int i = 0; i < getLength(); i++) {
            temp[i] = arr[i];
        }
        setArr(temp);
    }

    /*
     * 重写添加方法，实现无限添加
     * */
    @Override
    public void add(int e) {
        if (getLength() == getArrLength()) {
            expansion();
        }
        super.add(e);
    }
}
