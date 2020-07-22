package com.github.sftp;

import java.io.*;
import java.nio.charset.Charset;
import java.util.Date;
import java.util.List;

public class SftpService {

    public File uploadFile1(List<String> list, Date start){
        String fileName = "guccb_ETC_ACCT_"+".txt";
        File file1 = new File(fileName);
        if(file1.exists()){
            file1.delete();
        }
        try (FileOutputStream fos = new FileOutputStream(file1);
             OutputStreamWriter osw = new OutputStreamWriter(fos, Charset.forName("GBK"));
             BufferedWriter bw = new BufferedWriter(osw)){
            StringBuilder sb = new StringBuilder();
            file1.createNewFile();
            for (String vo:list){

                bw.write(sb.toString());
                bw.newLine();
                sb.delete(0, sb.length());
            }
            bw.flush();
        } catch (IOException e) {
            return null;
        }
        return file1;
    }
}
