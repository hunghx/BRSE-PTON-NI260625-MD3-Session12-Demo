package java8;
@FunctionalInterface
public interface MyInterface { // functional interface
    // chưa phương thức trừu tượng
    int init(int a, String b);
    default void printMessage() {
        System.out.println("Đây là phương thức default");
    }

    static void  handleMessage() {
        System.out.println("Đây là phương thức tĩnh");
    }

}
