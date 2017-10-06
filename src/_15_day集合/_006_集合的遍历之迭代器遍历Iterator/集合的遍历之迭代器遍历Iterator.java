package _15_day集合._006_集合的遍历之迭代器遍历Iterator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class 集合的遍历之迭代器遍历Iterator {
    /*
* A:迭代器概述
    * 集合是用来存储元素,存储的元素需要查看,那么就需要迭代(遍历)
     */

    public static void main(String[] args) {

        Collection c = new ArrayList();
        c.add("a");
        c.add("b");
        c.add("c");
        c.add("d");

        Iterator it = c.iterator();         //获取迭代器的引用
        while(it.hasNext()) {               //集合中的迭代方法(遍历)
            System.out.println(it.next());
        }

    }
}
