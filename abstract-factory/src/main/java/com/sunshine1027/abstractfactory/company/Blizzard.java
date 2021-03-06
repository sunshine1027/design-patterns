package com.sunshine1027.abstractfactory.company;

import com.sunshine1027.abstractfactory.games.online.DiabloGame;
import com.sunshine1027.abstractfactory.games.online.OnlineGame;
import com.sunshine1027.abstractfactory.games.pc.PCGame;
import com.sunshine1027.abstractfactory.games.pc.WOWGame;

/**
 * @author sunshine1027 [sunshine10271993@gmail.com]
 */

public class Blizzard implements Company{
    @Override
    public PCGame createPCGame() {
        return new WOWGame();
    }

    @Override
    public OnlineGame createOnlineGame() {
        return new DiabloGame();
    }
}
