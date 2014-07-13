package com.xdaben.letsmodreboot.configuration;

import net.minecraftforge.common.config.Configuration;


import java.io.File;

public class configurationHandler
{
    public static void init(File configFile)
    {
        Configuration configuration = new Configuration(configFile);
        boolean configValue = false;
        try
        {
            //load the config file
            configuration.load();


           //load values form configfile
           configValue = configuration.get(Configuration.CATEGORY_GENERAL, "configValue", true, "This is an example config value").getBoolean();
        } catch (Exception e)
        {
            //do some logging here
        } finally
        {
            //save the config
            configuration.save();
        }

    }
}
