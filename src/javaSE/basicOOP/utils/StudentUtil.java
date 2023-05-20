package javaSE.basicOOP.utils;

import javaSE.basicOOP.entity.Student;

/**
 * @Author Diao Rui
 * @Date 2023/5/20 14:33
 * @PackageName:javaSE.basicOOP.utils
 * @ClassName: PersonUtil
 * @Description: TODO
 * @Version 1.0
 */
public class PersonUtil {
    //输出学生
    public void show(Student student) {
        System.out.println(student.toString());
    }

    //输出所有学生
    public void show(Student[] students) {
        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i].toString());
        }
    }

    //学生数组排序
    public void sort(Student[] students) {
        for (int i = 0; i < students.length - 1; i++) {
            boolean flag = false;
            for (int j = 0; j < students.length - i - 1; j++) {
                if (students[j].score > students[j + 1].score) {
                    Student temp = students[j];
                    students[j] = students[j + 1];
                    students[j + 1] = temp;
                    flag = true;
                }
            }
            if (flag == false) break;
        }
    }

}
