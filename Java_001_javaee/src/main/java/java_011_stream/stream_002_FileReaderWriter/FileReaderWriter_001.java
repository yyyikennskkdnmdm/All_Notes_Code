package java_011_stream.stream_002_FileReaderWriter;

import org.testng.annotations.Test;

import java.io.*;

public class FileReaderWriter_001 {


    @Test
    public void FileReaderWriter_001_test_001() throws IOException {
        File file = new File("src/main/java/java_011_stream/stream_002_FileReaderWriter/hello.txt");

        FileReader fileReader = new FileReader(file);

        int data;
        while((data = fileReader.read()) != -1){

            System.out.println((char) data);

        }

        if(fileReader!=null){
            fileReader.close();
        }
    }



    @Test
    public void FileReaderWriter_001_test_002() throws IOException {
        File file = new File("src/main/java/java_011_stream/stream_002_FileReaderWriter/hello.txt");
        FileReader fileReader = new FileReader(file);
        char[] cbuf = new char[5];
        int len;
        while((len = fileReader.read(cbuf)) != -1){
            String str = new String(cbuf, 0, len);
            System.out.println(str);
        }
        fileReader.close();
    }


    @Test
    public void FileReaderWriter_001_test_003() throws IOException{
        File file = new File("src/main/java/java_011_stream/stream_002_FileReaderWriter/hello002.txt");
        FileWriter fileWriter = new FileWriter(file);

        fileWriter.write("i have a dream!");
        fileWriter.write("you need to have a dream");

        fileWriter.close();
    }
}
