package com.codeetoasty.colwater;

import com.codeetoasty.colwater.registry.ModBlocks;
import com.codeetoasty.colwater.registry.ModFluids;
import com.codeetoasty.colwater.registry.ModItems;
import com.codeetoasty.colwater.registry.ModParticles;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.loader.api.FabricLoader;
import net.fabricmc.loader.launch.common.FabricLauncherBase;

public class ColoredWater implements ModInitializer {
    public static final String MOD_ID = "colwater";
    EnvType envType = FabricLoader.getInstance().getEnvironmentType();

    @Override
    public void onInitialize() {
        if(envType.equals(EnvType.CLIENT)) {
            ModFluids.registerFluids();
            ModItems.registerItems();
            ModParticles.registerParticles();
            ModBlocks.registerBlocks();
        }
        else{
            ModFluids.registerFluids();
            ModBlocks.registerBlocks();
            ModItems.registerItems();
        }
    }

}
