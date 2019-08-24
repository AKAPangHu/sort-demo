/**
 * 归并排序
 * @author: 胖虎
 * @date: 2019/8/24 17:23
 **/
public class MergeSort {

    public static void mergeSort(int[] arr){
        if (arr.length <= 1){
            return;
        }
        int[] tempArr = new int[arr.length];
        mergeSortCore(arr, tempArr, 0, arr.length - 1);
    }
    public static void mergeSortCore(int[] arr, int[] tempArr, int begin, int end){
        if (begin >= end){
            return;
        }
        int mid = (begin + end) >> 1;
        mergeSortCore(arr, tempArr, begin, mid);
        mergeSortCore(arr, tempArr, mid + 1, end);
        merge(arr, tempArr, begin, mid, mid + 1, end);
    }

    private static void merge(int[] arr, int[] tempArr,
                              int lBegin, int lEnd, int rBegin, int rEnd) {
        int tempIndex = 0;
        while (lBegin <= lEnd && rBegin <= rEnd){
            if (arr[lBegin] < arr[rBegin]){
                tempArr[tempIndex++] = arr[lBegin++];
            }
            else {
                tempArr[tempIndex++] = arr[rBegin++];
            }
        }
        while (lBegin <= lEnd){
            tempArr[tempIndex++] = arr[lBegin++];
        }
        while (rBegin <= rEnd){
            tempArr[tempIndex++] = arr[rBegin++];
        }
        tempIndex--;
        for ( ; tempIndex >= 0; tempIndex--, rEnd--){
            arr[rEnd] = tempArr[tempIndex];
        }
    }

}
