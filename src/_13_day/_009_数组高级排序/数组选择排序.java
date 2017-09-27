package _13_day._009_数组高级排序;

public class 数组选择排序 {
    /*
需求：
 数组元素：{24, 69, 80, 57, 13}
 请对数组元素进行排序。

 选择排序：
 择排序就是：用一个位置上的元素，一次与其他索引位置上的元素比较，小的在前面，大的在后面


  */
    public static void main(String[] args) {
        int[] arr = {24, 69, 80, 57, 13};
        选择排序(arr);  //13	24	57	69	80

    }

    //选择排序就是：用一个位置上的元素，一次与其他索引位置上的元素比较，
    //小的在前面，大的在后面
    private static void 选择排序(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i; j < arr.length - 1; j++) {
                if (arr[i] > arr[j+1]){
                    int temp = arr[i];
                    arr[i] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
    }



}
