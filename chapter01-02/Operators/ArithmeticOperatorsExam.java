public class ArithmeticOperatorsExam {
    public void calculate() {
        int a = 7;
        int b = 3;

        int c = a + b;
        int d = a - b;
        int e = a * b;
        int f = a % b;

        System.out.println("a와 b의 합 " + c);
        System.out.println("a와 b의 차 " + d);
        System.out.println("a와 b의 곱 " + e);
        System.out.println("a를 b로 나눈 나머지 " + f);
    }
    public static void main(String[] args) {
        new ArthmiticOperatorsExam().calculate();
    }
}
