import java.applet.*;
import java.awt.*;     
/*
<applet code = circleC.class height=300 width=300 >
</applet>
*/
public class circleC extends Applet implements Runnable {
    Shape circle;
    Color c;
    public void init() {
        circle c= new circle(90,100, 90, 90);
        repaint();
        Thread th = new Thread(this);
        th.start();
    }
    public void run() {
        try {
            while(true) {
                System.out.println(1);
                c = Color.black;
                repaint();
                Thread.sleep(1000);
                System.out.println(2);
                c = Color.gray;
                repaint();
                Thread.sleep(1000); 
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    public void update(Graphics g) {
        paint(g);
    }
    public void paint(Graphics g) {
        Graphics d = (Graphics) g;
        d.setColor(c);
        d.fill(c);
    }
}