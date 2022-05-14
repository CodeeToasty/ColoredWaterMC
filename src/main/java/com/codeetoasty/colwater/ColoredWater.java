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
import org.spongepowered.asm.mixin.injection.Inject;

public class ColoredWater implements ModInitializer {
    public static final String MOD_ID = "colwater";

    @Override
    public void onInitialize() {
            new ModFluids();
            new ModItems();
            new ModBlocks();
    }

}
