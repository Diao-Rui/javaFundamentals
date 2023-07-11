package javaSE.advance.fileIo.io;

import org.junit.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @Author Diao Rui
 * @Date 2023/7/3 14:15
 * @PackageName:javaSE.advance.fileIo.io
 * @ClassName: FileInputOutputStream
 * @Description: TODO
 * @Version 1.0
 */
public class FileInputOutputStream {
    /**
     * 复制图片内容
     */
    @Test
    public void test1() {
        //创建输入流和输出流对象
        FileInputStream fis = null;
        FileOutputStream fos = null;
        try {
            //创建文件相对应的File对象
            File srcFile = new File("src/javaSE/advance/fileIO/io/cat.jpg");
            File destFile = new File("src/javaSE/advance/fileIO/io/catCopy.jpg");
            //创建字节流对象
            fis = new FileInputStream(srcFile);
            fos = new FileOutputStream(destFile);
            //数据的读入和写出
            byte[] buffer = new byte[1024];
            int len;
            while ((len = fis.read(buffer)) != -1) {
                fos.write(buffer, 0, len);
            }
            System.out.println("复制成功");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (fis != null) {
                    fis.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if (fos != null) {
                    fos.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }
}
