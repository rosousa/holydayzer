import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class Holidays implements IHolidays {
    private final List<String> dates = new ArrayList<>(Arrays.asList(
            "01/01/2023",
            "21/02/2023",
            "17/04/2023",
            "21/04/2023",
            "01/05/2023",
            "08/06/2023",
            "07/09/2023",
            "12/10/2023",
            "02/11/2023",
            "15/11/2023",
            "25/12/2023"
    ));

    private final List<String> titles = new ArrayList<>(Arrays.asList(
            "Confraternização mundial",
            "Carnaval",
            "Páscoa",
            "Tiradentes",
            "Dia do trabalho",
            "Corpus Christi",
            "Independência do Brasil",
            "Nossa Senhora Aparecida",
            "Finados",
            "Proclamação da República",
            "Natal"
    ));

    public List<String> getDates() {
        return this.dates;
    }

    public List<String> getTitles() {
        return this.titles;
    }

    public String getHolidayTitle(String date) {
        String message = "this holiday doesn't exist";

        for(int i = 0; i < this.dates.size(); i++) {
            if(Objects.equals(this.dates.get(i), date)) {
                return this.titles.get(i);
            }
        }
        return message;
    }
}
