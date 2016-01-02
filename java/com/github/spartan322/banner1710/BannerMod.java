package com.github.spartan322.banner1710;

import com.github.spartan322.banner1710.common.CommonProxy;
import com.github.spartan322.banner1710.item.ItemBanner;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = BannerMod.MODID, name = BannerMod.NAME)
public class BannerMod {

	public static final String MODID = "banner1710";
	public static final String NAME = "Banner1710";
	
	public static final String CLIENTPROXY = "com.github.spartan322.banner1710.client.ClientProxy";
	public static final String COMMONPROXY = "com.github.spartan322.banner1710.common.CommonProxy";
	
	@Instance(MODID)
	public static BannerMod instance;
	
	@SidedProxy(clientSide = CLIENTPROXY, serverSide = COMMONPROXY)
	public static CommonProxy proxy;
	
	public static final ItemBanner bannerItem = new ItemBanner("banner");
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		proxy.preInit(event);
	}
	
	@EventHandler
	public void init(FMLInitializationEvent event) {
		proxy.init(event);
	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent event) {
		proxy.postInit(event);
	}
}
