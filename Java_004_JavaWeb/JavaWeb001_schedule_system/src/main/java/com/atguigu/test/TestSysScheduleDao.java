package com.atguigu.test;


import com.atguigu.dao.SysScheduleDao;
import com.atguigu.dao.impl.SysScheduleDaoImpl;
import com.atguigu.pojo.SysSchedule;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.List;

public class TestSysScheduleDao  {
    private static SysScheduleDao scheduleDao;
    @BeforeClass
    public static void initScheduleDao(){
        scheduleDao =new SysScheduleDaoImpl();

    }
    @Test
    public void testAddSchedule(){

        int rows =scheduleDao.addSchedule(new SysSchedule(null,2,"学习数据库",1));
        System.out.println(rows);


    }


    @Test
    public void testFindAll(){
        List<SysSchedule> scheduleList = scheduleDao.findAll();
        scheduleList.forEach(System.out::println);
    }
}
