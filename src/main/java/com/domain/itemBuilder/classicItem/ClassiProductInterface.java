package com.domain.itemBuilder.classicItem;

import com.domain.itemBuilder.ItemInterface;

/**
 * this class is the interface for all the classic product that are sold in the store
 * this class will help creat object of all the classic classes.
 *
 */
public interface ClassiProductInterface extends ItemInterface {
    void flavor(String flavor);
    ClassicProduct getClassic();
}
