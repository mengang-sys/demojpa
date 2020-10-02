package com.my.demojpa.file;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class JavaIODemo {

    public static void main(String[] args){
     /*   File file = new File("D:"+File.separator+"hello"+File.separator+"aaa.txt");
        try(OutputStream outputStream = new FileOutputStream(file,true)){
            String str = "你好吗\r\n";
            outputStream.write(str.getBytes());
        }catch (IOException e){
            e.printStackTrace();
        }*/

        //listDir(file);
      /*  if(!file.getParentFile().exists()){
            file.getParentFile().mkdirs();
        }*/

       /*
        outputStream.close();*/

    }

    public static void listDir(File file){
        if(file.isDirectory()){
            File[] results = file.listFiles();
            if(results != null){
                for (int i = 0; i < results.length; i++) {
                    if(results[i].getName().equalsIgnoreCase("ccc.txt")){
                        return;
                    }
                    listDir(results[i]);
                }
            }
        }else{
            if(file.isFile()){
                String fileName = null;
                if(file.getName().endsWith(".txt")){
                    fileName = file.getName().substring(0,file.getName().lastIndexOf("."))+".java";
                    File newFile = new File(file.getParentFile(),fileName);
                    file.renameTo(newFile);
                }
            }
        }
        //System.out.println(file);
    }
}
