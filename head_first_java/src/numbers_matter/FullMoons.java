package numbers_matter;

import java.util.Calendar;
import java.util.TimeZone;
import static java.lang.System.out;

public class FullMoons {
    private static final long DAY_MS = 24L * 60 * 60 * 1000;

    public static void main(String[] args){
        Calendar c = Calendar.getInstance();
        c.setTimeZone(TimeZone.getTimeZone("UTC"));
        c.set(2004, Calendar.JANUARY, 7, 15, 40);
        long t = c.getTimeInMillis();
        for (int i = 0; i < 60; i++) {
            t += (long) (DAY_MS * 29.52);
            c.setTimeInMillis(t);
            out.println(String.format("full moon on %tc", c));
        }
    }
}
