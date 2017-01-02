package com.sunshine1027.abstractfactory.games.online;

import com.sunshine1027.abstractfactory.User;
import com.sunshine1027.abstractfactory.games.online.OnlineGame;

/**
 * Although it is a pc game, we define it is a online game now
 * @author sunshine1027 [sunshine10271993@gmail.com]
 */

public class MidnightClubGame implements OnlineGame {

    public String consume(User user, int price) {
        return createMidnightClubConsumeMsg(user, price);
    }

    public static String createMidnightClubConsumeMsg(User user, int price) {
        return user.getUsername() + " consume " + price + " in MidnightClub";
    }
}
