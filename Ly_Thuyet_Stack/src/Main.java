import java.util.Stack;

public class Main {
    public static void main(String[] args) {
//        Khởi tạo Stack tu contructor default của lóp stack
        Stack<String> myStack = new Stack<>();
//        Empty(): boolean --> Chưa có dữ liệu: true và ngược lại là false
        System.out.println(myStack.empty());
//        push(): thêm phần tử vào trên cùng
        myStack.push("Quyền Anh");
        myStack.push("Thế Hùng");
//        Peek(): Trả về phần tử nằm trên cùng
        System.out.println(myStack.peek());
        System.out.println("Lấy phần tử trên cùng và xóa phần tử");
        System.out.println(myStack.pop());
//        Seach (Object o): Kiểm tra đối tượng "o" có trong stack hay không
        System.out.println(myStack.search("Quyền Anh")); //trả về số lượng đối tượng nằm trong stack, lưu trữ đc các đối tượng trùng lặp

//        In thông tin myStack
        System.out.println("Các phần tử trong myStack: ");
        for (String str : myStack) {
            System.out.println(str);
        }
    }
}