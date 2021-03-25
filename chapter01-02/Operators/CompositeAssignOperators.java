public class CompositeAssignOperators {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;

        System.out.printf("a += b => %d\n", a += b);
        System.out.printf("a -= b => %d\n", a -= b);
        System.out.printf("a *= b => %d\n", a *= b);
        System.out.printf("a /= b => %d\n", a /= b);
        System.out.printf("a %%= b => %d\n", a %= b);
    }
}
