package com.xdaben.letsmodreboot;

import com.xdaben.letsmodreboot.handler.ConfigurationHandler;
import com.xdaben.letsmodreboot.proxy.IProxy;
import com.xdaben.letsmodreboot.reference.Reference;
import com.xdaben.letsmodreboot.utility.LogHelper;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION, guiFactory = Reference.GUI_FACTORY_CLASS)
public class LetsModReboot
{
    @Mod.Instance(Reference.MOD_ID)
    public static LetsModReboot instance;

    @SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
    public static IProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {

        ConfigurationHandler.init(event.getSuggestedConfigurationFile());
        LogHelper.info("Preinit complete");
    }
    @Mod.EventHandler
    public void init(FMLInitializationEvent event)
    {
        LogHelper.info("Init complete");
    }
    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {
        LogHelper.info("Postinit complete");
    }
}
