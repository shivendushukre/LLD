package observer;

public class Youtube {
    public static void main(String[] args) {
        Subject channel = new Channel();

        Observer sub1 = new Subscriber("Akshay");
        Observer sub2 = new Subscriber("Aki");

        channel.subscribe(sub1);
        channel.subscribe(sub2);

        channel.unsubscribe(sub2);

        sub1.subscribeChannel(channel);
        sub2.subscribeChannel(channel);

        channel.upload("Learn programming in Java");


    }
}