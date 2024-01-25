package java_004_常用类.common_004_date.date_001_req_use;

import org.testng.annotations.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class use_001_date {
    
    
    // TODO 获取当前时间的方法
    @Test
    public void use_001_test_002(){
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = new Date();
        String format = simpleDateFormat.format(date);
        System.out.println("format = " + format);
    }

    @Test
    public void use_001_test_001() throws ParseException {
        // TODO 1.获取当前时间


        Date date = new Date();
        System.out.println(date); // Thu Nov 23 18:19:19 CST 2023

        long time = date.getTime();// TODO 获取根据日期转换的毫秒数

        // TODO 2.获取指定时间
        long order_time = 170073498298L;
        Date date1 = new Date(order_time);

        SimpleDateFormat sdf = new SimpleDateFormat();
        String format = sdf.format(date);
        System.out.println("format = " + format); // 23-11-23 下午8:32

        // 字符串-->日期
        String str = "19-12-18 上午11:43";
        Date date2 = sdf.parse(str);
        System.out.println("date2 = " + date2); // Wed Dec 18 11:43:00 CST 2019


        // TODO 按照指定格式和解析：调用带参的构造器
        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        String format1 = sdf1.format(date);
        System.out.println("format1 = " + format1); // 2023-11-23 08:34:47

    }

}
