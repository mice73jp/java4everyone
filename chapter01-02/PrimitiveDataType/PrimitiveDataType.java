public class PrimitiveDataType {
    /**
     * 메인 함수
     * @param args
     *  현재는 명령어 파라매터를 무시.
     */
    public static void main(String[] args) {
        boolean isFun = true;
        char c ='f';              // 작은따옴표를 사용해야 합니다.
        int x = 59;
        long big = 3456789L;      // 뒤에 소문자 l이나 대문자 L을 붙여야 합니다.
        float f = 32.5f;           // 뒤에 소문자 f나 대문자 F를 붙여야 합니다. 
        double d = 23.34;

        System.out.printf("%b, %c, %d, %d, %f, %f\n", isFun, c, x, big, f, d);
    }
}