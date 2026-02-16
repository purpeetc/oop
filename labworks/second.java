package labworks;

public class second {

    public enum Days {
        MONDAY("Monday"),
        TUESDAY("Tuesday"),
        WEDNESDAY("Wednesday"),
        THURSDAY("Thursday"),
        FRIDAY("Friday");

        private final String label;

        Days(String label) {
            this.label = label;
        }

        public String label() {
            return label;
        }
    }

    // static + final: 
    public static final String schoolName = "KBTU";

    // static non-final: 
    public static int lessonCnt = 0;

    // final non-static: 
    private final int durationMinutes;

    private Days day;
    private String room; 

    // initialization block 
    {
        lessonCnt++;
    }

   //
    public second(Days day, int durationMinutes) {
        this(day, durationMinutes, "TBA");
    }

    // основной конструктор
    public second(Days day, int durationMinutes, String room) {
        this.day = day;                     // this usage #2
        this.durationMinutes = durationMinutes;
        this.room = room;
    }

    // перегрузка методов
    public void printInfo() {
        System.out.println("Lesson on " + day.label());
    }

    public void printInfo(boolean showDetails) {
        if (!showDetails) {
            printInfo();
            return;
        }
        System.out.println("Lesson on " + day.label()
                + " | duration: " + durationMinutes + " min"
                + " | room: " + room);
    }

    // read-only доступ к final полю
    public int getDuration() {
        return durationMinutes;
    }

    public Days getDay() {
        return day;
    }

    public static void main(String[] args) {
        second a = new second(Days.MONDAY, 90, "203");
        second b = new second(Days.WEDNESDAY, 120);

        a.printInfo(true);
        b.printInfo();

        System.out.println("School: " + schoolName);
        System.out.println("Total lessons created: " + lessonCnt);
    }
}
