import java.lang.Math;

public class ComparableOperatorsExam {
    public void calcuate(int a, int b) {
        boolean c = a > b;
        boolean d = a == b;
        boolean e = a != b;

        System.out.println(a+"은(는) "+b+"보다 큽니까? "+ c);
        System.out.println(a+"은(는) "+b+"와(과) 같습니까? "+ d);
        System.out.println(a+"은(는) "+b+"와(과) 다릅니까? "+ e);
    }

    public static void main(String[] args) {
        int a = (int)(Math.random()*10);
        int b = (int)(Math.random()*10);
        new ComparableOperatorsExam().calcuate(a, b);
    }
}
