package com.codeetoasty.colwater;

import com.codeetoasty.colwater.registry.ModBlocks;
import com.codeetoasty.colwater.registry.ModFluids;
import com.codeetoasty.colwater.registry.ModItems;
import net.fabricmc.api.ModInitializer;
import net.minecraft.resource.ResourceFinder;
import net.minecraft.resource.ResourceManager;

public class ColoredWater implements ModInitializer {

    public static final String MOD_ID = "colwater";

    @Override
    public void onInitialize(){
            new ModFluids();
            new ModItems();
            new ModBlocks();
    }
}
