package com.bioxx.sf;

import java.io.File;

import net.minecraft.client.Minecraft;
import net.minecraft.world.World;

import com.bioxx.sf.Client.KeyBindingHandler;
import com.bioxx.sf.Client.KeyBindings;

import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.network.NetworkRegistry;
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
	public void registerHandlers()
	{
		FMLCommonHandler.instance().bus().register(new KeyBindingHandler());
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
		KeyBindings.addKeyBinding(KeyBindingHandler.Key_Tablet);
		KeyBindings.addIsRepeating(false);
	}

	@Override
	public void registerGuiHandler()
	{
		NetworkRegistry.INSTANCE.registerGuiHandler(StellarForge.instance, new com.bioxx.sf.Client.Gui.GuiHandler());
	}

	@Override
	public String getCurrentLanguage()
	{
		return Minecraft.getMinecraft().getLanguageManager().getCurrentLanguage().getLanguageCode();
	}
}
