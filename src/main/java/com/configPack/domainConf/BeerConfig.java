package com.configPack.domainConf;

import com.domain.itemBuilder.beverages.alcoholProduct.Alcohol;
import com.domain.itemDomain.beverages.alcoholicItem.Beer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeerConfig {
    @Bean(name="myBeer")
    public Alcohol getAlcoholService()
    {
        return new Beer();
    }
}
