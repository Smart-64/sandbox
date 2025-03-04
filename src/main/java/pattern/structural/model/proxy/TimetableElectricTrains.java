package pattern.structural.model.proxy;

public class TimetableElectricTrains implements TimetableTrains {
    public TimetableElectricTrains() {
    }

    @Override
    public String getTimetable() {
        return "Some timetable for trains.";
    }

    @Override
    public String getTrainTime(int id) {
        return "Train with id: " + id;
    }
}
