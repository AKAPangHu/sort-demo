/**
 * @author: 胖虎
 * @date: 2019/8/23 23:18
 **/
public class SortTest {
    public static void main(String[] args) throws Exception {
        int[] array1 = {2, 3, 4, 5, 14, 7, 2, 3, 2, 6, 10, 11};
        SelectSort.selectSort(array1);
        System.out.println("多个不同的数，功能测试");
        for (int i : array1) {
            System.out.print(i + " ");
        }
        int[] array2 = {2};
        SelectSort.selectSort(array2);
        System.out.println("\n测试只有一个数的情况");
        for (int i : array2) {
            System.out.print(i + " ");
        }
        int[] array3 = {};
        SelectSort.selectSort(array3);
        System.out.println("\n测试空数组的情况");
        for (int i : array3) {
            System.out.print(i + " ");
        }
        int[] array4 = {2, 3, 4, 5};
        SelectSort.selectSort(array4);
        System.out.println("\n测试所有正序的情况");
        for (int i : array4) {
            System.out.print(i + " ");
        }
        int[] array5 = {9, 8, 7, 6};
        SelectSort.selectSort(array5);
        System.out.println("\n测试所有逆序的情况");
        for (int i : array5) {
            System.out.print(i + " ");
        }

    }
}
