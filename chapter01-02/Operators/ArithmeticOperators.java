public class ArithmeticOperators {
    /**
     * 메인 함수
     * @param args
     *  현재는 명령어 파라매터를 무시.
     */
    public static void main(String[] args) {
        System.out.println("단항 연산자");
        int i1 = 0;
        int i2 = 10;
        int i3 = -20;

        System.out.printf("Before : i1 = %d, i2 = %d, i3 = %d\n", i1, i2, i3);
        System.out.printf("Ope + : i1 = %d, i2 = %d, i3 = %d\n", +i1, +i2, +i3);
        System.out.printf("Ope - : i1 = %d, i2 = %d, i3 = %d\n", -i1, -i2, -i3);

        System.out.println("증감 연산자");
        int i10 = 0;
        i10++;
        System.out.println(i10);
        ++i10;
        System.out.println(i10);

        int i20 = 10;
        int i30 = 0;
        System.out.printf("Before : i10 = %d, i20 = %d, i30 = %d\n", i10, i20, i30);
        i30 = ++i10 + i20;
        System.out.printf("In front : i10 = %d, i20 = %d, i30 = %d\n", i10, i20, i30);

        i30 = 0;
        System.out.printf("Before : i10 = %d, i20 = %d, i30 = %d\n", i10, i20, i30);
        i30 = i10++ + i20;
        System.out.printf("Behind : i10 = %d, i20 = %d, i30 = %d\n", i10, i20, i30);

        System.out.println("산술 연산자");
        int i = 5;
        int j = 2;
        System.out.printf("i + j = %d\n", i + j);
        System.out.printf("i - j = %d\n",i - j);
        System.out.printf("i * j = %d\n",i * j);
        System.out.printf("i / j = %d\n",i / j);
        System.out.printf("i / j = %f\n",i / (double)j);
        System.out.printf("i %% j = %d\n",i % j);
    }
}