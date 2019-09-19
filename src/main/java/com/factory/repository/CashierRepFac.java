package com.factory.repository;

import com.repository.casher.CashierRep;

public class CashierRepFac {
    private CashierRep cashierRep,cashierRe;
    public static CashierRep getCashier() {
        return  CashierRep.getCashierRep();
    }
}
