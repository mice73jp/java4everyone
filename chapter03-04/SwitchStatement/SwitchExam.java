import java.util.Calendar;
public class SwitchExam {

    public static void main(String[] args) {
        int value = 2;

        switch(value) {
            case 1:
            System.out.println("1");
            break;
            case 2:
            System.out.println("2");
            break;
            case 3:
            System.out.println("3");
            break;
            default:
            System.out.println("Other number.");
        }

        int month = Calendar.getInstance().get(Calendar.MONTH) + 1;
        String season = "";

        switch(month) {
            case 12, 1, 2:
            season = "Winter";
            break;
            case 3, 4, 5:
            season = "Spring";
            break;
            case 6, 7, 8:
            season = "Summer";
            break;
            case 9, 10, 11:
            season = "Autumn";
            break;
        }

        System.out.println("Now is "+ month + " and " + season + " season.");
    }
}
