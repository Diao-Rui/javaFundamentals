package javaSE.advance.fileIo.other;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Author Diao Rui
 * @Date 2023/7/4 15:22
 * @PackageName:javaSE.advance.fileIo.other
 * @ClassName: Logger
 * @Description: TODO
 * @Version 1.0
 */
public class Logger {
    public static void log(String msg) {
        PrintStream out = null;
        try {
            //创建文件对应的对象
            File file = new File("src/javaSE/advance/fileIO/other/log.txt");
            //文件输出流（字节流）
            FileOutputStream outputStream = new FileOutputStream(file, true);
            //打印流
            out = new PrintStream(outputStream);
            //设置重输出位置
            System.setOut(out);
            //获取当前日期
            Date nowTime = new Date();
            //格式化日期
            SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss sss");
            String setTime = format.format(nowTime);
            //内容打印到文件中
            System.out.println(setTime + ":" + msg);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (out != null)
                out.close();
        }
    }
}
