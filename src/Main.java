public class Main {
    public static void main(String[] args) {
        Holidays holidays = new Holidays();
        String holiday = holidays.getHolidayTitle("01/05/2023");
        System.out.println(holiday);

//        print every holiday title
//        for(int i = 0; i < holidays.getTitles().size(); i++) {
//            System.out.println(holidays.getTitles().get(i));
//        }
    }
}