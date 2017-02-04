package com.sunshine1027.strategy;

/**
 * @author sunshine1027 [sunshine10271993@gmail.com]
 */

public class CustomService {
    private User user;

    public CustomService(User user) {
        this.user = user;
    }

    public void changeUser(User newUser) {
        this.user = newUser;
    }

    public void chatWithUser() {
        user.chat();
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
