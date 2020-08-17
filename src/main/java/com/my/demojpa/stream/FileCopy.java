package com.my.demojpa.stream;

import jdk.nashorn.internal.ir.CallNode;

import java.io.*;

public class FileCopy {

    public static void main(String[] args) {
        try( FileInputStream in = new FileInputStream("C:\\Users\\ASUS\\Desktop\\readme.txt");
             BufferedInputStream bis = new BufferedInputStream(in);
              FileOutputStream out = new FileOutputStream("C:\\Users\\ASUS\\Desktop\\readme2.txt");
             BufferedOutputStream fos = new BufferedOutputStream(out);){
            final long startTime = System.nanoTime();
            byte[] buffer = new byte[1024];
            int len = bis.read(buffer);
            while(len != -1){
                fos.write(buffer,0,len);
                len = bis.read(buffer);
            }
            long endTime = System.nanoTime() - startTime;
            System.out.println(endTime/1000000+"毫秒");
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }

    }
}
