package java_011_stream.stream_003_BufferedStream;

import org.testng.annotations.Test;

import java.io.*;

public class BufferedStream_001 {


    @Test
    public void BufferedStream_001_test_001() throws IOException {
        // TODO 图片也可以换为视频
        File file = new File("src/main/java/java_011_stream/stream_003_BufferedStream/爱情与友情.jpg");
        File file1 = new File("src/main/java/java_011_stream/stream_003_BufferedStream/爱情与友情2.jpg");

        FileInputStream fileInputStream = new FileInputStream((file));
        FileOutputStream fileOutputStream = new FileOutputStream((file1));

        BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream);

        byte[] buffer = new byte[1024];
        int len;
        while((len = bufferedInputStream.read(buffer)) != -1){
            bufferedOutputStream.write(buffer, 0, len);
        }

        bufferedInputStream.close();
        bufferedOutputStream.close();
    }


}
