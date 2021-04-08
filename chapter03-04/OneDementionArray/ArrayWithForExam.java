public class ArrayWithForExam {
    public int[] fill100() {
        int[] array = new int[100];

        for(int idx = 0; idx < array.length; idx++) {
            array[idx] = idx + 1;
        }
        return array;
    }
    public static void main(String[] args) {
        ArrayWithForExam exam = new ArrayWithForExam();
        int[] arr2 = exam.fill100();

        int error_count = 0;
        for( int idx = 0; idx < arr2.length; idx++ ) {
            if (arr2[idx] != idx + 1) {
                System.out.println("array[" + idx + "] is wrong!");
                error_count++;
            }
        }

        if ( error_count == 0 ) {
            System.out.println("Correct!!");
        }
    }
}
