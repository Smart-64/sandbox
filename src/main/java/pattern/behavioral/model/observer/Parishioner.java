package pattern.behavioral.model.observer;

public class Parishioner implements Observer {
    private final String name;

    public Parishioner(String name, Observable o) {
        this.name = name;
        o.registerParishioner(this);
    }

    @Override
    public void update(String churchNews) {
        System.out.println(name + "узнал новость: " + churchNews);
    }
}
