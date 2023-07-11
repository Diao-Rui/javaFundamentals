package javaSE.advance.fileIo.io;

import org.junit.Test;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @Author Diao Rui
 * @Date 2023/7/3 11:20
 * @PackageName:javaSE.advance.fileIo.io
 * @ClassName: FileReaderWriter
 * @Description: TODO
 * @Version 1.0
 */
public class FileReaderWriter {

    /*
     * 将文件内容读取到控制台
     * 异常使用throws的方式不好，确保流一定可以关闭，避免内存泄露
     * */
    @Test
    public void test1() {
        FileReader reader = null;
        try {
            //创建File类的对象，对应文件
            File file = new File("src/javaSE/advance/fileIO/io/hello.txt");
            //创建输入型的字符流，用于读取数据
            reader = new FileReader(file);
            //读取数据，并显示在控制台上
            while (true) {
                int data = reader.read();
                if (data == -1)
                    break;
                System.out.print((char) data);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //流资源的关闭
            try {
                if (reader != null)
                    reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

    /*
     * 对读取数据优化，每次读取多个字符存放在内存中
     * 减少与磁盘的交互次数。加快执行速度
     * */
    @Test
    public void test2() {
        FileReader reader = null;
        try {
            File file = new File("src/javaSE/advance/fileIO/io/hello.txt");
            reader = new FileReader(file);
            char[] buffer = new char[5];
            int len;
            while ((len = reader.read(buffer)) != -1) {
                for (int i = 0; i < len; i++) {
                    System.out.print(buffer[i]);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    /*
     * 将内存中的数据写入到文件中
     * 默认构造器是覆盖文件
     * append为false则覆盖
     * append为true则追加
     * */
    @Test
    public void test3() {
        FileWriter writer = null;
        try {
            //创建文件对象
            File file = new File("src/javaSE/advance/fileIO/io/info.txt");
            //创建输出流
            writer = new FileWriter(file);
            //写入数据
            writer.write("i am a student ");
            writer.write("from jnu.\n");
            writer.write("i love jnu.");
            System.out.println("写入成功");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (writer != null) {
                try {
                    writer.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    /**
     * 将文件hello.txt的复制一份
     */
    @Test
    public void test4() {
        FileWriter writer = null;
        FileReader reader = null;
        try {
            File srcFile = new File("src/javaSE/advance/fileIO/io/info.txt");
            File destFile = new File("src/javaSE/advance/fileIO/io/info_copy.txt");
            writer = new FileWriter(destFile);
            reader = new FileReader(srcFile);
            char[] buffer = new char[5];
            int len;
            while ((len = reader.read(buffer)) != -1) {
                writer.write(buffer, 0, len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (writer != null) {
                try {
                    writer.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
