/**
 * 选择排序
 * @author: 胖虎
 * @date: 2019/8/24 17:41
 **/
public class SelectSort {

    public static void selectSort(int[] array){
        int len = array.length;
        for (int i = len - 1; i > 0; i--){
            int max = Integer.MIN_VALUE;
            int maxIndex = -1;
            for (int j = 0; j <= i; j++){
                if (array[j] >= max){
                    max = array[j];
                    maxIndex = j;
                }
            }
            int temp = array[i];
            array[i] = max;
            array[maxIndex] = temp;
        }
    }

}
