# Java for Everyone
## Chapter 1-2 summary

### Basic template of Java source code
* Definition of belows
    * class and main function as execution point
    * Primitive variable type
        * Integer number - int
        * Real number - double
    * Constant
        * Don't assign value again after assigning once
    * Comment
        * single line comment - // xxxx
        * multiple line comment - /* .... */
        * source comment - /** explanation_src */
            * Almost same working as multiple line comment
            * The contents in this commend will show up by javaodc

```
public class HelloWorld {
    /**
     * 메인 함수
     * @param args
     *  현재는 명령어 파라매터를 무시.
     */
    public static void main(String[] args) {
        // The first printing sentence.
        System.out.println("Hello, World!");

        // 한줄 주석 : 기본형 설명
        /*
        여러줄 주석
            age     -   나이
            height  -   키
            NAME    -   이름( 상수 )
        */
        int age = 20;
        double height = 173.5;
        final String NAME = "채민석";

        System.out.printf("이름은 %s\n\t나이는 %d, 키는 %f\n", NAME, age, height);

        age = age + 1;
        height = height - 0.01;
        // NAME = "다른 사람";  // 실행 불가능 하므로 코멘트 처리
        System.out.printf("내년에는 이름은 %s\n\t나이는 %d, 키는 %f\n", NAME, age, height);
    }
}
```
