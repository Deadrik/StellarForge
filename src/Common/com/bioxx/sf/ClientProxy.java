package com.bioxx.sf;

import java.io.File;

import net.minecraft.client.Minecraft;
import net.minecraft.world.World;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ClientProxy extends CommonProxy
{

	@Override
	public void registerFluidIcons()
	{
		//Only bother adding fluids here if you don't want to use the default HotWater icons

	}

	@Override
	@SideOnly(Side.CLIENT)
	public void registerRenderInformation()
	{

	}

	@Override
	@SideOnly(Side.CLIENT)
	public void registerBiomeEventHandler()
	{

	}

	@Override
	@SideOnly(Side.CLIENT)
	public void setupGuiIngameForge()
	{

	}

	@Override
	public void registerTileEntities(boolean b)
	{
		super.registerTileEntities(false);
	}

	@Override
	public void onClientLogin()
	{
	}

	@Override
	public World getCurrentWorld()
	{
		return Minecraft.getMinecraft().theWorld;
	}

	@Override
	public boolean isRemote()
	{
		return true;
	}

	@Override
	public File getMinecraftDir()
	{
		return Minecraft.getMinecraft().mcDataDir;
	}

	@Override
	public void registerKeys()
	{

	}


	@Override
	public void registerGuiHandler()
	{
		//NetworkRegistry.INSTANCE.registerGuiHandler(TerraFirmaCraft.instance, new com.bioxx.tfc.Handlers.Client.GuiHandler());
		// Register Gui Event Handler
		//MinecraftForge.EVENT_BUS.register(new com.bioxx.tfc.Handlers.Client.GuiHandler());
	}

	@Override
	public String getCurrentLanguage()
	{
		return Minecraft.getMinecraft().getLanguageManager().getCurrentLanguage().getLanguageCode();
	}
}
