package java_011_stream.stream_001_inputStreamReader;

import org.testng.annotations.Test;

import java.io.*;
import java.nio.charset.StandardCharsets;

/**
 * TODO 转换流：属于字符流
 * InputStreamReader：将字节流转换为字符流
 * OutputStreamWriter：将字符流转换为字节流
 *
 *
 *
 *
 */
public class inputStreamReader_001 {

    @Test
    public void inputStreamReader_001_test_001() throws IOException {
//        FileInputStream fileInputStream = new FileInputStream("E:\\桌面\\JAVA开发\\All_note\\Java_001_javaee\\src\\main\\java\\java_011_stream\\stream_001_inputStreamReader\\dbcp.txt");
        FileInputStream fileInputStream = new FileInputStream("src\\main\\java\\java_011_stream\\stream_001_inputStreamReader\\dbcp.txt");

        InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream, "UTF-8");

        char[] chars = new char[20];
        int len;
        while((len = inputStreamReader.read(chars)) != -1){
            String s = new String(chars, 0, len);
            System.out.println(s);
        }

        inputStreamReader.close();

    }


    @Test
    public void inputStreamReader_001_test_002() throws IOException{
        File file1 = new File("src\\main\\java\\java_011_stream\\stream_001_inputStreamReader\\dbcp.txt");
        File file2 = new File("src\\main\\java\\java_011_stream\\stream_001_inputStreamReader\\dbcp_copy_gbk.txt");

        FileInputStream fileInputStream = new FileInputStream(file1);
        FileOutputStream fileOutputStream = new FileOutputStream(file2);

        InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream, "UTF-8");
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(fileOutputStream, "GBK");

        char[] cbuf = new char[20];
        int len;
        while((len = inputStreamReader.read(cbuf)) != -1){
            outputStreamWriter.write(cbuf, 0 , len);
        }

        inputStreamReader.close();
        outputStreamWriter.close();


    }

}
