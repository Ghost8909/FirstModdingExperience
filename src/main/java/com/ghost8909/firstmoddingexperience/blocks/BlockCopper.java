package com.ghost8909.firstmoddingexperience.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;

public class BlockCopper extends BlocksFME
{
	public BlockCopper()
	{
		super(Material.iron);
		this.setBlockName("blockCopper");
		this.setBlockTextureName("blockCopper");
		this.setStepSound(soundTypeMetal);
		this.setHardness(5.0F);
		this.getMapColor(MapColor.goldColor);
	}

	private void getMapColor(MapColor goldcolor) 
	{
		
	}

}
