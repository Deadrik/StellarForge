//=======================================================
//Mod Client File
//=======================================================
package com.bioxx.sf;

import java.io.File;

import net.minecraftforge.common.config.Configuration;

import com.bioxx.sf.Networking.PacketPipeline;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.event.FMLServerStartingEvent;

@Mod(modid = Reference.ModID, name = Reference.ModName, version = Reference.ModVersion, dependencies = Reference.ModDependencies)
public class StellarForge
{
	@Instance("StellarForge")
	public static StellarForge instance;

	@SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
	public static CommonProxy proxy;

	// The packet pipeline
	public static final PacketPipeline packetPipeline = new PacketPipeline();

	public StellarForge()
	{
	}

	@EventHandler
	public void preInit(FMLPreInitializationEvent event)
	{
		instance = this;
		//Load our settings from the file
		loadSettings();

		proxy.registerKeys();
		proxy.registerHandlers();
		proxy.registerGuiHandler();

		/*DimensionManager.registerProviderType(2, WorldProvider.class, true);

		DimensionManager.registerDimension(2, 2);
		DimensionManager.registerDimension(3, 2);
		DimensionManager.registerDimension(4, 2);*/

	}

	@EventHandler
	public void initialize(FMLInitializationEvent event)
	{
		// Register Packet Handler
		packetPipeline.initalise();
	}

	@EventHandler
	public void postInit (FMLPostInitializationEvent evt)
	{
		packetPipeline.postInitialise();
	}

	@EventHandler
	public void modsLoaded(FMLPostInitializationEvent evt)
	{
	}

	@EventHandler
	public void serverStarting(FMLServerStartingEvent evt)
	{
	}	

	public void loadSettings()
	{
		Configuration config;
		try
		{
			config = new Configuration(new File(StellarForge.proxy.getMinecraftDir(), "/config/SFOptions.cfg"));
			config.load();
		} catch (Exception e) {
			System.out.println(new StringBuilder().append("[SF] Error while trying to access settings configuration!").toString());
			config = null;
		}
		System.out.println(new StringBuilder().append("[SF] Loading Settings").toString());
		/**Start setup here*/


		/**Always end with this*/
		if (config != null)
			config.save();
	}
}
