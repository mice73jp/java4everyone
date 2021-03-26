public class LogicalOperatorsExam {
    public boolean isAgeDiscountable(int age) {
        boolean isDiscount = false;
        if ( age <= 19 ^ age >= 60 ) {
            isDiscount = true;
        } 

        return isDiscount;
    }

    public boolean isAgeTwenty(int age) {
        boolean isTwenty = false;
        if ( age < 30 && age > 19 ) {   // 
            isTwenty = true;
        }

        return isTwenty;
    }

    public static void main(String[] args) {
        LogicalOperatorsExam exam = new LogicalOperatorsExam();
        System.out.println(exam.isAgeDiscountable(15));
        System.out.println(exam.isAgeDiscountable(27));
        System.out.println(exam.isAgeDiscountable(67));

        System.out.println(exam.isAgeTwenty(15));
        System.out.println(exam.isAgeTwenty(27));
        System.out.println(exam.isAgeTwenty(67));
    }
}
