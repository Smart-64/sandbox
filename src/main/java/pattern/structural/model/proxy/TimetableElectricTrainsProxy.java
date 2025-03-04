package pattern.structural.model.proxy;

public class TimetableElectricTrainsProxy implements TimetableTrains {
    private String cashTimetable;
    private final TimetableTrains timetableTrains;

    public TimetableElectricTrainsProxy(TimetableTrains timetableTrains) {
        this.timetableTrains = timetableTrains;
        this.cashTimetable = timetableTrains.getTimetable();
    }

    @Override
    public String getTimetable() {
        if (cashTimetable == null) {
            cashTimetable = timetableTrains.getTimetable();
        }
        return cashTimetable;
    }

    @Override
    public String getTrainTime(int id) {
        return timetableTrains.getTrainTime(id);
    }

    public void setTimetable(String timetable) {
        this.cashTimetable = cashTimetable;
    }
}
