package com.sunshine1027.chainofresponsity;

/**
 * @author sunshine1027 [sunshine10271993@gmail.com]
 */

public class TechnicalDirectorHandler extends ManagerHandler{

    public TechnicalDirectorHandler(ManagerHandler nextHandler) {
        super(nextHandler);
    }

    @Override
    public String requestForRest(RestMsg restMsg) {
        if (checkHandlerAvailable(restMsg)) {
            return Constants.REQUEST_SUCCESS_BY_TECHNICAL_DIRECTOR_MSG;
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
        int level = Constants.transferLevel(restMsg.getLevel());
        if (level >= 7) {
            return false;
        } else if (restMsg.getRestHour() >= 24 * 3)
            return false;
        return true;
    }
}
