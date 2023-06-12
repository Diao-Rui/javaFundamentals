package javaSE.advance.Exception;

import org.junit.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * @Author Diao Rui
 * @Date 2023/6/7 14:46
 * @PackageName:javaSE.advance
 * @ClassName: TryCatchFinally
 * @Description: TODO
 * @Version 1.0
 */
public class TryCatchFinally {
    @Test
    public void test() {
        FileInputStream inputStream = null;
        try {
            File file = new File("a.txt");
            inputStream = new FileInputStream(file);
            int data = inputStream.read();
            while (data != -1) {
                System.out.print((char) data);
                data = inputStream.read();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //资源关闭操作声明在finally中
            try {
                if (inputStream != null)
                    inputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
