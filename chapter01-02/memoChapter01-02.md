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

### Primitive data type in Java
기본타입의 변수

|Type|KeyWord|Amount|Range|Example|Comment|
|----|----|----|----|----|---|
|논리형|boolean|1byte|true / false|boolean isFun = true;||
|문자형|char|1byte|0~65,535|char c = 'f';|하나의 문자만 저장. 여러개의 문자는 String객체 혹은 문자열 배열을 사용|
|정수형|byte|1byte|-128~127|byte b = 89;||
||short|2byte|-32,768~32,767|short s = 32760;||
||char|2byte|0~65,535|char c = 64;||
||int|4byte|-2147483648 : 2147483647|int x = 59; int z = x;||
||long|8byte|…|long big = 3456789L;|값을 대입할 때 값에 L을 붙여야 함.|
|실수형|float|4byte|-3.4E038~3.4E038|float f = 32.5f|값을 대입할 때 값에 F를 붙여야 함.|
||double|8byte|-1.7E308~1.7E308|double d = 23.34||

### Literal

변수(primitive data type)에 저장 된 실제 값을 리터럴이라고 한다.
변수의 형태에 따른 문자나 숫자 표기를 의미하며, 정수 리터럴, 실수 리터럴, 문자 리터럴, 논리 리터럴이 있으며, 리터럴을 특정 형의 변수에 대입한다.

```Java
long    big   =   3456789L;
  |      |          |
변수형     |        정수 리터럴(long)
        변수명

char    ch   =   'A';
  |      |        |
변수형     |      문자 리터럴
        변수명
```

### Print values out
변수 값의 출력을 위해서 `System.out.println()`을 사용. 하지만, 이 함수는 하나의 변수만 출력 가능.
여러개의 변수 및 다양한 변수 형의 값을 한번에 출력하기 위해서 `System.out.printf("%c %d %b", aa, bb, cc)`를 사용한다.

```Java
boolean isFun = true;
char c ='f';              // 작은따옴표를 사용해야 합니다.
int x = 59;
long big = 3456789L;      // 뒤에 소문자 l이나 대문자 L을 붙여야 합니다.
float f = 32.5f;           // 뒤에 소문자 f나 대문자 F를 붙여야 합니다. 
double d = 23.34;

System.out.printf("%b, %c, %d, %d, %f, %f\n", isFun, c, x, big, f, d);
```

### Casting
같은 종류이나 크기가 다른 변수들 간에 값의 대입을 이야기 함
* 기본적으로 값을 주는 변수와 값을 받는 변수의 형이 다르면 형변환이 일어남
    * 작은 크기에서 큰 크기로 넣기는 OK
        * 암묵적 형변환
    * 큰 크기에서 작은 크기로 넣을 경우, 큰 물컵의 물을 작은 물컵에 넣는 것과 같은 문제 발생
        * 큰 물컵의 물이 **작은 물컵의 양일 경우 OK**
        * 큰 물컵의 물이 **작은 물컵의 양보다 클 경우 NG(넘치게 됨)**
        * 컴파일은 위의 판단을 못하므로 **컴파일 에러**로 알림
    * 컴파일 에러를 피하기 위해 작은 크기라고 컴파일에 알림
        * 명시적 형변환
        * `int x = (int)y // y is long type`

### 산술 연산자
연산은 데이터를 처리해 결과를 산출한다는 의미
* 연산자
    * 연산에 사용하는 기호와 표시라는 의미로 연산자라 부름
    * `y = x - 2`에서 `=`, `+`의 기호를 지칭
* 피연산자
    * 연산자(기호)에 의한 처리에 사용되는 데이터
    * `y = x - 2`에서 `y`, `x`, `2`의 기호를 지칭
    * 연산자 이외의 모든 것
* 연산식
    * 연산자와 피연산자를 이용한 연산과정을 기술한 식
    * `y = x - 2`
