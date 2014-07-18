package com.xdaben.letsmodreboot.creativetab;

import com.xdaben.letsmodreboot.init.ModItems;
import com.xdaben.letsmodreboot.reference.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class CreativeTabLMRB
{
    public static final CreativeTabs LMRB_TAB = new CreativeTabs(Reference.MOD_ID.toLowerCase())
    {
        @Override
        public Item getTabIconItem()
        {
            return ModItems.originalItem;
        }

    };
}
