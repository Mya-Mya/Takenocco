package app;

import home.HomeScreen;
import scene.Screen;

import javax.swing.*;
import java.awt.*;

public class Service extends JFrame {
    private static Service inst;

    public static Service inst() {
        if (inst == null) {
            inst = new Service();
        }
        return inst;
    }

    public static void main(String[] args) {
        inst = new Service();
    }

    private final Dimension wndSize = new Dimension(900, 500);
    private Dimension cntSize;
    private final int BACKG_LAYER = 0;
    private final int CNT_LAYER = 100;
    private final int EFFECT_LAYER = 200;
    private final JLayeredPane layeredPane = new JLayeredPane();

    public Service() {
        super("タケノッコDEMO");
        setPreferredSize(wndSize);

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        pack();
        cntSize = getRootPane().getSize();
        layeredPane.setSize(cntSize);
        setLayeredPane(layeredPane);
        changeScene(new HomeScreen(null));
    }

    public void changeScene(Screen next) {
        for (Component c : layeredPane.getComponentsInLayer(CNT_LAYER)) {
            layeredPane.remove(c);
        }
        next.setSize(cntSize);
        layeredPane.add(next);
        layeredPane.setLayer(next, CNT_LAYER);
    }
}
