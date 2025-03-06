package pattern.behavioral.model.observer;

public interface Observable {
    void removeParishioner(Observer observer);
    void registerParishioner(Observer observer);
    void notifyParishioners();
}
