package com.codeetoasty.colwater.menu;

import io.github.prospector.modmenu.api.ConfigScreenFactory;
import io.github.prospector.modmenu.api.ModMenuApi;

// Using old API for backwards compatibility

@SuppressWarnings("deprecation")
public class ModMenuApiImpl implements ModMenuApi {
    @Override
    public ConfigScreenFactory<?> getModConfigScreenFactory() {
        return ColWaterConfigScreen::new;
    }
}
