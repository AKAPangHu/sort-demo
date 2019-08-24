/**
 * 插入排序
 * @author: 胖虎
 * @date: 2019/8/23 23:27
 **/
public class InsertSort {

    public static void insertSort(int[] array){
        int len = array.length;
        for (int i = 1; i < len; i++){
            int j;
            //先记录下要插入的数，因为开始比较时，会将原值覆盖
            int temp = array[i];
            //开始将其他数向后筛选，直到找到插入位置
            //最快只需要比较一次
            for (j = i; j > 0 && temp < array[j - 1]; j--){
                array[j] = array[j - 1];
            }
            //插入
            array[j] = temp;
        }
    }

}
