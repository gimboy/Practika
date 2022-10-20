public class ArrayCalc {
    public static void main(String[] args) {
//        int[] ar1 = new int[6];
//        int[] ar2 = new int[5];
//        arrayDiff(ar1,ar2);
        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = {1,2,3,4,0};

        arrayDivision(arr1,arr2);
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
    static int[] arrayDivision(int[] arr1, int[] arr2) {
        if (arr1 == null) throw new RuntimeException("arr1 = null");
        if (arr2 == null) throw new RuntimeException("arr2 = null");
        if (arr1.length != arr2.length) throw new RuntimeException("length arr1 != arr2");
        int[] arr = new int[arr1.length];
        for (int i = 0; i < arr1.length; i++) {
            if(arr2[i] == 0) throw new RuntimeException("division by 0");
            arr[i] = arr1[i]/arr2[i];
        }
        return arr;
    }
}
