package com.ghost8909.firstmoddingexperience.client.gui;

import java.util.Set;

import cpw.mods.fml.client.IModGuiFactory;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiScreen;

public class GuiFactory implements IModGuiFactory
{

	@Override
	public void initialize(Minecraft minecraftInstance) 
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public Class<? extends GuiScreen> mainConfigGuiClass() 
	{
		return ModGuiConfig.class;
	}

	@Override
	public Set<RuntimeOptionCategoryElement> runtimeGuiCategories() 
	{
		return null;
	}

	@Override
	public RuntimeOptionGuiHandler getHandlerFor(RuntimeOptionCategoryElement element) 
	{
		return null;
	}

}
