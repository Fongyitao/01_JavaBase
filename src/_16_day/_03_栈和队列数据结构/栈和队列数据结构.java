package _16_day._03_栈和队列数据结构;

import java.util.LinkedList;

public class 栈和队列数据结构 {
    /*
* 栈
    * 先进后出
* 队列
    * 先进先出
* A:案例演示
    * 需求：请用LinkedList模拟栈数据结构的集合，并测试
    * 创建一个类将Linked中的方法封装

     */
    public static void main(String[] args) {
        LinkedList list = new LinkedList();     //创建集合对象
        for (int i = 0; i < 5; i++) {
            list.addLast(i);
        }

        while (!list.isEmpty()) {
            System.out.print(list.removeLast() + "\t");
        }
        //4	3	2	1	0
    }
}
