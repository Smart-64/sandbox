package pattern.structural.model.proxy;

public class DisplayTimetable {
    private final TimetableTrains timetableTrains;

    public DisplayTimetable(TimetableTrains timetableTrains) {
        this.timetableTrains = timetableTrains;

    }

    public void printTimeTable() {
        System.out.println(timetableTrains.getTimetable());
    }
}
