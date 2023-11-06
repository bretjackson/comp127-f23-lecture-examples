package events;

import java.util.Random;

import edu.macalester.graphics.CanvasWindow;
import edu.macalester.graphics.GraphicsObject;

public class MailboxGame {
    private CanvasWindow window;
    private Random rgen;
    private double animationX = 0;
    private double animationY = 0;
    private int animationIteration = 0;
    private GraphicsObject animationTarget = null;



    public MailboxGame() {
        window = new CanvasWindow("Mailbox game", 800,800);
        rgen = new Random();
        initMailboxes();

        window.onClick(event -> {
            animationTarget = window.getElementAt(event.getPosition());
            if (animationTarget != null) {
                animationX = rgen.nextInt(10)-5;
                animationY = rgen.nextInt(10)-5;
                animationIteration = 0;
            }
        });

        window.animate(event -> {
            if (animationTarget != null && animationIteration < 10){
                animationTarget.moveBy(animationX, animationY);
                animationIteration++;
            }
        });
    }

    public void initMailboxes() {
        for (int i = 0; i < 3; i++) {
            Mailbox mailbox = new Mailbox();
            mailbox.setPosition(i * 200+50, i * 200+50);
            window.add(mailbox);
        }
    }

    public static void main(String[] args){
        MailboxGame game = new MailboxGame();
    }
}
