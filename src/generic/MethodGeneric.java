package generic;

public class MethodGeneric {
    // tại sao phương thức static ko thể định nghĩa tham số trên Lớp
    public static <T extends Number> void print(T value){ // Phương thức generic
        System.out.println("Value : "+value);
    }
    // giởi hạn kiểu : super và extends
}
