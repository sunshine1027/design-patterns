package com.sunshine1027.singleton;

/**
 * @author sunshine1027 [sunshine10271993@gmail.com]
 */

public class InitializationOnDemandHolderIdiom {

    public static InitializationOnDemandHolderIdiom getInstance() {
        return Holder.instance;
    }
    private static class Holder {
        public static InitializationOnDemandHolderIdiom instance = new InitializationOnDemandHolderIdiom();
    }

}
