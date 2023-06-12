package javaSE.advance.Exception;

/**
 * @Author Diao Rui
 * @Date 2023/6/7 15:58
 * @PackageName:javaSE.advance.Exception
 * @ClassName: ThrowTest
 * @Description: TODO
 * @Version 1.0
 */
public class ThrowTest {
    public static void main(String[] args) {
        Student student = new Student();
        try {
            student.getId();
        } catch (Exception e) {
            //e.printStackTrace();
            System.out.println(e.getMessage());
        }

        student.setId(12);
        student.setId(-12);
    }
}

class Student {
    int id;

    public int getId() throws Exception {
        if (id == 0) {
            //非运行时异常，需要处理
            throw new Exception("ID没有赋值");
        } else {
            return id;
        }
    }

    public void setId(int id) {
        if (id > 0) {
            this.id = id;
        } else {
            //手动抛出异常
            //运行时异常（可以不用处理）
            throw new RuntimeException("输入ID非法");
        }
    }
}