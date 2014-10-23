package com.bioxx.sf.Gui;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.renderer.RenderHelper;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.ResourceLocation;

import org.lwjgl.opengl.GL11;

public class GuiTabletBase extends GuiScreen 
{
	protected EntityPlayer player;
	protected int xSize = 220;
	protected int ySize = 136;
	protected int guiLeft = 0;
	protected int guiTop = 0;

	public GuiTabletBase(EntityPlayer player)
	{
		this.player = player;
	}

	@Override
	public void drawScreen(int p_73863_1_, int p_73863_2_, float p_73863_3_)
	{
		super.drawScreen(p_73863_1_, p_73863_2_, p_73863_3_);
	}

	@Override
	public void initGui()
	{
		super.initGui();
		guiLeft = (width - xSize) / 2;
		guiTop = (height - ySize) / 2;
	}

	protected void drawGui(ResourceLocation rl)
	{
		if(rl != null)
		{
			this.bindTexture(rl);

			drawTexturedModalRect(guiLeft, guiTop, 0, 0, xSize, ySize);
		}
	}

	protected void bindTexture(ResourceLocation rl)
	{
		mc.getTextureManager().bindTexture(rl);
		GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
	}

	public void drawTooltip(int mx, int my, String text) {
		List list = new ArrayList();
		list.add(text);
		this.drawHoveringText(list, mx, my+15, mc.fontRenderer);
		RenderHelper.disableStandardItemLighting();
		GL11.glDisable(GL11.GL_LIGHTING);
		GL11.glDisable(GL11.GL_DEPTH_TEST);
	}
}
