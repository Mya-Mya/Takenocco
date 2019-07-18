package game;

import app.DataTransfer;
import game.chara.CharaModel;
import game.chara.CharaScreen;
import scene.ModelListener;
import scene.Presenter;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GamePresenter extends Presenter
        implements ModelListener, IGamePresenter, ActionListener {
    private Timer timer;
    private IGameScreen s;
    private GameModel m;
    public GamePresenter(DataTransfer dt,IGameScreen s) {
        super(dt);
        this.s=s;
        timer=new Timer(1000,this);
        timer.setActionCommand("TIMER");
        m=new GameModel(this,this);
    }

    public void pushedUp(){

    }
    public void pushedRight(){

    }
    public void pushedDown(){

    }
    public void pushedLeft(){

    }

    @Override
    public void modelChanged() {
        s.changeNumShootable(m.getNumShootable());
    }

    @Override
    public void newCharaCreated(CharaModel cm) {
        CharaScreen cs=new CharaScreen(cm);
        s.addCharaS(cs);
    }

    @Override
    public void removeCharaS(CharaScreen cs) {
        s.removeCharaS(cs);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getActionCommand().equals(timer.getActionCommand())){
            m.createNewEnemy();
        }
    }
}
