package io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.Reader;

public class BufferredReaderEx1 {
    public static void main(String[] args) {

        try {
            // InputStream in = new FileInputStream("c:\\temp\\file1.txt");
            // InputStreamReader reader = new InputStreamReader(in, "utf8");
            // BufferedReader br = new BufferedReader(reader);

            // FileWriter out = new FileWriter("c:\\temp\\output2.txt");
            // BufferedWriter bw = new BufferedWriter(out);

            BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("c:\\temp\\file1.txt")));
            BufferedWriter bw = new BufferedWriter(new FileWriter("c:\\temp\\output2.txt"));

            String input = null;

            while ((input = br.readLine()) != null) {
                // cbuf => String
                bw.write(input);
                bw.newLine();
            }

            bw.flush();// 버퍼 비우기

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
