# Java for Everyone
## Chapter 3-4 summary

### 실행방법의 종류
1. 위에서 아래로 순차적으로 지시를 실행
    * 가장 기본적인 실행방법
2. 특정 조건에 따라서 지시를 실행 하고 실행 하지 않음
    * 조건 실행
    * 조건문은 반드시 최종적으로 논리 연산이며, `true`이면 실행
    * 경우에 따라서 논리 연산이 `false`이면 무조건 실행되는 대체조건을 설정
    * `if - else if - else, switch - case - break - default`
3. 특정 조건에 따라서 지시를 반복
    * 반복 실행
    * 반복을 위한 조건문은 최종적으로 논리 연산이며, `true`이면 실행
    * `while, do - while, for`

### if 문
* 대표적인 조건실행
    1. | if 혼자 사용하는 방법
    2. | if-else를 사용하는 방법
    3. | if-else if-else를 사용하는 방법
* 실행문의 설정
    * 모든 `if, else, else if`에 대해서 같은 원리 적용
    * 블럭 실행문
        * `{ ... }`을 사용하여 조건이 ture / false이면 블럭 전체 실행
    * 한줄 실행문
        * `{ ... }`을 사용 없이 조건이 ture / false이면 직전의 지시만 실행
* `else if`로 조건의 다중 설정이 가능
    * 너무 많으면 실행 속도가 느려진다고 함..(잘 모르겠음..)
* `else`는 필수가 아님
    * 하지만, 모든 조건에 맞지 않는 **나머지 경우의 처리**에 사용

```Java
public class IfBlackAndLine {
    public static void main(String[] args) {
        int a = 50;
        int b = 60;

        // { } 안의 두 줄이 모두 출력 안됨
        if (a > b) {
            System.out.println("a > b");
            System.out.println("test1");
        }

        // if문 바로 아래의 지시만 출력 안됨. 
        // 왜?? { } 이 없어서 직전의 지시만 if문의 영향이 미침
        if ( a > b )
            System.out.println("a > b");
            System.out.println("test2");    // 이것만 출력
    }
}
```

### 논리 연산자
* boolean값을 가지는 두개의 피 연산자의 연산을 설명
    * 논리곱(`A && B`)
        * 두 값이 모두 true인 경우만 true
        * 나머지는 false
    * 논리합(`A || B`)
        * 두 값이 모두 false인 경우만 false
        * 나머지는 true
    * 논리 부정(`!A`)
    * 배타적 논리합(`A ^ B`)
        * 두 값이 다른 경우만 true
        * 두 값이 같으면 false

| A | B | 논리곱 | 논리합 | 논리 부정 | 배타적 논리합 |
|----|----|----|----|----|----|
|true|true|true|true|false|false|
|true|false|false|true|false|true|
|false|true|false|true|true|true|
|false|false|false|false|true|false|

* 언제 논리 연산자를 사용하는가?
    * 몇개의 조건의 동시에 비교하여 조건의 충족 여부를 판단해야 할 경우
        * 각 조건은 boolean값을 가지는 비교 연산자로 구성
        * 설정된 모드 조건의 조합을 논리 연산자로 연결
            * 모든 조건 만족이면 논리곱
            * 일부 조건 만족이면 논리합
            * 둘 중에 하나만 만족은 배타적 논리합
            * 논리 부정을 통해 위의 조건의 반대설정
        * 최종 boolean값으로 조건 실행 여부가 결정

