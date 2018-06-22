package com.example.demo.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

/**
 * @author 12084
 * @create 2018-05-15 19:36
 */

public class ZipUtil {

    public static void main(String[] args) {
        try {
            ZipUtil.zip();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void zip() throws Exception {
        System.out.println("开始压缩");
        // 定义要压缩的文件
        File file = new File("d:" + File.separator + "/log/hyxd.exe");
        System.out.println("file.getName():" + file.getName());
        // 定义压缩文件名称
        File zipFile = new File("d:" + File.separator + "hyxd.zip");
        // 定义文件输入流
        InputStream input = null;
        // 声明压缩流对象
        ZipOutputStream zipOut = null;
        zipOut = new ZipOutputStream(new FileOutputStream(zipFile));
        // 设置注释
        zipOut.setComment("liuxunTEST");
        int temp = 0;
        // 判断是否是文件夹
        if (file.isDirectory()) {
            // 列出全部文件
            File lists[] = file.listFiles();
            for (int i = 0; i < lists.length; i++) {
                // 定义文件的输入流
                input = new FileInputStream(lists[i]);
                ZipEntry entry = new ZipEntry(file.getName() + File.separator + lists[i].getName());
                // 设置ZipEntry对象
                zipOut.putNextEntry(entry);
                System.out.println(entry.getName());

                // 读取内容
                while ((temp = input.read()) != -1) {
                    // 压缩输出
                    zipOut.write(temp);
                }
                // 关闭输入流
                input.close();
            }
        }
        // 关闭输出流
        zipOut.close();
        System.out.println("压缩结束");
    }


}
