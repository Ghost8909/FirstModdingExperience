package com.ghost8909.firstmoddingexperience.init;

import com.ghost8909.firstmoddingexperience.items.ItemMapleLeaf;
import com.ghost8909.firstmoddingexperience.items.ItemKatanaSword;
import com.ghost8909.firstmoddingexperience.items.ItemHorseCockSword;
import com.ghost8909.firstmoddingexperience.items.ItemsFME;
import com.ghost8909.firstmoddingexperience.proxy.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModItems 
{
	public static final ItemsFME mapleLeaf = new ItemMapleLeaf();
	public static final ItemsFME katanaSword = new ItemKatanaSword();
	public static final ItemsFME horseCockSword = new ItemHorseCockSword();
	
	public static void init()
	{
		GameRegistry.registerItem(mapleLeaf, "mapleLeaf");
		GameRegistry.registerItem(katanaSword, "katanaSword");
		GameRegistry.registerItem(horseCockSword, "horseCockSword");
		
	}
}
