package javaSE.advance.fileIo.file;

import org.junit.Test;

import java.io.File;
import java.io.IOException;

/**
 * @Author Diao Rui
 * @Date 2023/6/28 15:17
 * @PackageName:javaSE.advance.fileIo.file
 * @ClassName: FileTest
 * @Description: TODO
 * @Version 1.0
 */
public class FileTest {

    @Test
    public void test1(){
        File file = new File("abc.txt");
        File file1 = new File("abc", "abc.txt");
        File file2 = new File(file1, "abc.txt");
    }
    @Test
    public void test2(){
        File file = new File("src/javaSE/advance/fileIo/file/hello.txt");
        System.out.println(file.getName());
        System.out.println(file.getPath());
        System.out.println(file.getAbsolutePath());
        System.out.println(file.getAbsoluteFile());
        System.out.println(file.getParent());
        System.out.println(file.length());
        System.out.println(file.lastModified());
    }
    @Test
    public void test3(){
        File file = new File("src/javaSE/advance/fileIo/file");
        String[] list = file.list();
        for(String str:list){
            System.out.println(str);
        }
        File[] files = file.listFiles();
        for(File temp:files){
            System.out.println(temp.getName());
        }
    }
    @Test
    public void test4(){
        File file = new File("src/javaSE/advance/fileIo/file/abc.txt");
        boolean b = file.renameTo(new File("src/javaSE/advance/fileIo/file/hello.txt"));
        System.out.println(b);

    }
    @Test
    public void test5() throws IOException {
        File file = new File("src/javaSE/advance/fileIo/file/abc.txt");
        if(!file.exists()){
            boolean newFile = file.createNewFile();
            if(newFile){
                System.out.println("创建成功");
            }
        }else {
            System.out.println("此文件已存在");
            boolean delete = file.delete();
            if(delete){
                System.out.println("文件删除成功");
            }
        }
    }
    @Test
    public void test6(){
        File file = new File("src/javaSE/advance/fileIo/file/child");
        if (!file.exists()) {
            System.out.println(file.mkdir()?"目录创建成功":"目录创建失败");
        }else {
            System.out.println("目录已存在");
        }
    }
}
