package com.bioxx.sf.Blocks;

import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

import com.bioxx.sf.TileEntites.TETechWall;

public class BlockTechWall extends BlockSFContainer
{
	public BlockTechWall()
	{
		super();
	}

	@Override
	public TileEntity createNewTileEntity(World p_149915_1_, int p_149915_2_) 
	{
		return new TETechWall();
	}
}
