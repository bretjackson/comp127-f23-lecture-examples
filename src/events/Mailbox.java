package events;

import java.awt.Color;

import edu.macalester.graphics.GraphicsGroup;
import edu.macalester.graphics.Rectangle;

public class Mailbox extends GraphicsGroup {
    public Mailbox() {
        super(0,0);
        Rectangle box = new Rectangle(0, 40, 100, 35);
        Rectangle flag = new Rectangle(60, 0, 10, 50);
        Rectangle stand = new Rectangle(45, 75, 10, 100);
        box.setFilled(true);
        box.setFillColor(Color.BLUE);
        flag.setFilled(true);
        flag.setFillColor(Color.RED);
        add(box);
        add(flag);
        add(stand);
    }
}
