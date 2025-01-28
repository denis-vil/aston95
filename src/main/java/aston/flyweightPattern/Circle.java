package flyweightPattern;

import java.util.HashMap;
import java.util.Map;

public class Circle {
    private String color;

    public Circle(String color) {
        this.color = color;
    }

    public void draw(int x, int y, int radius) {
        System.out.println("Рисуем круг [Color: " + color + ", x, " + x + ", y, " + y + ", радиус, " + radius + "]");
    }
}

class CircleFactory {
    private final Map<String, Circle> circlePool = new HashMap<>();

    public Circle getCircle(String color) {
        circlePool.putIfAbsent(color, new Circle(color));
        return circlePool.get(color);
    }
}