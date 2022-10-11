import ra.dev.Student;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        1.Khởi tạo đối tượng sinh viên 1 mà ko tạo bất kỳ thông tin gì
//        ClassName ObjectName = new Contructor
        Student st1 = new Student();

//        2. Khởi tao đối tượng sv2 và khởi tạo thông tin mã sinh viên và tên sv
        Student st2 = new Student("Sv02","Nguyen Van B");

//        Nhâập thông tin sv2 sử dụng phương thức set
        Scanner sc = new Scanner(System.in);
        System.out.println("NNhaaph thông tin còn lại của sv2");
        System.out.println("Nhập vào tuổi");
        st2.setAge(Integer.parseInt(sc.nextLine()));
//        In ra tên sv2 - sử dụng phương thức get
        System.out.println("Tuổi sinh viên 2:" + st2.getAge());

//        3. In ra thông tin các sinh viên
//        Gọi phương thức cua các đối tượng
//        ObjectName.methodName(Argument)
        System.out.println("Thông tin sv");
        st1.inputData();
        st2.displayData();
        st1.displayData();
    }
}