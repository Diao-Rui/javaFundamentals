package javaSE.advance.fileIo.file;

import java.io.File;

/**
 * @Author Diao Rui
 * @Date 2023/6/28 16:29
 * @PackageName:javaSE.advance.fileIo.file
 * @ClassName: DeleteTest
 * @Description: 删除目录中所有文件和目录
 * @Version 1.0
 */
public class DeleteTest {
    public static void main(String[] args) {
        File file = new File("src/javaSE/advance/fileIo/file/child");
        del(file);
    }

    public static void del(File file) {
        //是文件直接删除
        if (file.isFile()) {
            file.delete();
        } else if (file.isDirectory()) {
            //递归查找删除目录
            File[] files = file.listFiles();
            for (File file1 : files) {
                del(file1);
            }
            //目录空了删除
            file.delete();
        }
    }
}
