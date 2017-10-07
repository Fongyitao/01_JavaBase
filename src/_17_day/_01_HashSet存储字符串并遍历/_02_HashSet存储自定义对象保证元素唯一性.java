package _17_day._01_HashSet存储字符串并遍历;

import java.util.HashSet;

public class _02_HashSet存储自定义对象保证元素唯一性 {
    /*
* A:案例演示
    * 存储自定义对象，并保证元素唯一性。

            HashSet<Person> hs = new HashSet<>();
            hs.add(new Person("张三", 23));
            hs.add(new Person("张三", 23));
            hs.add(new Person("李四", 23));
            hs.add(new Person("李四", 23));
            hs.add(new Person("王五", 23));
            hs.add(new Person("赵六", 23));
* 重写hashCode()和equals()方法

     */
    public static void main(String[] args) {
        HashSet<Person> hs = new HashSet<>();
        hs.add(new Person("张三",18));
        hs.add(new Person("张三",18));
        hs.add(new Person("李四",20));
        hs.add(new Person("张三",18));
        hs.add(new Person("李四",20));
        hs.add(new Person("李四",19));

        System.out.println(hs);
        //[Person{name='张三', age=18}, Person{name='李四', age=19}, Person{name='李四', age=20}]
    }
}
