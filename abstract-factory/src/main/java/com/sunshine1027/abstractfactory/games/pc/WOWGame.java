package com.sunshine1027.abstractfactory.games.pc;

import com.sunshine1027.abstractfactory.User;

/**
 * @author sunshine1027 [sunshine10271993@gmail.com]
 */

public class WOWGame implements PCGame {

    public String storageProgress(final User user, final int times) {
        return createMsg(user, times);
    }

    public static String createMsg(final User user, final int times) {
        return "This is the " + times + " times User " + user.getUsername() + " storage progress in WOW";
    }
}
