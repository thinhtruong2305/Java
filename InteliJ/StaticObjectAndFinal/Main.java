import Model.PrimaryStudent;
import Model.SecondaryStudent;
import Model.Student;
import Model.Utility.MyMath;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Student[] students = {
                new Student("Nguyễn Văn A", 20, 300),
                new Student("Nguyễn Văn B", 21, 400),
                new Student("Nguyễn Văn C", 19, 600)
        };
        System.out.println("Tất cả đều học bách khoa");
        for (Student student: students) {
            System.out.println(student.toString());
        }
        //Thay đổi giá trị biến static
        Student.setCollege("Đại học Công Nghệ");
        System.out.println("Tất cả đều học bách khoa");
        for (Student student: students) {
            System.out.println(student.toString());
        }

        for (Student student: students) {
            student.rechargeMoneyGroup(100.00);
        }
        students[0].useMoney(50.00, "Mua bim bim và kẹo về liên hoan");
        students[1].useMoney(20.00, "Mua bánh mì");
        students[2].useMoney(150.00, "Mua dụng cụ học tập cho nhóm");

        for (Student student: students) {
            student.rechargeMoneyGroup(50.00);
        }

        System.out.println(MyMath.max(100,0));
        System.out.println(MyMath.min(24,4));
        System.out.println(MyMath.sum(1,5,7,19,2));

        List<Student> studentList = new ArrayList<>();
        studentList.add(new PrimaryStudent());
        studentList.add(new PrimaryStudent());
        studentList.add(new SecondaryStudent());
        studentList.add(new SecondaryStudent());
        studentList.add(new SecondaryStudent());
        studentList.add(new SecondaryStudent());
        System.out.println("Tổng student: " + Student.getCounter());
        System.out.println("Tổng primary student: " + PrimaryStudent.getCounter());
        System.out.println("Tổng secondary student: " + SecondaryStudent.getCounter());

        MyMath.sum(2);
    }
}
