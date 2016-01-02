package com.github.spartan322.banner1710.block;

import java.util.ArrayList;
import java.util.Collections;

import com.github.spartan322.banner1710.BannerMod;
import com.github.spartan322.banner1710.tileentity.TileEntityBanner;

import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class BannerBlock extends BlockContainer {


	protected BannerBlock(Material p_i45386_1_) {
		super(p_i45386_1_);
	}

	public ArrayList<ItemStack> getDrops(World world, int x, int y, int z, int metadata, int fortune) {
		ItemStack stack = new ItemStack(BannerMod.bannerItem);
		TileEntity tile = world.getTileEntity(x, y, z);
		if(tile == null || !(tile instanceof TileEntityBanner)) return null;
		BannerMod.bannerItem.setBannerNbt(stack, ((TileEntityBanner) tile).getLayersTag());
		return new ArrayList<ItemStack>(Collections.singleton(stack));
    }

	@Override
	public TileEntity createNewTileEntity(World p_149915_1_, int p_149915_2_) {
		return new TileEntityBanner();
	}

	public int getRenderType()
    {
        return -1;
    }

    public boolean renderAsNormalBlock()
    {
        return false;
    }

    public boolean getBlocksMovement(IBlockAccess p_149655_1_, int p_149655_2_, int p_149655_3_, int p_149655_4_)
    {
        return true;
    }
    
    public boolean isOpaqueCube()
    {
        return false;
    }	
}
