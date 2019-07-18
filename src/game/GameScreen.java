package game;

import app.DataTransfer;
import app.Design;
import game.chara.CharaScreen;
import scene.Screen;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 * ゲーム画面を表す
 */
public class GameScreen extends Screen
        implements IGameScreen, KeyListener {
    private GamePresenter p;
    private JLabel numShootable;

    public GameScreen(DataTransfer dt) {
        super(dt);
        numShootable = Design.createLabel();
        add(numShootable, BorderLayout.NORTH);
        addKeyListener(this);
        p = new GamePresenter(dt, this);
    }

    /**
     * 新しいキャラ画面を追加する
     * @param cs キャラ画面
     */
    @Override
    public void addCharaS(CharaScreen cs) {
        add(cs);
    }

    /**
     * キャラ画面を削除する
     * @param cs 削除したいキャラ画面
     */
    @Override
    public void removeCharaS(CharaScreen cs) {
        remove(cs);
    }

    /**
     * 画面に表示するシュート可能な回数を変える
     * @param value シュート可能な回数
     */
    @Override
    public void changeNumShootable(int value) {
        numShootable.setText(Integer.toString(value));
    }

    @Override
    public void keyTyped(KeyEvent e) {
        int k = e.getExtendedKeyCode();
        switch (k) {
            case KeyEvent.VK_KP_UP:
                p.pushedUp();
                break;
            case KeyEvent.VK_KP_RIGHT:
                p.pushedRight();
                break;
            case KeyEvent.VK_KP_DOWN:
                p.pushedDown();
                break;
            case KeyEvent.VK_KP_LEFT:
                p.pushedLeft();
                break;
        }
    }

    @Override
    public void keyPressed(KeyEvent e) {

    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
