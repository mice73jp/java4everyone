public class TernaryOperator {
    public static void main(String[] args) {
        int b1 = (5 < 4) ? 50 : 40;

        System.out.println(b1);

        int b3 = 0;
        if(5 > 4) {
            b3 = 50;
        }else {
            b3 = 40;
        }
    
        System.out.println(b3);
    }
}
