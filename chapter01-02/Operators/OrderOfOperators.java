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
