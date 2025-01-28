package mediatorPattern;

public class SimpleMediatorExample {
    public static void main(String[] args) {
        Room chatRoom = new Room();

        User alice = new User("Ivan", chatRoom);
        User bob = new User("Kirill", chatRoom);
        User charlie = new User("Stepa", chatRoom);

        chatRoom.addUser(alice);
        chatRoom.addUser(bob);
        chatRoom.addUser(charlie);

        alice.sendMessage("Привет, всем");
        bob.sendMessage("Привет");
    }
}