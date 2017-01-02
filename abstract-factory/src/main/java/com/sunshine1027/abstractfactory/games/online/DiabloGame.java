package com.sunshine1027.abstractfactory.games.online;

import com.sunshine1027.abstractfactory.User;

/**
 * @author sunshine1027 [sunshine10271993@gmail.com]
 */

public class DiabloGame implements OnlineGame{

    public String consume(User user, int price) {
        return createDiabloConsumeMsg(user, price);
    }

    public static String createDiabloConsumeMsg(User user, int price) {
        return user.getUsername() + " consume " + price + " in Diablo";
    }

}
