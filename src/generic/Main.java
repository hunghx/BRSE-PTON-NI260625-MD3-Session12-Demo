package generic;

public class Main {
    public static void main(String[] args) {
        // Tham số là gì ?
        // Generic là tham số cho kiểu dữ liệu
        // Quy tắc đặt tên : T, E, K, V, N
        // Khởi tạo đối tượng : Phải sử dụng các kiểu dữ liệu dạng đối tượng
        // Quy tắc chuyển đổi : int => Integer, char => Character, long, short, byte, boolean, double, float => Viết hoa chữ cái đầu
        MyGeneric<Integer> obj = new MyGeneric<>();
        obj.setData(100);
        System.out.println("data : "+ obj.getData());


        MyGeneric<String> strObj = new MyGeneric<>();
        strObj.setData("hello");
        System.out.println("data : "+ strObj.getData());

        // gọi phương thức tĩnh trực tiếp từ tên lớp mà ko cần khởi tạo đối tượng
//        MethodGeneric.print("Hello");
        MethodGeneric.print(100);
//        MethodGeneric.print(strObj);

        // Ký tự Wildcard : ?
        MyGeneric<? super Integer> out = new MyGeneric<>();
        out.setData(100);
    }
    public int sum(int a, int b) { // a, b là các tham số
        return a + b;
    }
}
