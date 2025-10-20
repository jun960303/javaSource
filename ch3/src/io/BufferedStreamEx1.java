package io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class BufferedStreamEx1 {
    public static void main(String[] args) {

        try {
            InputStream in = new FileInputStream("c:\\temp\\img1.jpg");
            BufferedInputStream bis = new BufferedInputStream(in);
            OutputStream out = new FileOutputStream("c:\\temp\\copy2.jpg");
            BufferedOutputStream bos = new BufferedOutputStream(out);

            int input = 0;
            byte[] bytes = new byte[1024];
            while ((input = bis.read(bytes)) != -1) {
                // System.out.println((char) input);
                bos.write(bytes);
            }

            in.close();
            out.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
