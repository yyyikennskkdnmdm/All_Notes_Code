package java_004_String_StringBuffer_STringBuilder_Date.common_004_date.date_001_req_use;

import org.testng.annotations.Test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class use_002_localdate {



    @Test
    public void use_002_localdate_test_001(){
        LocalDate date = LocalDate.now(); // 2023-11-23

        LocalTime time = LocalTime.now(); // 20:48:03.817

        LocalDateTime dateTime = LocalDateTime.now();// 2023-11-23T20:48:36.642


        LocalDateTime localDateTime1 = LocalDateTime.of(2020, 10, 6, 13, 23, 43);


        LocalDateTime localDateTime = LocalDateTime.now();
        //getXxx()：获取相关的属性
        System.out.println(localDateTime.getDayOfMonth());
        System.out.println(localDateTime.getDayOfWeek());
        System.out.println(localDateTime.getMonth());
        System.out.println(localDateTime.getMonthValue());
        System.out.println(localDateTime.getMinute());

        LocalDate localDate = LocalDate.now();
        //withXxx():设置相关的属性
        LocalDate localDate1 = localDate.withDayOfMonth(22);

        LocalDateTime localDateTime2 = localDateTime.withHour(4);
        LocalDateTime localDateTime3 = localDateTime.plusMonths(3);
        LocalDateTime localDateTime4 = localDateTime.minusDays(6);

    }
}
