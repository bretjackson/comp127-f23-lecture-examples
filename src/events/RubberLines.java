package events;

import java.awt.Color;

import edu.macalester.graphics.CanvasWindow;
import edu.macalester.graphics.Line;
import edu.macalester.graphics.Point;

public class RubberLines {
    private Line line;
    private CanvasWindow window;

    public RubberLines(){
        window = new CanvasWindow("rubber lines", 800, 600);
        line = new Line(0, 0, 0, 0);
        line.setStrokeWidth(2);
        line.setStrokeColor(Color.MAGENTA);
        window.add(line);

        // Set up event handling
        window.onMouseDown(event -> {
            Point pos = event.getPosition();
            line.setStartPosition(pos.getX(), pos.getY());
            line.setEndPosition(pos.getX(), pos.getY());
        });

        window.onDrag(event -> {
            Point pos = event.getPosition();
            line.setEndPosition(pos.getX(), pos.getY());
        });
    }

    public static void main(String[] args) {
        RubberLines app = new RubberLines();
    }

    
}
