package com.bioxx.sf.Gui;

import net.minecraft.client.gui.GuiButton;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.ResourceLocation;

import com.bioxx.sf.Reference;

public class GuiTabletMap extends GuiTabletBase
{
	private static ResourceLocation Tex = new ResourceLocation(Reference.ModID, Reference.AssetPathGui + "gui_tablet_map.png");
	public int selectedPlanet = -1;

	public GuiTabletMap(EntityPlayer player)
	{
		super(player);
	}

	@Override
	public void drawScreen(int p_73863_1_, int p_73863_2_, float p_73863_3_)
	{
		this.drawGui(Tex);
		super.drawScreen(p_73863_1_, p_73863_2_, p_73863_3_);
		if(selectedPlanet > -1)
		{
			fontRendererObj.drawString("Planet "+selectedPlanet, guiLeft+12, guiTop+11, 0xffffff);
		}
	}

	@Override
	public void initGui()
	{
		super.initGui();
		buttonList.clear();
		for(int y = 4; y >= 0; y--)
		{
			for(int x = 4; x >= 0; x--)
			{
				buttonList.add(new TabletMapButton((y*5)+x, guiLeft+104+(x*21), guiTop+20+(y*21), 22, 22,"Planet "+((y*5)+x), this));
			}
		}

	}

	@Override
	protected void actionPerformed(GuiButton guibutton)
	{
		selectedPlanet = guibutton.id;
	}
}
