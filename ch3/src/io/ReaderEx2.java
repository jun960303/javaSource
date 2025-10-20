package io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.Reader;

public class ReaderEx2 {
    public static void main(String[] args) {

        try {
            InputStream in = new FileInputStream("c:\\temp\\file1.txt");
            InputStreamReader reader = new InputStreamReader(in, "utf8");

            FileWriter out = new FileWriter("c:\\temp\\output2.txt");

            int input = 0;
            char[] cbuf = new char[1024];
            while ((input = reader.read(cbuf)) != -1) {
                // cbuf => String
                out.write(new String(cbuf));
            }

            in.close();
            out.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