* 산술 연산자
    * 단항 연산자
        * 피연산자가 하나만 필요
        * 부호 연산자(`+`, `-`)
            * 피연산자를 음수 혹은 양수로 지정
        * 증감 연산자(`++`, `--`)
            * 단독으로 사용시에 피연산자를 +-1씩 더해줌
                * 피연산자의 앞뒤에 달려도 결과는 같다
            * 다른 연산자와 사용시 주의!
                * 피연산자 **앞**에 증감이 있으면, **+-1씩 더한 후에 다른 연산자와 계산**
                * 피연산자 **뒤**에 증감이 있으면, **다른 연산자와 계산 후에 +-1씩 더함**
   * 이항 연산자
        * 피연산자가 두개가 필요
        * 사칙연산 및 나머지 구하는 연산자(`+, -, *, /, %`)
            * 나누기는 기본적으로 정수만 출력
                * type-casting으로 하나의 수를 실수로 만들면 실수 출력
                * `a / (double)b`
            * 나머지 출력시에 `%`를 printf에서 사용시 주의
                * `System.out.printf("i %% j = %d\n",i % j);`
        * 대입 연산자(`=`)
            * 오른쪽의 값을 왼쪽의 피연산자로 넣음
        * 복합대입 연산자(`+=, -=, *=, /=, %=`)
            * 대입 연산자와 사칙 연산자가 합쳐진 것
            * 대입 연산자의 왼쪽 피연산자가 사칙의 피연산자로도 사용되는 경우에 복합대입 연산자로 짧게 표현
                * `a = a + 1` => `a += 1`

```Java
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
```

### 비교 연산자
`같다, 다르다, 크다, 작다, 크거나 같다, 작거나 같다`라는 의미룰 표현하는 연산자
* 비교 연산자
    * `==, !=, >, <, >=, <=`
    * 시행결과는 boolean값인 true / false 중에 하나
    * 주의 `=`는 대입 연산자

```Java
public class ComparableOperators {
    public static void main(String[] args) {
        int i = 10;
        int j = 10;

        System.out.printf("i == j => %b\n", i == j);
        System.out.printf("i != j => %b\n", i != j);
        System.out.printf("i > j => %b\n", i > j);
        System.out.printf("i < j => %b\n", i < j);
        System.out.printf("i >= j => %b\n", i >= j);
        System.out.printf("i <= j => %b\n", i <= j);
    }
}
```

* 난수 발생
    * `Math.random()`은 0 ~ 1 사이의 무작위 double형 반환
        * 반환값에 대해 적당한 수를 곱하고 필요한 실수로 변환
        * 실수를 정수로 형변환 하여 적당한 정수로 바꾸어 사용
    * 기본적으로 아래의 코드 사용
```
import java.lang.Math;

// 클래스 안에서
int a = (int)(Math.random()*10);
System.out.println(Math.random());
System.out.println(Math.random()*10); 
System.out.println((int)Math.random()*10);
```

### 연산자 우선순위
* 왼쪽에서 오른쪽으로 갈수록 우선순위가 낮음
* 위에서 아래로 내려갈수 록 우선순위가 낮음
    * 괄호가 최상위이나, 괄호가 없을 경우는 우선선위에 따라 계산됨
    * 바른 계산 순서를 위해서 **반드시** 괄호`(..)`로 우선순위를 지정하는 것이 필요

|----|----|----|
|0|최우선 연산자|. [] ()|
|1|단항 연산자|++ -- ! ~ +/- : 부정, bit 변환 > 부호 > 증감|
|2|산술 연산자|* / % + -|
|3|시프트 연산자|>> << >>>|
|4|비교 연산자|> < >= <= == !=|
|5|비트 연산자|& | ^ ~|
|6|논리 연산자|&& || 5|
|7|삼항 연산자|조건식 ?|
|8|대입 연산자|= *= /= %= += -=|

```Java
public class OrderOfOperators {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        int c = 15;

        System.out.println("a - b * c => " + ( a - b * c) );
        System.out.println("(a - b) * c => " + ( (a - b) * c) );
        System.out.println("a > 5 && b > 5 => " + (a > 5 && b > 5));    // false && true -> false
        System.out.println("a > 5 || b > 5 => " + (a > 5 || b > 5));    // false || true -> true

        /*
        System.out.println(++a - 5)의 연산 순서
        1 | ++a 수행 → 5 + 1 → a는 6
        2 | a - 5 수행 → 6 - 5 → 결과는 1
        3 | System.out.pinrlnt()에 2의 값(1)을 전달

        System.out.println(a++ - 5)의 연산 순서
        1 | a - 5 수행 → 5 - 5 → 결과는 0
        2 | System.out.pinrlnt()에 1의 값(0)을 전달
        3 | a++ 수행 → 5 + 1 → a는 6
        */
        a = 5;
        System.out.println("++a - 5 => " + (++a - 5));  // a = a + 1 -> a - 5 -> 1  Print : 1
        System.out.println(a);

        a = 5;
        System.out.println("a++ - 5 => " + (a++ - 5)); // a - 5 -> 0 -> a = a + 1   Print : 0
        System.out.println(a);
    }
}
```