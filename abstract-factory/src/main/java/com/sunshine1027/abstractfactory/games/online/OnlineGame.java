package com.sunshine1027.abstractfactory.games.online;

import com.sunshine1027.abstractfactory.User;

/**
 * @author sunshine1027 [sunshine10271993@gmail.com]
 */

public interface OnlineGame {
    String consume(User user, int price);
}
