import java.util.List;

public interface IHolidays {
    List<String> getDates();
    List<String> getTitles();
    String getHolidayTitle(String dates);
}
