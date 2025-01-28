package flyweightPattern;

public class FlyweightExample {
    public static void main(String[] args) {
        CircleFactory factory = new CircleFactory();
        Circle redCircle1 = factory.getCircle("Red");
        redCircle1.draw(10, 20, 15);
        Circle redCircle2 = factory.getCircle("Red");
        redCircle2.draw(30, 40, 20);
        Circle blueCircle = factory.getCircle("Blue");
        blueCircle.draw(50, 60, 25);
        System.out.println("Объекты равны? " + (redCircle1 == redCircle2));
    }
}