package _13_day._001_StringBuffer概述;
/**
 ###13.01_常见对象(StringBuffer类的概述)
 * A:StringBuffer类概述
 * 通过JDK提供的API，查看StringBuffer类的说明
 * 线程安全的可变字符序列
 * B:StringBuffer和String的区别
 * String是一个不可变的字符序列
 * StringBuffer是一个可变的字符序列

 ###13.02_常见对象(StringBuffer类的构造方法)
 * A:StringBuffer的构造方法：
 * public StringBuffer():无参构造方法
 * public StringBuffer(int capacity):指定容量的字符串缓冲区对象
 * public StringBuffer(String str):指定字符串内容的字符串缓冲区对象
 * B:StringBuffer的方法：
 * public int capacity()：返回当前容量。    理论值(不掌握)
 * public int length():返回长度（字符数）。 实际值
 * C:案例演示
 * 构造方法和长度方法的使用
 */
public class StringBuffer概述 {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();
        sb.append("Hello");
        System.out.println(sb);
    }
}
