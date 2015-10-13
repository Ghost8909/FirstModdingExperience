package com.ghost8909.firstmoddingexperience;

import com.ghost8909.firstmoddingexperience.proxy.IProxy;
import com.ghost8909.firstmoddingexperience.proxy.reference.Reference;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION)
public class FirstModdingExperience 
{
	@Mod.Instance(Reference.MOD_ID)
	public static FirstModdingExperience instance;
	
	@SidedProxy(clientSide = "com.ghost8909.firstmoddingexperience.proxy.ClientProxy", serverSide = "com.ghost8909.firstmoddingexperience.proxy.ServerProxy")
	public static IProxy proxy;
	
	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent event)
	{
		
	}
	
	@Mod.EventHandler
	public void Init(FMLInitializationEvent event)
	{
	
	}
	@Mod.EventHandler
	public void postInit(FMLPostInitializationEvent event)
	{
		
	}
}
