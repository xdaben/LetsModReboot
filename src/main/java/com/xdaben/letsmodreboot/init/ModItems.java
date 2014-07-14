package com.xdaben.letsmodreboot.init;

import com.xdaben.letsmodreboot.item.ItemLMRB;
import com.xdaben.letsmodreboot.item.ItemMapleLeaf;
import com.xdaben.letsmodreboot.item.ItemOriginalItem;
import com.xdaben.letsmodreboot.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModItems
{
    public static final ItemLMRB mapleLeaf = new ItemMapleLeaf();
    public static final ItemLMRB originalItem = new ItemOriginalItem();

    public static void init()
    {
        GameRegistry.registerItem(mapleLeaf, "Mapleleaf");
        GameRegistry.registerItem(originalItem, "Origionalitem");
    }
}
