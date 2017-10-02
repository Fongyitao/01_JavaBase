package _14_day._002_正则的分割功能;

import java.util.Arrays;

public class _02_把给定字符串中数字排序 {
    //把给定字符串中数字排序
    //需求：我有如下一个字符串:”91 27 46 38 50”，请写代码实现最终输出结果是：”27 38 46 50 91”
    public static void main(String[] args) {
        String s = "91 27 46 38 50";

        String[] arr = s.split(" ");
        int[] nums = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            nums[i] = Integer.valueOf(arr[i]);
        }

        //选择排序
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] > nums[j]){
                    nums[i] = nums[i] ^ nums[j];
                    nums[j] = nums[i] ^ nums[j];
                    nums[i] = nums[i] ^ nums[j];
                }
            }
        }

        //遍历nums
        for (int i :
                nums) {
            System.out.println(i);
        }
        /*
        27
        38
        46
        50
        91
         */
    }
}
