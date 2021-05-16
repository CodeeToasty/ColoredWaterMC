package com.codeetoasty.colwater;

import com.codeetoasty.colwater.registry.ModBlocks;
import com.codeetoasty.colwater.registry.ModFluids;
import com.codeetoasty.colwater.registry.ModItems;
import com.codeetoasty.colwater.registry.ModParticles;
import net.fabricmc.api.ModInitializer;

public class ColoredWater implements ModInitializer {
    public static final String MOD_ID = "colwater";

    @Override
    public void onInitialize() {
        ModFluids.registerFluids();
        ModBlocks.registerBlocks();
        ModItems.registerItems();
        ModParticles.registerParticles();
    }
}
