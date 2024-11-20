package observer;

public interface Subject {
    void subscribe(Observer subscriber);

    void unsubscribe(Observer subscriber);

    void notifySubscriber();

    void upload(String title);
}
