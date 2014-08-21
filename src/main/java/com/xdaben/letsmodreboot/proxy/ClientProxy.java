package com.xdaben.letsmodreboot.proxy;

import com.xdaben.letsmodreboot.client.settings.Keybindings;
import cpw.mods.fml.client.registry.ClientRegistry;
import net.minecraft.client.settings.KeyBinding;

import javax.swing.text.JTextComponent;

public class ClientProxy extends CommonProxy
{
    @Override
    public void registerKeybindings()
    {
        ClientRegistry.registerKeyBinding(Keybindings.charge);
        ClientRegistry.registerKeyBinding(Keybindings.release);
    }
}
