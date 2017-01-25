package com.sunshine1027.abstractfactory.company;

import com.sunshine1027.abstractfactory.games.online.MidnightClubGame;
import com.sunshine1027.abstractfactory.games.online.OnlineGame;
import com.sunshine1027.abstractfactory.games.pc.GTAGame;
import com.sunshine1027.abstractfactory.games.pc.PCGame;


/**
 * @author sunshine1027 [sunshine10271993@gmail.com]
 */

public class Rockstar implements Company {
    @Override
    public PCGame createPCGame() {
        return new GTAGame();
    }

    @Override
    public OnlineGame createOnlineGame() {
        return new MidnightClubGame();
    }

}
