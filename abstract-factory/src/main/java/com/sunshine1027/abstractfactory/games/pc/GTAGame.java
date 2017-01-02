package com.sunshine1027.abstractfactory.games.pc;

import com.sunshine1027.abstractfactory.User;
import com.sunshine1027.abstractfactory.games.pc.PCGame;

/**
 * @author sunshine1027 [sunshine10271993@gmail.com]
 */

public class GTAGame implements PCGame {


    public String storageProgress(User user, int times) {
        return createMsg(user, times);
    }

    public static String createMsg(User user, int times) {
        return "This is the " + times + " times User " + user.getUsername() + " storage progress in GTA";
    }
}
