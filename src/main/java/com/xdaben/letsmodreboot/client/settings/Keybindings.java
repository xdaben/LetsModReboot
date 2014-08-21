package com.xdaben.letsmodreboot.client.settings;

import com.xdaben.letsmodreboot.reference.Names;
import net.minecraft.client.settings.KeyBinding;
import org.lwjgl.input.Keyboard;

public class Keybindings
{
    public static KeyBinding charge = new KeyBinding(Names.KEYS.CHARGE, Keyboard.KEY_C, Names.KEYS.CATAGORY);
    public static KeyBinding release = new KeyBinding(Names.KEYS.RELEASE, Keyboard.KEY_R, Names.KEYS.CATAGORY);
}
