package java8.time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        // cách cũ
        Date date = new Date();
        // Kiểu ngày tháng nắm
        LocalDate today = LocalDate.now();
        // giờ, phút giây
        LocalTime now = LocalTime.now();
        // Ngày , tháng năm và giờ phút giấy
        LocalDateTime dateTime = LocalDateTime.now();

        // thao tác tính toán trên thời gian :
        // đo lường khoảng cách giữa 2 mốc thời gian
        ///  cộng trừ thời gian
        // 100 ngày nữa thì là ngày bao nhiêu
        System.out.println("Hôm nay là : "+ today);
        LocalDate _100DaysLater = today.plusDays(100);
        System.out.println("100 ngày sau là : "+ _100DaysLater);
    }
}
