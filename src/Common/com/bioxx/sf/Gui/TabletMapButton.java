package com.bioxx.sf.Gui;

import java.util.Random;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.renderer.OpenGlHelper;
import net.minecraft.util.ResourceLocation;

import org.lwjgl.opengl.GL11;

import com.bioxx.sf.Reference;

public class TabletMapButton extends GuiButton 
{
	public static ResourceLocation TabletTex = new ResourceLocation(Reference.ModID, Reference.AssetPathGui + "gui_tablet_map.png");

	GuiTabletBase parent;
	Random rand;

	public TabletMapButton(int id, int bx, int by, int bw, int bh, String name, GuiTabletBase screen) 
	{
		super(id, bx, by, bw, bh, name);
		parent = screen;
		this.zLevel = 399f;
		rand = new Random(id);
	}

	@Override
	public void drawButton(Minecraft p_146112_1_, int mx, int my)
	{
		if (this.visible)
		{
			rand.setSeed(this.id);
			FontRenderer fontrenderer = p_146112_1_.fontRenderer;
			p_146112_1_.getTextureManager().bindTexture(TabletTex);
			GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
			this.field_146123_n = mx >= this.xPosition && my >= this.yPosition && mx < this.xPosition + this.width && my < this.yPosition + this.height;
			int k = this.getHoverState(this.field_146123_n);
			GL11.glEnable(GL11.GL_BLEND);
			OpenGlHelper.glBlendFunc(770, 771, 1, 0);
			GL11.glBlendFunc(GL11.GL_SRC_ALPHA, GL11.GL_ONE_MINUS_SRC_ALPHA);

			GL11.glColor4f(rand.nextFloat(), rand.nextFloat(), rand.nextFloat(), 1.0F);
			this.drawTexturedModalRect(this.xPosition, this.yPosition, 0, 162, 22, 22);
			GL11.glColor4f(rand.nextFloat(), rand.nextFloat(), rand.nextFloat(), 1.0F);
			this.drawTexturedModalRect(this.xPosition, this.yPosition, 22, 162, 22, 22);
			GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
			if(k > 1)
			{
				this.drawTexturedModalRect(this.xPosition+1, this.yPosition+1, 23, 141, 20, 20);
			}
			this.mouseDragged(p_146112_1_, mx, my);



			/*if(field_146123_n)
			{
				parent.drawTooltip(mx, my, displayString);
				GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
			}*/

		}
	}


}
