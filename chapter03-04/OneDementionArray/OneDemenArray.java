public class OneDemenArray {
    public static void main(String[] args) {
        int[] array1 = new int[5];
        int[] array2 = new int[]{1, 2, 3, 4, 5};
        int[] array3 = {6, 7, 8, 9, 10};

        array1[0] = 11;
        array1[2] = 12;
        array1[4] = 13;

        for( int idx = 1; idx < array1.length; idx++ ) {
            System.out.println("idx : " + idx + " value : " + array1[idx]);
        }

        System.out.println("array2[2] : " + array2[2]);
        System.out.println("array3[array3.length-1] : " + array3[array3.length-1]);
    }
}