package pattern.creational.model;

// Паттерн проектирования порождающий: Singleton.
public class Singleton {
    private static volatile Singleton instance;
    private String info = "Info class: ";

    private Singleton() {
        System.out.println("Создан Singleton: " + this);
    }

    public static Singleton getInstance() {
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) instance = new Singleton();
            }
        }
        return instance;
    }

    public String getInfo() {
        return info + this;
    }

    public void setInfo(String info) {
        this.info = info;
    }
}
