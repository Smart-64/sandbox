package pattern.structural;

import pattern.structural.model.proxy.DisplayTimetable;
import pattern.structural.model.proxy.TimetableElectricTrains;
import pattern.structural.model.proxy.TimetableElectricTrainsProxy;
import pattern.structural.model.proxy.TimetableTrains;

/**
 * Паттерн проектирования структрный: Proxy.
 */
public class ProxyMain {
    public static void main(String[] args) {
        TimetableTrains timetableTrains = new TimetableElectricTrains();
        TimetableElectricTrainsProxy proxy = new TimetableElectricTrainsProxy(timetableTrains);

        DisplayTimetable displayTimeTable = new DisplayTimetable(proxy);
        displayTimeTable.printTimeTable();
    }
}
