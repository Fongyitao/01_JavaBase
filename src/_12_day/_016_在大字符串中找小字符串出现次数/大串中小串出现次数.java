package _12_day._016_在大字符串中找小字符串出现次数;

public class 大串中小串出现次数 {
    /**
     * 统计大串中小串出现的次数
     */
    public static void main(String[] args) {
        //定义大串
        String max = "吃葡萄不吐葡萄皮，不吃葡萄倒吐葡萄皮";
        //定义小串
        String min = "葡萄";

        int count = 0;
        int index = 0;

        while ((index = max.indexOf(min)) != -1){
            count ++;
            max = max.substring(index+min.length());
        }
        System.out.println(count);

    }


}
