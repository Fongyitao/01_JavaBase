package _12_day._011_String类的转换功能;

public class String类的转换功能 {
    /**
     byte[] getBytes() : 把字符串转换为字节数组
     char[] toCharArray() : 把字符串转换为字符数组
     static String valueOf(char[] chs) : 把字符数组转成字符串
     static String valueOf(int i) : 把int类型的数据转成字符串
     *注意：String 类的valueOf方法可以把任意类型的数据转成字符串

     String toLowerCase() : 把字符串转成小写
     String to UpperCase() : 把字符串转成大写
     String concat(String str) : 把字符串拼接
     */
    public static void main(String[] args) {

        String s1 = "iou";
        byte[] arr1 = s1.getBytes();
        for (int i = 0; i < arr1.length; i++) {
            System.out.println(arr1[i] + " ");
        }
    }

}
