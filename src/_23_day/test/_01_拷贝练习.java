package _23_day.test;

import java.io.*;
import java.util.Scanner;

public class _01_拷贝练习 {
    public static void main(String[] args) {

    }

    /*
    获取文件
    1、返回值void
    2、参数列表：无
     */
    public static File getFile(){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入文件夹路径：");
        while (true){
            File dir = new File(sc.nextLine());
            if (dir.exists()){
                System.out.println("Error，您输入的路径不存在，请重新输入：");
            }else if (dir.isFile()){
                System.out.println("Error,您输入的不是文件夹，请重新输入");
            }else {
                return dir;
            }
        }
    }

    /*
    拷贝文件夹
    1、返回值：void
    2、参数列表：File oldDir,File newDir
     */
    public static void copyDir(File oldDir,File testCopy) throws IOException {

        //在目标文件夹testCopye中创建和原文件夹同名的文件夹
        File newDir = new File(testCopy,oldDir.getName());
        newDir.mkdirs();

        File[] files = newDir.listFiles();
        for (File subFile : files) {
            if (subFile.isFile()){
                BufferedInputStream bis1 = new BufferedInputStream(new FileInputStream(subFile));
                BufferedOutputStream bos1 = new BufferedOutputStream(new FileOutputStream(new File(subFile,subFile.getName())));
                for (int b;(b = bis1.read()) != -1;){
                    bos1.write(b);
                }
                bis1.close();
                bos1.close();
            }else {
                copyDir(subFile,newDir);
            }
        }
    }

}
