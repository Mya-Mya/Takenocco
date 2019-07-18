package home;

import app.DataTransfer;
import app.Service;
import game.GameScreen;
import scene.Presenter;

public class HomePresenter extends Presenter {
    public HomePresenter(DataTransfer dt){
        super(dt);
    }

    public void pressedButton() {
        Service.inst().changeScene(new GameScreen(null));
    }
}
