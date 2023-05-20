package javaSE.basicOOP.mainTest;

import javaSE.basicOOP.entity.Student;
import javaSE.basicOOP.utils.StudentUtil;

/**
 * @Author Diao Rui
 * @Date 2023/5/20 14:42
 * @PackageName:javaSE.basicOOP.mainTest
 * @ClassName: StudentTest
 * @Description: TODO
 * @Version 1.0
 */
public class StudentTest {
    public static void main(String[] args) {
        Student[] students = new Student[5];
        for (int i = 0; i < 5; i++) {
            students[i] = new Student();
            students[i].name = "张" + i;
            students[i].score = (int) (Math.random() * (100 - 1 + 1) + 1);
            students[i].age = 15 + i;
            students[i].gender = i % 2 == 0 ? '男' : '女';
        }
        StudentUtil util = new StudentUtil();
        util.show(students);
        util.sort(students);
        System.out.println("排序后");
        util.show(students);
    }
}
