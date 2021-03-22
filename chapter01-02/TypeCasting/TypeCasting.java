public class TypeCasting {
    public static void main(String[] args) {
        int x = 50000;
        long y = x;         // OK
        
        long x2 = 5;
        //int y2 = x2;        // NG : 컴파일 에러 
        int y2 = (int)x2;
        System.out.println(y2);
    }
}
