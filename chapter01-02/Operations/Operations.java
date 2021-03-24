public class Operations {
    /**
     * 메인 함수
     * @param args
     *  현재는 명령어 파라매터를 무시.
     */
    public static void main(String[] args) {
        // 단항 연산자
        int i1 = 0;
        int i2 = 10;
        int i3 = -20;

        System.out.printf("Before : i1 = %d, i2 = %d, i3 = %d\n", i1, i2, i3);
        System.out.printf("Ope + : i1 = %d, i2 = %d, i3 = %d\n", +i1, +i2, +i3);
        System.out.printf("Ope - : i1 = %d, i2 = %d, i3 = %d\n", -i1, -i2, -i3);
    }
}