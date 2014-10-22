package com.bioxx.sf;

import java.io.File;

import net.minecraft.server.MinecraftServer;
import net.minecraft.world.World;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.network.NetworkRegistry;

public class CommonProxy
{
	public void registerFluidIcons()
	{

	}

	public void registerRenderInformation()
	{
		// NOOP on server
	}

	public void registerHandlers()
	{
		// NOOP on server
	}

	public void setupGuiIngameForge()
	{
		// NOOP on server
	}

	public String getCurrentLanguage()
	{
		return null;
	}

	public void registerTileEntities(boolean b)
	{

	}

	public void registerToolClasses()
	{

	}

	public void onClientLogin()
	{
	}

	public File getMinecraftDir()
	{
		return FMLCommonHandler.instance().getMinecraftServerInstance().getFile("");/*new File(".");*/
	}

	public boolean isRemote()
	{
		return false;
	}

	public World getCurrentWorld()
	{
		return MinecraftServer.getServer().getEntityWorld();
	}


	public void registerKeys()
	{
	}

	public void registerGuiHandler()
	{
		NetworkRegistry.INSTANCE.registerGuiHandler(StellarForge.instance, new com.bioxx.sf.Gui.GuiHandler());
	}
}
