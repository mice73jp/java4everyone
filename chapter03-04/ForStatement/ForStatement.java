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
