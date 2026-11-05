package java8.lambda;

import java8.MyInterface;

public class Main {
    // Arrow Function : () => {} ~ Biểu thức lambda

    // Functional Interface : Interface chỉ có 1 phương thức trừu tượng

    // Biểu thức lambda dùng để tạo nhanh các đối tượng từ Functional Interface
    public static void main(String[] args) {
        MyInterface obj1 = (x,y) -> {
            return 1;
        };
        MyInterface obj2 = (c,d) -> {
            return 2;
        };
    }
}
