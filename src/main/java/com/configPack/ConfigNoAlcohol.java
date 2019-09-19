package com.configPack;

import com.factory.domain.productFactory.nonAlcoholItemFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigNoAlcohol
{
    @Bean(name="getNonAlcohol")
    public nonAlcoholItemFactory getService()
    {
        return new nonAlcoholItemFactory();
    }
}
