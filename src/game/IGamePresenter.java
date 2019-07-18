package game;

import game.chara.CharaModel;
import game.chara.CharaScreen;

public interface IGamePresenter {
    void newCharaCreated(CharaModel cm);
    void removeCharaS(CharaScreen cs);
}
