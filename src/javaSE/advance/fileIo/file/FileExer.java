package javaSE.advance.fileIo.file;

import org.junit.Test;

import java.io.File;
import java.io.IOException;

/**
 * @Author Diao Rui
 * @Date 2023/6/28 16:10
 * @PackageName:javaSE.advance.fileIo.file
 * @ClassName: FileExer
 * @Description: 递归访问所有文件
 * @Version 1.0
 */
public class FileExer {
    static int bytes = 0;

    public static void main(String[] args) {
        File file = new File("src/javaSE/advance/fileIo");
        printFileName(file);
        countByte(file);
        System.out.println(bytes);

    }

    public static void printFileName(File file) {
        if (file.isFile()) {
            System.out.println(file.getName());
        } else if (file.isDirectory()) {
            File[] files = file.listFiles();
            for (File file1 : files) {
                printFileName(file1);
            }
        }
    }

    @Test
    public void test() {
        File file = new File("E:\\Edge下载中心\\数据集\\MeatFreshness\\train");
        if (file.exists()) {
            String[] list = file.list();
            for (String name : list) {
                if (name.contains(".jpg"))
                    System.out.println(name);
            }
        }
    }

    @Test
    public void test2() throws IOException {
        File file = new File("src/javaSE/advance/fileIo/file/child");
        System.out.println(file.getAbsolutePath());
        File file1 = new File(file, "abc.txt");
        boolean mkdir = file1.createNewFile();
        if (mkdir)
            System.out.println("创建成功");
    }

    public static void countByte(File file) {
        if (file.isFile()) {
            bytes += file.length();
        } else if (file.isDirectory()) {
            File[] files = file.listFiles();
            for (File file1 : files) {
                countByte(file1);
            }
        }
    }

}
