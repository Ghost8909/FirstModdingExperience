package com.ghost8909.firstmoddingexperience;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid="FirstModdingExperience", name="First Modding Experience", version="1.7.10-1.0")
public class FirstModdingExperience 
{
	@Mod.Instance("FirstModdingExperience")
	public static FirstModdingExperience instance;
	
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
