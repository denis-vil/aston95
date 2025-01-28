package mediatorPattern;

public class User {
    private final String name;
    private final Mediator mediator;

    public User(String name, Mediator mediator) {
        this.name = name;
        this.mediator = mediator;
    }

    public void sendMessage(String message) {
        System.out.println(name + " отправил сообщение: " + message);
        mediator.sendMessage(message, this);
    }

    public void receiveMessage(String message) {
        System.out.println(name + " получил сообщение: " + message);
    }
}