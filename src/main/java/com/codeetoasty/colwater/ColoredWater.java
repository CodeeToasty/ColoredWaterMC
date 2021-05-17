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

import java.io.*;
import java.nio.file.Path;
import java.util.Scanner;

public class ColoredWater implements ModInitializer {
    public static final String MOD_ID = "colwater";

    /*
        this boolean indicates how fluid block are registered.
        true: colored light (requires HCL or blocks are not glowing)
        false: vanilla light
     */

    public static boolean colorlight;
    EnvType envType = FabricLauncherBase.getLauncher().getEnvironmentType();
    @Override
    public void onInitialize() {
        if(envType==EnvType.CLIENT) {
            getConfig();
            ModFluids.registerFluids();
            ModBlocks.registerBlocks();
            ModItems.registerItems();
            ModParticles.registerParticles();
        }
        else{
            getConfig();
            ModFluids.registerFluids();
            ModBlocks.registerBlocks();
            ModItems.registerItems();
        }
    }


    public void getConfig(){
        Path configPath = FabricLoader.getInstance().getConfigDir();
        File configFile = new File(configPath.toFile(), "colorlight.txt");
        try(Scanner fileReader = new Scanner(configFile)) {
            colorlight = fileReader.nextBoolean();
            }
        catch (IOException e) {
            colorlight = false;
        }
    }
}
