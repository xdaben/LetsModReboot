package com.xdaben.letsmodreboot.handler;

import com.xdaben.letsmodreboot.reference.ConfigStrings;
import com.xdaben.letsmodreboot.reference.Reference;
import cpw.mods.fml.client.event.ConfigChangedEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.common.config.Configuration;


import java.io.File;

public class ConfigurationHandler
{
    public static Configuration configuration;
    public static boolean configValue = false;


    public static void init(File configFile)
    {
        if (configuration == null)
        {
            configuration = new Configuration(configFile);
            loadConfiguration();
        }


    }

    @SubscribeEvent
    public void onConfigurationChangedEvent(ConfigChangedEvent.OnConfigChangedEvent event)
    {
        if (event.modID.equalsIgnoreCase(Reference.MOD_ID))
        {
            loadConfiguration();
        }
    }

    private static void loadConfiguration()
    {
        configValue = configuration.getBoolean(ConfigStrings.OPTIONS.CONFIG_VALUE, ConfigStrings.CATAGORIES.GENERAL, false, ConfigStrings.DESCRIPTIONS.CONFIG_VALUE);

        if (configuration.hasChanged())
        {
            configuration.save();
        }
    }
}
