public class LogicalOperators {
    public String IsScorePassed(int score) {
        if ( score >= 70 && score <= 100 ) {
            return "Success!!";
        } else {
            return "Failed!!";
        }
    }

    public String IsScoreOutOfAverage(int score) {
        if ( score >= 70 ^ score <= 100 ) {
            return "Out!!";
        } else {
            return "In!!";
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
        System.out.println(new LogicalOperators().IsScoreOutOfAverage(88));
        System.out.println(new LogicalOperators().IsScoreOutOfAverage(65));
        System.out.println(new LogicalOperators().IsScoreOutOfAverage(101));
    }
}