```Java
public class LogicalOperators {
    public String IsScorePassed(int score) {
        // 2개 이상의 조건을 동시에 충족하는지 판단
        if ( score >= 70 && score <= 100 ) {
            return "Success!!";
        } else {
            return "Failed!!";
        }

    }
    public static void main(String[] args) {
        boolean b1 = true;
        boolean b2 = false;
        boolean b3 = true;

        System.out.printf("b1 : %b, b2 : %b, b3 : %b\n", b1, b2, b3);
        System.out.println("b1 && b2 => " + (b1 && b2));
        System.out.println("b1 && b3 => " + (b1 && b3));
        System.out.println("b1 || b2 => " + (b1 || b2));
        System.out.println("b1 || b3 => " + (b1 || b3));
        System.out.println("b2 || b2 => " + (b2 || b2));
        System.out.println("b1 ^ b2 => " + (b1 ^ b2));
        System.out.println("b1 ^ b3 => " + (b1 ^ b3));
        System.out.println("!b1 => " + (!b1));
        System.out.println("!b2 => " + (!b2));

        System.out.println(new LogicalOperators().IsScorePassed(88));
        System.out.println(new LogicalOperators().IsScorePassed(65));
    }
}

```

### 삼항 연산자
* if조건문 역할의 연산자
    * if문으로 만들기에 너무 간단한 구조의 경우에 주로 이용
    * `(조건) ? 조건_true의_값 : 조건_false의_값`
    * 조건에 의해서 값만 설정
        * `int b1 = (5 > 4) ? 50 : 40;`
        * b1에 50이 설정
    * 조건문에 논리 연산자를 사용하여 복합적인 조건도 설정 가능

```Java
public class TernaryOperator {
    public static void main(String[] args) {
        // 삼항 연산자
        int b1 = (5 < 4) ? 50 : 40;
        System.out.println(b1);

        // 삼항 연산자와 같은 if문
        int b3 = 0;
        if(5 > 4) {
            b3 = 50;
        }else {
            b3 = 40;
        }
    
        System.out.println(b3);
    }
}
```

### switch 문
* if문과 같이 조건에 따른 실행제어
    * if문보다 단순하지만, 갯수가 많은 조건 사용시에 편리
    * `else`와 같은 구분은 `default:`
    * 각 조건은 `case 조건:`으로 설정
        * `{...}`로 묶을 필요 없음
        * 그 대신에 반드시 `break;`로 실행문들의 마지막을 표시
        * `break;`가 없으면 다른 `case 조건:`의 실행문 실행됨
            * 맞는 조건의 실행문 부터 `break;`문을 만나기 까지 모든 실행문이 실행됨
* switch문의 조건식
    * `==`의 경우는 그냥 리터럴을 직접 지정
        * 수치(int, long, double, float) 혹은 문자열(String)을 직접 지정
        * 조건이 같은 실행문의 경우에는 조건을 `case a, b, c:`로 나열
        * 조건식이 if문과 틀린 점
    * 그외의 비교 연산자 지정해서 사용

```Java
import java.util.Calendar;
public class SwitchExam {

    public static void main(String[] args) {
        int value = 2;

        switch(value) {
            case 1:
            System.out.println("1");
            break;
            case 2:
            System.out.println("2");
            break;
            case 3:
            System.out.println("3");
            break;
            default:
            System.out.println("Other number.");
        }

        int month = Calendar.getInstance().get(Calendar.MONTH) + 1;
        String season = "";

        switch(month) {
            case 12, 1, 2:
            season = "Winter";
            break;
            case 3, 4, 5:
            season = "Spring";
            break;
            case 6, 7, 8:
            season = "Summer";
            break;
            case 9, 10, 11:
            season = "Autumn";
            break;
        }

        System.out.println("Now is "+ month + " and " + season + " season.");
    }
}
```

### while 문
* 조건문에 따른 실행문의 반복
* 반목 횟수가 정해져 있지 않은 경우에 유효
    * 경우에 따라서 실행이 안 되는 경우도 있음
    * 조건문의 변화를 실행문 안에 반드시 넣어야 함
        * 조건문의 변화가 없다면 무한 루프
* 조건문은 비교 연산자와 논리 연산자를 복합적으로 사용가능

