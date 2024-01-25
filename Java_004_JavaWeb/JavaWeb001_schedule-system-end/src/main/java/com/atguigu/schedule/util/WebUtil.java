package com.atguigu.schedule.util;


import com.atguigu.schedule.common.Result;
import com.fasterxml.jackson.databind.ObjectMapper;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.BufferedReader;
import java.io.IOException;
import java.text.SimpleDateFormat;

public class WebUtil {
    private static ObjectMapper objectMapper;
    // 初始化objectMapper
    static{
        objectMapper=new ObjectMapper();
        // 设置JSON和Object转换时的时间日期格式
        objectMapper.setDateFormat(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"));
    }


    // TODO  从请求中获取JSON串并转换为Object
    //      request.gerReader()：获取从用户端传输的Json字符串
    //      BufferedReader.readLine()：读取一行字符串
    //      objectMapper.readValue(buffer.toString(),clazz):转换为object
    public static <T> T readJson(HttpServletRequest request,Class<T> clazz){
        T t =null;
        BufferedReader reader = null;
        try {
            reader = request.getReader();
            StringBuffer buffer =new StringBuffer();
            String line =null;
            while((line = reader.readLine())!= null){
                System.out.println(line);// TODO {"username":"zhangsan","userPwd":"123456"}
                buffer.append(line);
            }
            t= objectMapper.readValue(buffer.toString(),clazz);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return t;
    }



    // TODO 将Result对象转换成JSON串并放入响应对象
    //      reponse.setCOntentType("application/json;charset=UTF-8"):设定response的类型
    //      objectMapper.writeValueAsString(obj):将obj转换为json字符串
    //      response.getWriter().write(json):将json字符串写入response中
    public static void writeJson(HttpServletResponse response, Result result){
        response.setContentType("application/json;charset=UTF-8");
        try {
            String json = objectMapper.writeValueAsString(result);
            response.getWriter().write(json);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}