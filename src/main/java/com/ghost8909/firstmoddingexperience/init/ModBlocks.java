package com.ghost8909.firstmoddingexperience.init;

import com.ghost8909.firstmoddingexperience.blocks.BlockCopper;
import com.ghost8909.firstmoddingexperience.blocks.BlocksFME;
import com.ghost8909.firstmoddingexperience.proxy.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModBlocks 
{
	public static final BlocksFME copperBlock = new BlockCopper();
	
	public static void init()
	{
		GameRegistry.registerBlock(copperBlock, "copperBlock");
	}
}
