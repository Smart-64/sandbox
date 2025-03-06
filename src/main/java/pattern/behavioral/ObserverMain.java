package pattern.behavioral;

import pattern.behavioral.model.observer.CatholicChurch;
import pattern.behavioral.model.observer.Parishioner;


public class ObserverMain {
    public static void main(String[] args) {
        CatholicChurch catholicChurch = new CatholicChurch();

        new Parishioner("Мартин Лютер", catholicChurch);
        new Parishioner("Жан Кальвин", catholicChurch);

        catholicChurch.setNewsChurch("Инквизиция была ошибкой... месса Mea Culpa 12 марта 2000 года");
    }
}
