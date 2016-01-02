package com.github.spartan322.banner1710.tileentity;

import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;

public class TileEntityBanner extends TileEntity {

	public static final String LAYERS_NBT = "layers";
	
	private NBTTagCompound layers;
	
	public void writeToNBT(NBTTagCompound tag)
    {
        super.writeToNBT(tag);
        tag.setTag(LAYERS_NBT, layers);
    }

    public void readFromNBT(NBTTagCompound tag)
    {
        super.readFromNBT(tag);
        layers = tag.getCompoundTag(LAYERS_NBT);
    }
    
    public NBTTagCompound getLayersTag() {
    	return (NBTTagCompound) this.layers.copy();
    }
	
}
