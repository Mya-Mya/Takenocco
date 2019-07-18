package game;

import app.Repository;
import game.chara.CharaModel;
import game.chara.EnemyModel;
import scene.Model;
import scene.ModelListener;

public class GameModel extends Model {
    private IGamePresenter p;
    private int numShootable=Repository.shootable;
    public GameModel(ModelListener l,IGamePresenter p) {
        super(l);
        this.p=p;
    }
    public void createNewEnemy(){
        CharaModel enemyModel=new EnemyModel(null,400,400);
        p.newCharaCreated(enemyModel);
    }

    public int getNumShootable() {
        return numShootable;
    }

    public boolean isShootable(){
        return numShootable>0;
    }

    public void decrementNumShootable(){
        numShootable--;
    }
}
