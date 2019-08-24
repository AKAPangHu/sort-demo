/**
 * 堆排序
 * 建最大堆实现正序，最小堆倒序
 * @author: 胖虎
 * @date: 2019/8/24 16:56
 **/
public class HeapSort {

    public static void heapSort(int[] array){
        if (array.length <= 1){
            return;
        }
        int end = array.length - 1;
        int beginIndex = (end - 1) >> 1;
        //建堆
        for (int i = beginIndex; i >= 0; i--){
            //下滤
            percDown(array, i, end);
        }
        
        for (int i = 1; i < array.length; i++){
            swap(array, 0, end);
            percDown(array, 0, --end);
        }
    }

    private static void percDown(int[] array, int i, int end) {
        int lChild = (i << 1) + 1;
        int rChild = lChild + 1;
        int maxChild = lChild;
        if (lChild > end){
            return;
        }
        if (rChild <= end && array[rChild] > array[lChild]){
            maxChild = rChild;
        }
        
        if (array[maxChild] > array[i]){
            swap(array, maxChild, i);
            //交换完毕要保证下面的结点也是符合堆性质的，继续下滤
            percDown(array, maxChild, end);
        }
    }

    private static void swap(int[] array, int maxChild, int i) {
        int temp = array[maxChild];
        array[maxChild] = array[i];
        array[i] = temp;
    }

}
