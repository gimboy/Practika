public class First {
    public static void main(String[] args) {
        int[] ar1 = new int[6];
        int[] ar2 = new int[5];
        arrayDiff(ar1,ar2);
    }

    static int[] arrayDiff(int[] arr1, int[] arr2) {
        if (arr1 == null) throw new RuntimeException("arr1 = null");
        if (arr2 == null) throw new RuntimeException("arr2 = null");
        if (arr1.length != arr2.length) throw new RuntimeException("length arr1 != arr2");
        int[] arr = new int[arr1.length];
        for (int i = 0; i < arr1.length; i++) {
            arr[i] = arr1[i]-arr2[i];
        }
        return arr;
    }
}
// 1. Реализуйте метод, принимающий в качестве аргументов два целочисленных массива,
// и возвращающий новый массив, каждый элемент которого равен разности элементов двух входящих массивов в той же ячейке.
// Если длины массивов не равны, необходимо как-то оповестить пользователя.