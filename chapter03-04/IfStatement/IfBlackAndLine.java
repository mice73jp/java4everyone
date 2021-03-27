public class IfBlackAndLine {
    public static void main(String[] args) {
        int a = 50;
        int b = 60;

        if (a > b) {
            System.out.println("a > b");
            System.out.println("test1");
        }
        if ( a > b )
            System.out.println("a > b");
            System.out.println("test2");

        if ( a == b ) {
            System.out.println("a == b");
        } else {
            System.out.println("a != b");
        }

        if ( a == b ) {
            System.out.println("a == b");
        } else if ( a > b ) {
            System.out.println("a > b");
        } else if ( a < b ) {
            System.out.println("a < b");
        }

    }
}
