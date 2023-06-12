package javaSE.advance.Exception;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * @Author Diao Rui
 * @Date 2023/6/7 14:51
 * @PackageName:javaSE.advance.Exception
 * @ClassName: Throws
 * @Description: TODO
 * @Version 1.0
 */
public class Throws {
    public void method3() {
        try {
            method2();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public void method2() throws FileNotFoundException, IOException {
        method1();
    }

    public void method1() throws FileNotFoundException, IOException {
        File file = new File("a.txt");
        FileInputStream inputStream = new FileInputStream(file);
        int data = inputStream.read();
        while (data != -1) {
            System.out.print((char) data);
            data = inputStream.read();
        }
    }
}
