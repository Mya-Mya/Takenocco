package game.chara;

import scene.ModelListener;

import java.util.Random;

public class EnemyModel extends CharaModel {
    private Random random;
    private double vx;
    private double vy;

    public EnemyModel(ModelListener l, int x, int y) {
        super(l, x, y);
        random = new Random();
        int r = 5 + random.nextInt(4);
        if (random.nextBoolean()) r *= -1;
        double theta = random.nextDouble() * 3.142 * 2;
        vy = r * Math.sin(theta);
        vx = r * Math.cos(theta);
    }

    @Override
    public void step() {
        x += vx;
        y += vy;
        fireListeners();
    }

    @Override
    public void move(int x, int y) {

    }

    @Override
    public String getImage() {
        return "敵";
    }
}
