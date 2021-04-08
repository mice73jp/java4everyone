public class OneDemenArrayExam {
    public int[] makeArray() {
        int[] array = new int[]{1, 2, 3, 4, 5};
        return array;
    }
    public static void main(String[] args) {
        OneDemenArrayExam exam = new OneDemenArrayExam();
        int[] array  = exam.makeArray();
        if ( array.length == 5 &&
            array[0] == 1 &&
            array[1] == 2 &&
            array[2] == 3 &&
            array[3] == 4 &&
            array[4] == 5 ) {
                System.out.println("Correct!");
            }
        else {
            System.out.println("Incorrect!");
        }
    }
}
