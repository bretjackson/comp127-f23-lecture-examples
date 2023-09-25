import java.awt.Color;

import edu.macalester.graphics.CanvasWindow;
import edu.macalester.graphics.Ellipse;

public class GraphicsDemo {
    public static void main(String[] args) {
        CanvasWindow canvas = new CanvasWindow("My graphics window", 500, 500);
        Ellipse circle = new Ellipse(40, 40, 50, 50);
        canvas.add(circle);
        canvas.draw();
        canvas.pause(1000);
        circle.setPosition(100, 100);
        Ellipse circle2 = new Ellipse(40, 40, 50, 50);
        canvas.add(circle2);
        circle2.setFilled(true);
        circle2.setFillColor(Color.ORANGE);
    }
}
