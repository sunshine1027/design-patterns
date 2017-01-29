package com.sunshine1027.chainofresponsity;

/**
 * @author sunshine1027 [sunshine10271993@gmail.com]
 */

public class Constants {
    public static final String REQUEST_SUCCESS_BY_TECHNICAL_MANAGER__MSG = "Your request for rest deal by technical manager.";
    public static final String REQUEST_SUCCESS_BY_TECHNICAL_DIRECTOR_MSG = "Your request for rest deal by technical director.";
    public static final String REQUEST_SUCCESS_BY_GENERAL_MANAGET_MSG = "Your request for rest deal by general manager.";
    public static final String HANDLER_NOT_FIND_MSG = "Your request can not deal by anyone";

    public static int transferLevel(LevelType levelType) {
        return levelType.name().charAt(1) - '0';
    }
}
