package com.xdaben.letsmodreboot.init;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.ShapedOreRecipe;

public class Recipes
{

    public static void init()
    {

        GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.flag),
                                        new ItemStack(ModItems.originalItem),
                                        new ItemStack(ModItems.originalItem));

        GameRegistry.addShapedRecipe(new ItemStack(ModItems.mapleLeaf),
                                     "www",
                                     "wow",
                                     "www",
                                     'w',
                                     new ItemStack(Blocks.wool, 1, 0),
                                     'o',
                                     new ItemStack(ModItems.originalItem));

        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.mapleLeaf),
                                                   " s ",
                                                   "sss",
                                                   " s ",
                                                   's',
                                                   "stickWood"));
    }
}
