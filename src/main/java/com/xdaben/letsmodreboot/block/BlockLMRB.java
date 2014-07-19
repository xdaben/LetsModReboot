package com.xdaben.letsmodreboot.block;
import com.xdaben.letsmodreboot.creativetab.CreativeTabLMRB;
import com.xdaben.letsmodreboot.reference.Reference;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class BlockLMRB extends Block
{

    public BlockLMRB(Material material)
    {
        super(material);
        this.setCreativeTab(CreativeTabLMRB.LMRB_TAB);
    }

    public BlockLMRB()
    {
        this(Material.rock);
    }

    @Override
    public String getUnlocalizedName()
    {
        return String.format("tile.%s:%s", Reference.MOD_ID.toLowerCase(), getUnwrapedUnlocalizedName(super.getUnlocalizedName()));
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister iconRegister)
    {
        blockIcon = iconRegister.registerIcon(String.format("%s", getUnwrapedUnlocalizedName(this.getUnlocalizedName())));
    }

    protected String getUnwrapedUnlocalizedName(String unlocalizedName)
    {
        return unlocalizedName.substring(unlocalizedName.indexOf(".") + 1);
    }
}
