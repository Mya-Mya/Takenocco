package game;

import game.chara.CharaScreen;

public interface IGameScreen {
    void addCharaS(CharaScreen cs);
    void removeCharaS(CharaScreen cs);
    void changeNumShootable(int value);
}
