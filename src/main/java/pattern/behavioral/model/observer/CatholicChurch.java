package pattern.behavioral.model.observer;

import java.util.ArrayList;
import java.util.List;

public class CatholicChurch implements Observable {
    private List<Observer> observers;
    private String churchNews;

    public CatholicChurch() {
        observers = new ArrayList<>();
    }

    public void setNewsChurch(String news) {
        this.churchNews = news;
        notifyParishioners();
    }


    @Override
    public void removeParishioner(Observer o) {
        observers.remove(o);
    }

    @Override
    public void registerParishioner(Observer o) {
        observers.add(o);
    }

    @Override
    public void notifyParishioners() {
        for (Observer o : observers)
            o.update(churchNews);
    }
}
