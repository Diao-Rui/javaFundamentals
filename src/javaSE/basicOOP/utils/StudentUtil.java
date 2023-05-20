package javaSE.basicOOP.utils;

import javaSE.basicOOP.entity.Student;

/**
 * @Author Diao Rui
 * @Date 2023/5/20 14:33
 * @PackageName:javaSE.basicOOP.utils
 * @ClassName: StudentUtil
 * @Description: TODO
 * @Version 1.0
 */
public class StudentUtil {
    public void swap(Student[] students, int i, int j) {
        Student temp = students[i];
        students[i] = students[j];
        students[j] = temp;
    }

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
                    swap(students, j, j + 1);
                    flag = true;
                }
            }
            if (flag == false) break;
        }
    }

}
