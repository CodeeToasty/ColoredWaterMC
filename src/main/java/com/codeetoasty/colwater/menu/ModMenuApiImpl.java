package com.codeetoasty.colwater.menu;

import com.codeetoasty.colwater.ColoredWater;
import com.codeetoasty.colwater.registry.ModBlocks;
import com.google.common.collect.ImmutableMap;
import com.terraformersmc.modmenu.gui.ModMenuOptionsScreen;
import io.github.prospector.modmenu.api.ConfigScreenFactory;
import io.github.prospector.modmenu.api.ModMenuApi;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.screen.options.OptionsScreen;

import java.util.Map;


// Using old API for backwards compatibility

@SuppressWarnings("deprecation")
public class ModMenuApiImpl implements ModMenuApi {
    @Override
    public ConfigScreenFactory<?> getModConfigScreenFactory() {
        return ColWaterConfigScreen::new;
    }
}
