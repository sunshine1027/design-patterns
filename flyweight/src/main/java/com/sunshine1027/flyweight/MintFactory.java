package com.sunshine1027.flyweight;

import java.util.EnumMap;
import java.util.Map;

/**
 * @author sunshine1027 [sunshine10271993@gmail.com]
 */

public class MintFactory {
    private final Map<MoneyEnum, Money> moneyHashMap;

    public MintFactory() {
        moneyHashMap = new EnumMap<>(MoneyEnum.class);
    }

    public Money createMoney(MoneyEnum moneyEnum) {
        Money money = moneyHashMap.get(moneyEnum);
        if (money == null) {
            switch (moneyEnum) {
                case ONE:
                    money = new OneDollarCoin();
                    break;
                case TEN:
                    money = new TenDollarNote();
                    break;
                case HUNDRED:
                    money = new HundredNote();
                    break;
                default:
                    break;
            }
            if (null != money) {
                moneyHashMap.put(moneyEnum, money);
            }
        }
        return money;
    }
}
