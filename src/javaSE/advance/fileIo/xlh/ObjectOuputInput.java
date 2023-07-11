package javaSE.advance.fileIo.xlh;

import org.junit.Test;

import java.io.*;

/**
 * @Author Diao Rui
 * @Date 2023/7/4 14:15
 * @PackageName:javaSE.advance.fileIo.xlh
 * @ClassName: ObjectOuputInput
 * @Description: TODO
 * @Version 1.0
 */
public class ObjectOuputInput {

    /*
     * 序列化过程：将java对象写出到文件中
     * */
    @Test
    public void test1() throws IOException {
        //创建文件对象
        File file = new File("src/javaSE/advance/fileIO/xlh/object.txt");
        //创建对象流
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file));
        //序列化数据
        oos.writeUTF("七域至，众生亡，举剑起，破苍穹");
        //刷新缓冲区
        oos.flush();
        //关闭流
        oos.close();
    }

    /*
     * 反序列化
     * */
    @Test
    public void test2() throws IOException {
        //创建文件对象
        File file = new File("src/javaSE/advance/fileIO/xlh/object.txt");
        //创建对象流（字节流）
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));
        //读取字符串
        String s = ois.readUTF();
        System.out.println(s);
        ois.close();
    }

    /*
     * 自定义类序列化
     * */
    @Test
    public void test3() throws IOException {
        File file = new File("src/javaSE/advance/fileIO/xlh/dog.txt");
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file));
        oos.writeObject(new Dog("tom", 45));
        oos.flush();
        oos.close();
    }

    /*
     * 自定义类反序列化
     * */
    @Test
    public void test4() throws IOException, ClassNotFoundException {
        File file = new File("src/javaSE/advance/fileIO/xlh/dog.txt");
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));
        Object object = ois.readObject();
        Dog dog = (Dog) object;
        System.out.println(dog);
        ois.close();
    }
    @Test
    public void test5(){

    }

}
