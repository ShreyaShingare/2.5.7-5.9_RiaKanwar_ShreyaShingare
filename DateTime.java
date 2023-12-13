import java.util.Calendar;
public class DateTime{
  public static String getTime()
  {
    Caleandar cal = Calendar.getInstance();
    String dateTimeStr = cal.getTime().toString();
    return dateTimeStr;
  }
}
