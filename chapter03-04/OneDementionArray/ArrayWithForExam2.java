public class ArrayWithForExam2 {

    public int sum(int[] array) {
        int sum = 0;
        for(int idx = 0; idx < array.length;idx++) {
            sum += array[idx];
        }

        return sum;
    }

    // 아래는 실행을 위한 코드입니다. 수정하지 마세요.
    public static void main(String[] args) {
        int[]testArr = new int[4];
        String str = "";
        int rightResult = 0;
        for(int i=0; i<4; i++) {
            testArr[i] = (int)(Math.random()*100);
            rightResult += testArr[i];
            str+=(testArr[i]+",");
        }
        str=str.substring(0,str.length()-1);

        ArrayWithForExam2 exam = new ArrayWithForExam2();
        int Answer = exam.sum(testArr);
        
        if (Answer==rightResult) {
            System.out.println("정답입니다.");
        }
        else{
            System.out.println( str+"를 더한 sum의 값이 틀립니다.");
        }
    }
}
