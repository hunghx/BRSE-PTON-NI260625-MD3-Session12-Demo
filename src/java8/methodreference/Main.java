package java8.methodreference;

import java8.MyInterface;

public class Main {
    public static void main(String[] args) {
        // Method reference : tham chiếu của phương thức cú pháp để rút gọn cú pháp Lambda nếu như đã có sẵn 1 phương thức trong Java
        MyInterface obj3 = (x,y)->{
            return 1;
        };

        MyInterface obj4 = MyMachine::test; // tham chiếu phương thức tĩnh
    }
}
