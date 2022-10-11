package ra.dev;

import java.util.Scanner;

public class Student {
//    1. Atributes/Fields: Access Modifiers + Datatype + attName - thể hiện đặc điểm của đối tượng
//        thuoc tinh/trường: bổ từ truy cập + kieu du lieu + ten thuoc tinh
//    để đảm bảo tính bao đóng bắt buộc chỉ dùng bổ từ truy cập private, không dùng public, default,protected
    private String studentId;
    private String studentName;
    private int age;
    private boolean sex;
    private String address;
//    2. Các Contructors: các hàm tạo để khởi tạo đối tượng: Access Modifier + ClassName(tham số truyền vào)
//    trong Contructors bổ từ truy cập bắt buộc là public
//    khởi tạo Contructors: alt + Insent

//  Contructors default
    public Student() {
    }
// Dùng Contructors để khởi tạo đối tượng
    public Student(String studentId, String studentName) {
//       This: thuộc tính của lớp này
//        VD: this.studemtName là thuộc tính của private String studentName
        this.studentId = studentId;
        this.studentName = studentName;
    }

//    3. Methods(phương thức): Access Modifier +           RetunrData        +      MethodName(param)
//                            bổ từ truy cập        (kiểu dữ liệu trả về)      tên phương thức(tham số truyền vào)
//    3.1 Khởi tạo phương thức getter/setter

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // phương thức get là các phương thức giúp chúng ta lấy ra thông tin của đối tượng
//    ở đây getStudentId là lấy ra mã sv của đối tượng studentId
//    Phương thức set giúp chúng ta gán giá trị vào các thuộc tính của đối tượng
//    Phương thức get là lấy thông tin ra, set là gán thông tin vào
//    3.2 Các phương thức thể hiện hành vi của đối tượng
    public void hello() {
        System.out.println("Hello");
    }
    public int add(int num1, int num2){
        int sum = num1+num2;
        return sum;
    }
    public void inputData(){
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập vào mã sv");
        this.studentId = sc.nextLine();
//        .....
    }
    public void displayData(){
        System.out.printf("Id sinh viên: %s, tên sinh viên: %s\n", this.studentId,this.studentName);
    }
}
