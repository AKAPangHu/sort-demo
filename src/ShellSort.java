/**
 * 希尔排序
 * 插入排序的增强版
 *
 * @author: 胖虎
 * @date: 2019/8/24 20:13
 **/
public class ShellSort {

    /**
     * Knuth增量版
     * 最坏情况下时间复杂度为O（N^2/3）
     *
     * @param array
     */
    public static void shellSort(int[] array) {
        int gap = 1, len = array.length;
        while (gap < len / 3) {
            gap = gap * 3 + 1;
        }
        for (; gap > 0; gap /= 3) {
            for (int i = gap; i < len; i++) {
                int temp = array[i];
                int j;
                for (j = i - gap; j >= 0 && array[j] > temp; j -= gap) {
                    array[j + gap] = array[j];
                }
                array[j + gap] = temp;
            }
        }
    }

}
