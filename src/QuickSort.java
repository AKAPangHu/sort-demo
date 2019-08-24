import java.util.Random;

/**
 * 快速排序
 * @author: 胖虎
 * @date: 2019/8/24 13:48
 **/
public class QuickSort {

    public static void quickSort(int[] array) throws Exception {
        if (array.length <= 0){
            return;
        }
        quickSortCore(array, array.length, 0, array.length - 1);
    }

    public static void quickSortCore(int[] array, int len, int start, int end) throws Exception {
        if (start == end){
            return;
        }

        int index = partition(array, len, start, end);
        //记得不要再循环内直接调用partition
        //这样不能再次分开
        if (index > start){
            quickSortCore(array, len, start, index - 1);
        }
        if (index < end){
            quickSortCore(array, len, index + 1, end);
        }
    }

    private static int partition(int[] array, int len, int start, int end) throws Exception {
        if (len <= 0 || start < 0 || end >= len){
            throw new Exception("Invalid Parameters");
        }
        if (start == end){
            return start;
        }
        int small = start - 1;
        int pivotIndex = new Random().nextInt(end - start) + start;
        swap(array, pivotIndex, end);
        for (int index = start ; index < end; index++){
            if (array[index] < array[end]){
                small++;
                if (small != index){
                    swap(array, small, index);
                }
            }
        }
        small++;
        swap(array, small, end);
        return small;
    }
    private static void swap(int[] array, int a, int b){
        int temp = array[a];
        array[a] = array[b];
        array[b] = temp;
    }


}
