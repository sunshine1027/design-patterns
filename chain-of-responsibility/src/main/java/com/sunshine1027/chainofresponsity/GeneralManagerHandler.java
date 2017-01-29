package com.sunshine1027.chainofresponsity;

/**
 * @author sunshine1027 [sunshine10271993@gmail.com]
 */

public class GeneralManagerHandler extends ManagerHandler{
    @Override
    public String requestForRest(RestMsg restMsg) {
        if (checkHandlerAvailable(restMsg)) {
            return Constants.REQUEST_SUCCESS_BY_GENERAL_MANAGET_MSG;
        } else {
            if (getNextHandler() != null) {
                return getNextHandler().requestForRest(restMsg);
            } else {
                return Constants.HANDLER_NOT_FIND_MSG;
            }
        }
    }

    @Override
    public boolean checkHandlerAvailable(RestMsg restMsg) {
        return restMsg.getRestHour() <= 24 * 7;
    }
}
