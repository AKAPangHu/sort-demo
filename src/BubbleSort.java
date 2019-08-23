/**
 * 冒泡排序
 *
 * @author: 胖虎
 * @date: 2019/8/23 22:34
 **/
public class BubbleSort {

    public static void bubbleSort(int[] array) {
        int len = array.length;
        //每次都把范围缩小，然后遍历范围内的所有数，选出最大（小）值
        for (int end = len - 1; end > 0; end--) {
            //增加效率
            boolean over = true;
            for (int i = 0; i < end; i++) {
                if (array[i] > array[i + 1]) {
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    over = false;
                }
            }
            if (over){
                return;
            }
        }
    }


}
