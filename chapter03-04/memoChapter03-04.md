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

### while 문

### do while 문

### for 문
