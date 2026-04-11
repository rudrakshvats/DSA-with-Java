import java.util.Calendar;

public class FindTheDay {

    public static void main(String[] args) {
        findDay(17, 3, 2017);
    }

    static String findDay(int Day, int Month, int Year) {
        // Code Here
        Calendar calendar = Calendar.getInstance();
        calendar.set(Year, Month - 1, Day);
        System.out.print("On " + Day + "/" + Month + "/" + Year + " it was ");
        int dayNum = calendar.get(Calendar.DAY_OF_WEEK);
        switch (dayNum - 1) {
            case 0:
                System.out.println("SUNDAY");
                return "SUNDAY";
            case 1:
                System.out.println("MONDAY");
                return "MONDAY";
            case 2:
                System.out.println("TUESDAY");
                return "TUESDAY";
            case 3:
                System.out.println("WEDNESDAY");
                return "WEDNESDAY";
            case 4:
                System.out.println("THURSDAY");
                return "THURSDAY";
            case 5:
                System.out.println("FRIDAY");
                return "FRIDAY";
            case 6:
                System.out.println("SATURDAY");
                return "SATURDAY";
            default: return "";
        }
    }
}
