package javaSE.dataStructure.list;

/**
 * @Author Diao Rui
 * @Date 2023/5/25 11:12
 * @PackageName:javaSE.dataStructure.list
 * @ClassName: MyList
 * @Description: 线性表，只能支持固定长度的数组
 * @Version 1.0
 */
public class MyList {
    private int[] arr;
    private int length;

    public MyList() {
        //默认情况下大小为10
        arr = new int[10];
        length = 0;
    }

    public MyList(int[] arr) {
        //用数组直接给创建新数组
        this.arr = arr;
        this.length = arr.length;
    }

    public MyList(int length) {
        arr = new int[length];
        this.length = 0;
    }

    public int[] getArr() {
        int[] temp = new int[length];
        for (int i = 0; i < length; i++)
            temp[i] = arr[i];
        return temp;
    }

    /**
     * 缺省权限下，只有本包里子类能够访问
     */
    void setArr(int[] arr) {
        this.arr = arr;
    }

    int getArrLength() {
        return arr.length;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void add(int e) {
        if (arr.length == length) {
            System.out.println("数组长度溢出");
            return;
        }
        arr[length++] = e;
    }

    /**
     * 查找某元素所在的位置
     */
    public int indexOf(int e) {
        for (int i = 0; i < length; i++) {
            if (arr[i] == e) {
                return i;
            }

        }
        return -1;
    }

    /*
     * 删除某元素，返回所在的位置
     * */
    public int remove(int e) {
        int index = indexOf(e);
        if (index == -1)
            return -1;
        for (int i = index + 1; i < length; i++)
            arr[i - 1] = arr[i];
        length--;
        return index;
    }


}