```Java
public class WhileStatement {
    public static void main(String[] args) {
        int i = 0;
        
        while ( i < 10 ) {
            System.out.println(i++);
        }

        i = 0;
        int total = 0;
        while ( i <= 100 ) {
            total += i++;
        }
        System.out.println(total);

        i = 0;
        while ( i < 10 ) {
            if ( i % 2 == 0 ) {
                System.out.println(i);
            }
            i++;
        }
    }
}
```

### do while 문
* 실행문의 반복*
* 반목 횟수가 정해져 있지 않으나 반드시 1번은 실행해야 할 경우에 사용
    * 조건문의 변화를 실행문 안에 반드시 넣어야 함
        * 조건문의 변화가 없다면 무한 루프
    * 1회는 반드시 실행 하는 것 이외에는 while문과 같다
* 조건문은 비교 연산자와 논리 연산자를 복합적으로 사용

```Java
import java.util.Scanner;

public class DoWhileStatement {
    public static void main(String[] args) {
        int value = 0;
        Scanner scan = new Scanner(System.in);
        
        do {
            value = scan.nextInt();
            System.out.println("Input value:"+ value);
        }while(value != 10);

        System.out.println("Finsihed iterate statement.");
    }
}
```

## 객체지향
* 객체는 프로그램에서 사용되는 부품
    * 대량 생산품과 같아서(같은 것이 너무 많아서) 이름표를 붙여서 기억하기 편하게 만듬
    * 이름표를 프로그래밍 언어의 용어로 **변수**라고 말함
    * 이름표는 다른 생산품에 붙일수 있음
        * 이름표가 떨어진 객체는 버려지는 것으로 간주되어 폐기됨
* 자바에서 객체의 종류
    * primitive type
        * 이미 정의되어 있으므로 간단하게 **대입연산자**만으로 
        * `int a = 10;`
    * object type
        * 반드시 **new** 연산자를 사용
        * `cooker b = new cooker();`

### for 문
* 실행문의 반복
* 정해진 반복 횟수만 실행문을 반복
* 반복 횟수를 실행문 안에서 조작할 경우 의도치 않은 실행 결과가 발생
    * 무한 반복
    * 1회만 실행
    * 가능하면 반복 횟수의 재설정은 실행문안에서 하지 않는 것을 추천
* for문의 실행
    * `for(변수 초기화; 조건식; 증감식) { 실행할 문장들; }`
    * 반복횟수의 시작값을 설정
    * 현재 반복횟수가 조건에 맞는지 비교
        * 조건에 맞으면 실행문을 실행
        * 조건에 안 맞으면 실행 종료
    * 반복횟수를 설정한 값으로 변경
        * 반복횟수의 증가/감소로 설정 가능

```Java
public class ForStatement {
    public static void main(String[] args) {
        int total = 0;
        for(int idx = 0; idx <= 100; idx++) {
            if (idx % 2 == 0) {
                total += idx;
            }

            // Using below instead of above code
            // if ( idx % 2 != 0 ) {
            //     continue;
            // }
            // total += idx;

            if ( total >= 50 ) {
                break;
            }
        }
        System.out.println("Total :"+ total);
    }
}
```

## break / continue
* `while(){}`, `do{}while();`, `for(){}` 에 모두 사용가능
* `break` 문
    * 현재 반복문을 중지하고 괄호 바깥의 실행문을 실행
    * 반복문 안에서 특정 변수의 값에 대한 변화에 따라 도중에 중지 시킬 경우에 사용
    * 반복문의 괄호 다음부터 실행
    * 반복문이 다중이면 빠져나온 반복문의 상위 반복문으로 이동
* `continue` 문
    * 현재 반복문의 조건식으로 즉시 이동하여 조건문을 체크
    * 즉시 이동하기에 continue문 이후의 실행문을 실행되지 못함
    * 조건식 변수의 변화전에 사용되면 무한 루프가 될 위험성이 있음
        * 가능하면 조건식 변수의 변화후에 사용하는 것을 추천
