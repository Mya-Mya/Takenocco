package game.chara;

import scene.Model;
import scene.ModelListener;

public abstract class CharaModel extends Model {
    protected int x;
    protected int y;

    public CharaModel(ModelListener l, int x, int y) {
        super(l);
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public abstract void step();

    public abstract void move(int x, int y);

    public abstract String getImage();
}
