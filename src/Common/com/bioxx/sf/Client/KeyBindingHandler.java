package com.bioxx.sf.Client;

import net.minecraft.client.entity.EntityClientPlayerMP;
import net.minecraft.client.settings.KeyBinding;

import org.lwjgl.input.Keyboard;

import com.bioxx.sf.Reference;
import com.bioxx.sf.StellarForge;

import cpw.mods.fml.client.FMLClientHandler;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.InputEvent;

public class KeyBindingHandler
{
	//public static KeyBinding Key_Calendar = new KeyBinding("key.Calendar", Keyboard.KEY_N/*49*/, Reference.ModName);
	public static KeyBinding Key_Tablet = new KeyBinding("key.tablet", Keyboard.KEY_T/*50*/, Reference.ModName);

	@SubscribeEvent
	public void onKeyInput(InputEvent.KeyInputEvent event)
	{
		EntityClientPlayerMP player = FMLClientHandler.instance().getClient().thePlayer;

		if(FMLClientHandler.instance().getClient().inGameHasFocus &&
				FMLClientHandler.instance().getClient().currentScreen == null)
		{
			if(Key_Tablet.isPressed())
			{
				player.openGui(StellarForge.instance, 0, player.worldObj, (int)player.posX, (int)player.posY, (int)player.posZ);
			}
		}
	}
}
