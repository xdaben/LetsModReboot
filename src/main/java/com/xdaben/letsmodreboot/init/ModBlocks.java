package com.xdaben.letsmodreboot.init;

import com.xdaben.letsmodreboot.block.BlockFlag;
import com.xdaben.letsmodreboot.block.BlockLMRB;
import com.xdaben.letsmodreboot.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;

import java.sql.Ref;


@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModBlocks
{

    public static final BlockLMRB flag = new BlockFlag();

    public static void init()
    {
        GameRegistry.registerBlock(flag, "flag");
    }
}
