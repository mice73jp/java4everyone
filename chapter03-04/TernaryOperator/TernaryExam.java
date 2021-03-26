import java.util.Calendar;

public class TernaryExam {
    public static void main(String[] args) {
        int hour = Calendar.getInstance().get(Calendar.HOUR_OF_DAY);

        String ampm;
        ampm = (hour < 12) ? "AM" : "PM";
        System.out.println("Now " + hour + " hour " + ampm);
    }    
}
