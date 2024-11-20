package observer;

import java.util.ArrayList;
import java.util.List;

public class Channel implements Subject {

    private List<Observer> subscriberList = new ArrayList<>();
    private String title;

    @Override
    public void subscribe(Observer subscriber) {
        subscriberList.add(subscriber);
    }

    @Override
    public void unsubscribe(Observer subscriber) {
        subscriberList.remove(subscriber);
    }

    @Override
    public void notifySubscriber() {
        for (Observer subscriber : subscriberList) {
            subscriber.update();
        }
    }

    @Override
    public void upload(String title) {
        this.title = title;
        notifySubscriber();
    }
}
