package javaSE.advance.fileIo.io;

import org.junit.Test;

import java.io.*;

/**
 * @Author Diao Rui
 * @Date 2023/7/3 15:04
 * @PackageName:javaSE.advance.fileIo.io
 * @ClassName: BuffedInputOutput
 * @Description: TODO
 * @Version 1.0
 */
public class BuffedInputOutput {
    @Test
    public void test1() {
        //创建输入流和输出流对象
        FileInputStream fis = null;
        FileOutputStream fos = null;
        BufferedInputStream bis = null;
        BufferedOutputStream bos = null;
        try {
            //创建文件相对应的File对象
            File srcFile = new File("src/javaSE/advance/fileIO/io/cat.jpg");
            File destFile = new File("src/javaSE/advance/fileIO/io/catCopy.jpg");
            //创建字节流对象
            fis = new FileInputStream(srcFile);
            fos = new FileOutputStream(destFile);
            //创建缓冲流对象
            bis = new BufferedInputStream(fis);
            bos = new BufferedOutputStream(fos);
            //数据的读入和写出
            byte[] buffer = new byte[1024];
            int len;
            while ((len = bis.read(buffer)) != -1) {
                bos.write(buffer, 0, len);
            }
            System.out.println("复制成功");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            //外层关闭，内层也关闭
            try {
                if (bis != null) {
                    bis.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if (bos != null) {
                    bos.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }

    /**
     * 使用BufferedReader将内容显示到控制台上
     */
    @Test
    public void test2() {
        BufferedReader reader = null;
        try {
            File file = new File("src/javaSE/advance/fileIO/io/info.txt");
            reader = new BufferedReader(new FileReader(file));
            int len;
            /*
            第一种方式
            char[] buffer = new char[1024];
            while ((len = reader.read(buffer)) != -1) {
                System.out.println(new String(buffer, 0, len));
            }*/
            String data;
            //返回一行数据，但是不包含换行符
            while ((data = reader.readLine()) != null) {
                System.out.println(data);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (reader != null)
                    reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    @Test
    public void test3() {
        //创建输入流和输出流对象
        BufferedReader bis = null;
        BufferedWriter bos = null;
        try {
            //创建文件相对应的File对象
            File srcFile = new File("src/javaSE/advance/fileIO/io/info.txt");
            File destFile = new File("src/javaSE/advance/fileIO/io/infoCopy.txt");
            //创建缓冲流对象
            //数据的读入和写出
            bis = new BufferedReader(new FileReader(srcFile));
            bos = new BufferedWriter(new FileWriter(destFile));

            String data;
            while ((data = bis.readLine()) != null) {
                bos.write(data);
                //添加换行符
                bos.newLine();
                //刷新缓冲区
                bos.flush();
            }
            System.out.println("复制成功");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            //外层关闭，内层也关闭
            try {
                if (bis != null) {
                    bis.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if (bos != null) {
                    bos.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }
}
