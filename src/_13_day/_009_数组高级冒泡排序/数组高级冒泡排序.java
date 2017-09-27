package _13_day._009_数组高级冒泡排序;

public class 数组高级冒泡排序 {
    /*
需求：
    数组元素：{24, 69, 80, 57, 13}
    请对数组元素进行排序。

    冒泡排序
        相邻元素两两比较，大的往后放，第一次完毕，最大值出现在了最大索引处

     */
    public static void main(String[] args) {

        int[] arr = {24, 69, 80, 57, 13};
        for (int i = 0; i < arr.length -1; i++) {
            for (int j = 0; j < arr.length -1-i; j++) {
                int temp = 0;
                if (arr[j] > arr[j + 1]){
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ",");
        }
    }
}
