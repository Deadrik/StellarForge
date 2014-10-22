package com.bioxx.sf;

import net.minecraft.block.Block;

import com.bioxx.sf.Blocks.BlockSF;

import cpw.mods.fml.common.registry.GameRegistry;

public class SFBlocks 
{
	public static int clayGrassRenderId;

	public static Block TechWall;

	public static void RegisterBlocks()
	{
		GameRegistry.registerBlock(TechWall, "TechWall");

	}

	public static void LoadBlocks()
	{
		System.out.println(new StringBuilder().append("[SF] Loading Blocks").toString());
		TechWall = new BlockSF();

	}
}