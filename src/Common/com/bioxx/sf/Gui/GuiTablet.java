package com.bioxx.sf.Gui;

import net.minecraft.client.gui.GuiScreen;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.ResourceLocation;

import org.lwjgl.opengl.GL11;

import com.bioxx.sf.Reference;

public class GuiTablet extends GuiScreen 
{
	public static ResourceLocation GuiTex = new ResourceLocation(Reference.ModID, Reference.AssetPathGui + "gui_tablet.png");
	protected EntityPlayer player;
	int xSize = 220;
	int ySize = 136;

	public GuiTablet(EntityPlayer player)
	{
		this.player = player;
	}

	@Override
	public void drawScreen(int p_73863_1_, int p_73863_2_, float p_73863_3_)
	{
		this.drawGui(GuiTex);
		super.drawScreen(p_73863_1_, p_73863_2_, p_73863_3_);
	}

	protected void drawGui(ResourceLocation rl)
	{
		if(rl != null)
		{
			this.bindTexture(rl);
			int guiLeft = (width - xSize) / 2;
			int guiTop = (height - ySize) / 2;
			drawTexturedModalRect(guiLeft, guiTop, 0, 0, xSize, ySize);
		}
	}

	protected void bindTexture(ResourceLocation rl)
	{
		mc.getTextureManager().bindTexture(rl);
		GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
	}
}
