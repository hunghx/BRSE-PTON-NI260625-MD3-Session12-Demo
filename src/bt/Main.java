package bt;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> studentList = new ArrayList<>();
        do {
            System.out.println("""
                    +-------------------Menu---------------------+
                    |    1. Xem danh sách sinh viên              |
                    |    2. Thêm mới sinh viên                   |
                    |    0. Thoát                                |
                    +--------------------------------------------+
                    """);
            System.out.println("Hãy chọn chức năng : ");
            byte choice = Byte.parseByte(sc.nextLine());

            switch (choice) {
                case 1:
                    if (studentList.isEmpty()){
                        System.out.println("Danh sách sinh viên trống!");
                    }else{
                        // in tiêu đề cột
                        System.out.println("+------+--------------------+");
                        System.out.printf("|%-6s|%-20s|\n", "STT","Họ tên");
                        System.out.println("+------+--------------------+");
                        for (int i = 0; i < studentList.size(); i++) {
                            System.out.printf("|%-6d|%-20s|\n", i+1, studentList.get(i));
                        }
                        System.out.println("+------+--------------------+");
                    }
                    break;
                case 2:
                    System.out.println("Thêm mới sinh viên !");
                    System.out.println("Nhập họ tên sinh viên cần thêm : ");
                    String name = sc.nextLine();
                    studentList.add(name);
                    System.out.println("Thêm thành công sinh viên có tên : "+name);
                    break;
                case 0:
                    System.out.println("Xin chào, hẹn gặp lại !!!!");
                    System.exit(0);
                default:
                    System.out.println("Lựa chọn không hợp lệ!");
            }

        } while (true);
    }
}
