package _17_day._03_练习;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class _03_去掉集合中的重复元素 {
    //将集合中的重复元素去掉
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("a");
        list.add("a");
        list.add("b");
        list.add("a");
        list.add("c");
        System.out.println(list);//[a, a, b, a, c]
        HashSet<String> hs = new HashSet<>();
        hs.clear();
//        for (String s : list) {
//            hs.add(s);
//        }
        hs.addAll(list);
        System.out.println(hs);//[a, b, c]

        //用LinkedHashSet实现
        LinkedHashSet<String> lhs = new LinkedHashSet<>();
        lhs.clear();
        lhs.addAll(list);
        System.out.println(lhs);//[a, b, c]
    }
}
