package game.chara;

import app.DataTransfer;
import app.Design;
import scene.ModelListener;
import scene.Screen;

import javax.swing.*;
import java.awt.*;

public class CharaScreen extends JPanel
implements ModelListener {
    CharaModel m;
    public CharaScreen(CharaModel m,Dimension cntSize) {
        this.m=m;
        m.addModelLister(this);
    }


    @Override
    public void modelChanged() {
        repaint();
    }

    @Override
    public void paintComponent(Graphics g){
        g.setColor(Color.BLACK);
        g.drawString(m.getImage(),m.getX(),m.getY());
    }
}
