package com.sunshine1027.abstractfactory.company;

import com.sunshine1027.abstractfactory.games.online.OnlineGame;
import com.sunshine1027.abstractfactory.games.pc.PCGame;

/**
 * @author sunshine1027 [sunshine10271993@gmail.com]
 */

public interface Company {
    PCGame createPCGame();
    OnlineGame createOnlineGame();
}
