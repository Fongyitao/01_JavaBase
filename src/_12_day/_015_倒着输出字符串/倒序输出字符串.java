package _12_day._015_倒着输出字符串;

import java.util.Scanner;

public class 倒序输出字符串 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串：");
        String line = sc.nextLine();

        char[] arr = line.toCharArray();
        String s = "";
        for (int i = arr.length-1; i >= 0; i--) {
            s += arr[i];
        }
        System.out.println(s);
    }
}
