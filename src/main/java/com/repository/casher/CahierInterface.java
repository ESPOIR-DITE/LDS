package com.repository.casher;

import com.domain.cashierBuilderPack.Cashier;


import java.util.ArrayList;
import com.repository.Irepository;

public interface CahierInterface extends Irepository<Cashier,String> {
   public ArrayList<Cashier> getAll();
}
