package io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;

public class ReaderEx1 {
    public static void main(String[] args) {

        try {
            Reader in = new FileReader("c:\\temp\\file1.txt");
            FileWriter out = new FileWriter("c:\\temp\\output2.txts");

            int input = 0;
            char[] cbuf = new char[1024];
            while ((input = in.read(cbuf)) != -1) {
                //
                out.write(cbuf);
            }

            in.close();
            out.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
