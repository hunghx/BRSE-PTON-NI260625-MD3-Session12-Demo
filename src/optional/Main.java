package optional;

import java.util.Optional;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Bài toán : nếu 1 đối tượng chưa được khởi tạo thì mặc định là null
        // khi truy cập phương thức hoặc thuộc tính sẽ gây ra lỗi NullPoiterException
        // Optional sẽ giảy quyết bài toán này mà ko cần if-else
        Scanner sc = null;
        if (sc != null) {
            sc.nextLine();
        }

        Optional<Scanner> op = Optional.ofNullable(sc);
        String str = op.orElse(new Scanner(System.in)).nextLine();
    }
}
