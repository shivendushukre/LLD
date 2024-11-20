package observer;

public class Subscriber implements Observer {

    private String name;
    private Subject channel = new Channel();

    public Subscriber(String name) {
        this.name = name;
    }

    @Override
    public void update() {
        System.out.println("Hey " + name + ", video uploaded");
    }

    @Override
    public void subscribeChannel(Subject ch) {
        channel = ch;
    }
}
