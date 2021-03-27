public class IfExam {

    public int IfTest(int value) {
        int ret = 0;
        if ( value % 3 == 0 ) {
            ret = 3;
        } else if ( value %4 == 0 ) {
            ret = 4;
        }

        return ret;
    }
    public static void main(String[] args) {
        //  int value = 6;
        int value = 5;

        if (value % 3 == 0) {
            System.out.println(value + "는(은) 3의 배수입니다.");
        }

        System.out.println(new IfExam().IfTest(6));
        System.out.println(new IfExam().IfTest(8));
    }
}
