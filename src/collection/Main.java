package collection;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Collection vs Array
        // Hạn chế lớn nhất của mảng trong Java
        /*
        1. Kích thước phần tử cố định
        2. ko hỗ trợ các thuật toán đặc thừ như thêm , sửa, xóa, tìm kiếm, ...
        3. Lưu liền kề trong 1 dải ô nhớ
        */

        // Collection ra đời : tập hợp các lớp và interface định nghĩa cấu trúc dữ liệu tập hợp và các thuật toán hỗ trợ đi kèm
        // List , Set : danh sách
        // Queue , Stack : Hàng đợi , ngăn xếp tuân theo quy luật
        // Map : key - value => ứng dụng cực kì phổ biến

        // List : danh sách có thứ tự (đánh index như mảng)
        // tạo 1 danh sách tên sinh viên
        List<String> studentList = new ArrayList<>(); // danh sachs trống
        System.out.println(studentList);
        // Các phương thức làm việc chính
        // Kiểm tra kích thước
        System.out.println("Kích thước : " + studentList.size());
        // Thêm mới :
        studentList.add("Nam");
        studentList.add("Bình");
        studentList.add("Sơn");
        // List : Nam , Bình, Sơn
        System.out.println("---------------------------");
        System.out.println(studentList);
        studentList.add(1, "Trung");
        System.out.println("---------------------------");
        System.out.println(studentList);
        // Sửa thông tin
        studentList.set(1, "Khánh");
        System.out.println("---------------------------");
        System.out.println(studentList);
        // Xóa
        studentList.remove(1);
//        studentList.remove("Khánh");
        System.out.println("---------------------------");
        System.out.println(studentList);

    }
}
