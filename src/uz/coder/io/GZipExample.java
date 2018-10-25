package uz.coder.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import java.io.IOException;
import java.util.zip.GZIPOutputStream;

public class GZipExample {
    public static void main(String[] args) {
        GZipExample zipObj = new GZipExample();
        zipObj.gzipMyFile();

    }

    private void gzipMyFile() {
        byte[] buffer = new byte[1024];
        try {
            GZIPOutputStream gos = new GZIPOutputStream(new FileOutputStream("/home/coder/Desktop/test.gz"));
            FileInputStream fis = new FileInputStream("/home/coder/Desktop/test.pdf");

            int length;
            while ((length = fis.read(buffer)) > 0) {
                gos.write(buffer, 0, length);
            }
            fis.close();
            gos.finish();
            gos.close();

            System.out.println("File Compressed!!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
