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