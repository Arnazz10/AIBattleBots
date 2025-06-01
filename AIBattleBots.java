import java.awt.*;
import java.awt.event.*;
import java.util.Random;
import javax.swing.*;

public class AIBattleBots extends JPanel implements ActionListener {
    Timer timer;
    Bot bot1 = new Bot(50, 50, Color.RED);
    Bot bot2 = new Bot(300, 300, Color.BLUE);
    Random rand = new Random();

    public AIBattleBots() {
        JFrame frame = new JFrame("AI Battle Bots");
        frame.setSize(400, 400);
        frame.add(this);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        timer = new Timer(200, this); // update every 200ms
        timer.start();
    }

    static class Bot {
        int x, y, hp = 10;
        Color color;

        Bot(int x, int y, Color color) {
            this.x = x; this.y = y; this.color = color;
        }

        void moveRandom() {
            int dir = (int)(Math.random() * 4);
            switch (dir) {
                case 0: x += 10; break; // right
                case 1: x -= 10; break; // left
                case 2: y += 10; break; // down
                case 3: y -= 10; break; // up
            }
            x = Math.max(0, Math.min(380, x));
            y = Math.max(0, Math.min(360, y));
        }

        void attack(Bot other) {
            if (Math.abs(x - other.x) <= 20 && Math.abs(y - other.y) <= 20) {
                other.hp--;
            }
        }

        boolean isAlive() {
            return hp > 0;
        }
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        setBackground(Color.BLACK);
        drawBot(g, bot1);
        drawBot(g, bot2);
        g.setColor(Color.WHITE);
        g.drawString("Bot1 HP: " + bot1.hp, 10, 15);
        g.drawString("Bot2 HP: " + bot2.hp, 300, 15);
    }

    void drawBot(Graphics g, Bot bot) {
        g.setColor(bot.color);
        g.fillOval(bot.x, bot.y, 20, 20);
    }

    public void actionPerformed(ActionEvent e) {
        if (bot1.isAlive() && bot2.isAlive()) {
            bot1.moveRandom();
            bot2.moveRandom();
            bot1.attack(bot2);
            bot2.attack(bot1);
        } else {
            timer.stop();
            String winner = bot1.hp > bot2.hp ? "Bot 1 Wins!" : "Bot 2 Wins!";
            JOptionPane.showMessageDialog(this, winner);
            System.exit(0);
        }
        repaint();
    }

    public static void main(String[] args) {
        new AIBattleBots();
    }
}
