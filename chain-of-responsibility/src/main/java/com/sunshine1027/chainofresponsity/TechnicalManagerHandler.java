package com.sunshine1027.chainofresponsity;

/**
 * @author sunshine1027 [sunshine10271993@gmail.com]
 */

public class TechnicalManagerHandler extends ManagerHandler{
    public TechnicalManagerHandler(ManagerHandler managerHandler) {
        super(managerHandler);
    }

    @Override
    public String requestForRest(RestMsg restMsg) {
        if (checkHandlerAvailable(restMsg)) {
            return Constants.REQUEST_SUCCESS_BY_TECHNICAL_MANAGER__MSG;
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
        if (level >= 6) {
            return false;
        } else if (restMsg.getRestHour() >= 24)
            return false;
        return true;
    }
}
