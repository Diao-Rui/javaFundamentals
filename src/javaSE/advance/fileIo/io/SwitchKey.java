package javaSE.advance.fileIo.io;

import org.junit.Test;

import java.io.*;
import java.nio.charset.StandardCharsets;

/**
 * @Author Diao Rui
 * @Date 2023/7/4 11:11
 * @PackageName:javaSE.advance.fileIo.io
 * @ClassName: SwitchKey
 * @Description: TODO
 * @Version 1.0
 */
public class SwitchKey {
    /*
     * 将UTF-8文件转为GBK文件
     * */
    @Test
    public void test1() throws IOException {
        //创建文件相对应的对象
        File srcFile = new File("src/javaSE/advance/fileIO/io/hello.txt");
        File destFile = new File("src/javaSE/advance/fileIO/io/hello-GBK.txt");
        //创建输入输出流
        FileInputStream fis = new FileInputStream(srcFile);
        //创建转换流
        InputStreamReader isr = new InputStreamReader(fis, StandardCharsets.UTF_8);

        FileOutputStream fos = new FileOutputStream(destFile);
        OutputStreamWriter osw = new OutputStreamWriter(fos, "GBK");

        //读写过程
        char[] buffer = new char[1024];
        int len;
        while ((len = isr.read(buffer)) != -1) {
            osw.write(buffer, 0, len);
        }
        //关闭流
        osw.close();
        isr.close();
    }
}
