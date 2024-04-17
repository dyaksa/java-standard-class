import java.util.Calendar;
import java.util.Date;

public class DateApp {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(date);

        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.YEAR, 2023);
        calendar.set(Calendar.MONTH, Calendar.FEBRUARY);
        calendar.set(Calendar.HOUR_OF_DAY, 10);

//        calendar.add(Calendar.HOUR, 10);

        Date result = calendar.getTime();
        System.out.println(result);
    }
}
