package java_011_stream.stream_004_BufferedReaderWriter;

import org.testng.annotations.Test;

import java.io.*;

public class BufferedReaderWriter_001 {


    @Test
    public void BufferedReaderWriter_001_test_001() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader(new File("src/main/java/java_011_stream/stream_002_FileReaderWriter/hello.txt")));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(new File("src/main/java/java_011_stream/stream_002_FileReaderWriter/hello003.txt")));

        String data;
        while((data = bufferedReader.readLine()) != null){
            bufferedWriter.write(data);
            bufferedWriter.newLine();
        }
        bufferedReader.close();
        bufferedWriter.close();

    }
}
