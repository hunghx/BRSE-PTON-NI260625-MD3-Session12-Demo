package java8.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        // tạo 1 danh sách
//        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
//        // Hãy tìm và in ra các số chia hết cho 3
//        list.stream().filter(value -> value%3 == 0)
//                .forEach(System.out::println);
//        // Hãy tính tổng của của số lẻ ở trong danh sách
//        int total =  list.stream().filter(value -> value % 2 == 1)
//                .reduce(0, Integer::sum);
//
//        System.out.println("Tổng : " + total);
        /*
             ["Táo","Chuối","Ổi","Đào","Mận","Chanh"];

            Arrays.asList();

            - Hãy lọc các loại quả có 3 ký tự và đếm số lượng loại quả có 3 ký tự

            - Hãy in danh sách quả theo thứ tự A-Z (tăng dần theo alphabe)
            Quả Chanh
            Quả Chuối
            .........
            - Kiểm tra xem có loại quả nào có 6 ký tự trong danh sách hay ko
         */

        List<String> fruits = Arrays.asList("Táo","Chuối","Ổi","Đào","Mận","Chanh");
        // - Hãy lọc các loại quả có 3 ký tự và đếm số lượng loại quả có 3 ký tự
        long count = fruits.stream().filter(fruit-> fruit.length() == 3).count();
        System.out.println("Số lượng loại quả có 3 kí tự : "+count);
        //  Hãy in danh sách quả theo thứ tự A-Z (tăng dần theo alphabe)
        fruits.stream().sorted(String::compareTo)
                .forEach(fruit -> System.out.println("Quả "+fruit));
        // Kiểm tra xem có loại quả nào có 6 ký tự trong danh sách hay ko
        boolean isHas = fruits.stream().anyMatch(fruit-> fruit.length() == 5);
        System.out.println("Có loại quả nào có 5 kí tự hay ko : "+isHas);

        int arr[] = {1,2,3,4,5};
    }
}
