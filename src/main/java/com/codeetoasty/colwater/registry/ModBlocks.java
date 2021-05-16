package com.codeetoasty.colwater.registry;

import com.codeetoasty.colwater.ColoredWater;
import com.codeetoasty.colwater.fluid.glowingfluid.GlowingFluidBlock;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.block.*;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;


public class ModBlocks {
    public static Block DYABLE_WATER;
    public static Block GREEN;
    public static Block PINK;
    public static Block YELLOW;
    public static Block PURPLE;
    public static Block RED;
    public static Block ORANGE;
    public static Block BLACK;
    public static Block WHITE;
    public static Block BROWN;
    public static Block MAGENTA;
    public static Block CYAN;
    public static Block GRAY;
    public static Block LIGHT_BLUE;
    public static Block LIME;


    public static Block GLOW_GREEN;
    public static Block GLOW_PINK;
    public static Block GLOW_YELLOW;
    public static Block GLOW_PURPLE;
    public static Block GLOW_RED;
    public static Block GLOW_ORANGE;
    public static Block GLOW_BLACK;
    public static Block GLOW_WHITE;
    public static Block GLOW_BROWN;
    public static Block GLOW_MAGENTA;
    public static Block GLOW_CYAN;
    public static Block GLOW_GRAY;
    public static Block GLOW_LIGHT_BLUE;
    public static Block GLOW_LIME;

    /*
    public static boolean checkMods(){
        return FabricLoader.getInstance().isModLoaded("hypcore");
    }
    */

    public static boolean colorlight=true;

    public static void registerBlocks(){
        DYABLE_WATER = Registry.register(Registry.BLOCK, new Identifier(ColoredWater.MOD_ID, "dyable_water"), new FluidBlock(ModFluids.STILL_DYABLE_WATER, FabricBlockSettings.copy(Blocks.WATER)){});
        GREEN = Registry.register(Registry.BLOCK, new Identifier(ColoredWater.MOD_ID, "green"), new FluidBlock(ModFluids.STILL_GREEN, FabricBlockSettings.copy(Blocks.WATER)){});
        PINK = Registry.register(Registry.BLOCK, new Identifier(ColoredWater.MOD_ID, "pink"), new FluidBlock(ModFluids.STILL_PINK, FabricBlockSettings.copy(Blocks.WATER)){});
        YELLOW = Registry.register(Registry.BLOCK, new Identifier(ColoredWater.MOD_ID, "yellow"), new FluidBlock(ModFluids.STILL_YELLOW, FabricBlockSettings.copy(Blocks.WATER)){});
        PURPLE = Registry.register(Registry.BLOCK, new Identifier(ColoredWater.MOD_ID,"purple"), new FluidBlock(ModFluids.STILL_PURPLE, FabricBlockSettings.copy(Blocks.WATER)){});
        RED = Registry.register(Registry.BLOCK, new Identifier(ColoredWater.MOD_ID, "red"), new FluidBlock(ModFluids.STILL_RED, FabricBlockSettings.copy(Blocks.WATER)){});
        ORANGE = Registry.register(Registry.BLOCK, new Identifier(ColoredWater.MOD_ID, "orange"), new FluidBlock(ModFluids.STILL_ORANGE, FabricBlockSettings.copy(Blocks.WATER)){});
        BLACK = Registry.register(Registry.BLOCK, new Identifier(ColoredWater.MOD_ID, "black"), new FluidBlock(ModFluids.STILL_BLACK, FabricBlockSettings.copy(Blocks.WATER)){});
        WHITE = Registry.register(Registry.BLOCK, new Identifier(ColoredWater.MOD_ID, "white"), new FluidBlock(ModFluids.STILL_WHITE, FabricBlockSettings.copy(Blocks.WATER)){});
        BROWN = Registry.register(Registry.BLOCK, new Identifier(ColoredWater.MOD_ID, "brown"), new FluidBlock(ModFluids.STILL_BROWN, FabricBlockSettings.copy(Blocks.WATER)){});
        MAGENTA = Registry.register(Registry.BLOCK, new Identifier(ColoredWater.MOD_ID, "magenta"), new FluidBlock(ModFluids.STILL_MAGENTA, FabricBlockSettings.copy(Blocks.WATER)){});
        CYAN = Registry.register(Registry.BLOCK, new Identifier(ColoredWater.MOD_ID, "cyan"), new FluidBlock(ModFluids.STILL_CYAN, FabricBlockSettings.copy(Blocks.WATER)){});
        GRAY = Registry.register(Registry.BLOCK, new Identifier(ColoredWater.MOD_ID, "gray"), new FluidBlock(ModFluids.STILL_GRAY, FabricBlockSettings.copy(Blocks.WATER)){});
        LIGHT_BLUE = Registry.register(Registry.BLOCK, new Identifier(ColoredWater.MOD_ID, "light_blue"), new FluidBlock(ModFluids.STILL_LIGHT_BLUE, FabricBlockSettings.copy(Blocks.WATER)){});
        LIME = Registry.register(Registry.BLOCK, new Identifier(ColoredWater.MOD_ID, "lime"), new FluidBlock(ModFluids.STILL_LIME, FabricBlockSettings.copy(Blocks.WATER)){});

        if(colorlight) {
            GLOW_GREEN = Registry.register(Registry.BLOCK, new Identifier(ColoredWater.MOD_ID, "glow_green"), new GlowingFluidBlock(ModFluids.GLOW_STILL_GREEN, FabricBlockSettings.copy(Blocks.WATER),0.368f, 0.486f, 0.086f));
            GLOW_PINK = Registry.register(Registry.BLOCK, new Identifier(ColoredWater.MOD_ID, "glow_pink"), new GlowingFluidBlock(ModFluids.GLOW_STILL_PINK, FabricBlockSettings.copy(Blocks.WATER),0.952f, 0.545f, 0.666f));
            GLOW_YELLOW = Registry.register(Registry.BLOCK, new Identifier(ColoredWater.MOD_ID, "glow_yellow"), new GlowingFluidBlock(ModFluids.GLOW_STILL_YELLOW, FabricBlockSettings.copy(Blocks.WATER),0.996f, 0.847f, 0.239f));
            GLOW_PURPLE = Registry.register(Registry.BLOCK, new Identifier(ColoredWater.MOD_ID, "glow_purple"), new GlowingFluidBlock(ModFluids.GLOW_STILL_PURPLE, FabricBlockSettings.copy(Blocks.WATER),0.537f, 0.196f, 0.721f));
            GLOW_RED = Registry.register(Registry.BLOCK, new Identifier(ColoredWater.MOD_ID, "glow_red"), new GlowingFluidBlock(ModFluids.GLOW_STILL_RED, FabricBlockSettings.copy(Blocks.WATER),0.690f, 0.180f, 0.149f));
            GLOW_ORANGE = Registry.register(Registry.BLOCK, new Identifier(ColoredWater.MOD_ID, "glow_orange"), new GlowingFluidBlock(ModFluids.GLOW_STILL_ORANGE, FabricBlockSettings.copy(Blocks.WATER),0.976f, 0.501f, 0.113f));
            GLOW_BLACK = Registry.register(Registry.BLOCK, new Identifier(ColoredWater.MOD_ID, "glow_black"), new GlowingFluidBlock(ModFluids.GLOW_STILL_BLACK, FabricBlockSettings.copy(Blocks.WATER),0.113f, 0.113f, 0.129f));
            GLOW_WHITE = Registry.register(Registry.BLOCK, new Identifier(ColoredWater.MOD_ID, "glow_white"), new GlowingFluidBlock(ModFluids.GLOW_STILL_WHITE, FabricBlockSettings.copy(Blocks.WATER),0.976f, 1f, 0.996f));
            GLOW_BROWN = Registry.register(Registry.BLOCK, new Identifier(ColoredWater.MOD_ID, "glow_brown"), new GlowingFluidBlock(ModFluids.GLOW_STILL_BROWN, FabricBlockSettings.copy(Blocks.WATER),0.513f, 0.329f, 0.196f));
            GLOW_MAGENTA = Registry.register(Registry.BLOCK, new Identifier(ColoredWater.MOD_ID, "glow_magenta"), new GlowingFluidBlock(ModFluids.GLOW_STILL_MAGENTA, FabricBlockSettings.copy(Blocks.WATER),0.780f, 0.305f, 0.741f));
            GLOW_CYAN = Registry.register(Registry.BLOCK, new Identifier(ColoredWater.MOD_ID, "glow_cyan"), new GlowingFluidBlock(ModFluids.GLOW_STILL_CYAN, FabricBlockSettings.copy(Blocks.WATER),0.086f, 0.611f, 0.611f));
            GLOW_GRAY = Registry.register(Registry.BLOCK, new Identifier(ColoredWater.MOD_ID, "glow_gray"), new GlowingFluidBlock(ModFluids.GLOW_STILL_GRAY, FabricBlockSettings.copy(Blocks.WATER),0.278f, 0.309f, 0.321f));
            GLOW_LIGHT_BLUE = Registry.register(Registry.BLOCK, new Identifier(ColoredWater.MOD_ID, "glow_light_blue"), new GlowingFluidBlock(ModFluids.GLOW_STILL_LIGHT_BLUE, FabricBlockSettings.copy(Blocks.WATER),0.227f, 0.701f, 0.854f));
            GLOW_LIME = Registry.register(Registry.BLOCK, new Identifier(ColoredWater.MOD_ID, "glow_lime"), new GlowingFluidBlock(ModFluids.GLOW_STILL_LIME, FabricBlockSettings.copy(Blocks.WATER),0.501f, 0.780f, 0.121f));
        }
        else{
            GLOW_GREEN = Registry.register(Registry.BLOCK, new Identifier(ColoredWater.MOD_ID, "glow_green"), new FluidBlock(ModFluids.GLOW_STILL_GREEN, FabricBlockSettings.copy(Blocks.WATER).luminance((state) -> 15)) {});
            GLOW_PINK = Registry.register(Registry.BLOCK, new Identifier(ColoredWater.MOD_ID, "glow_pink"), new FluidBlock(ModFluids.GLOW_STILL_PINK, FabricBlockSettings.copy(Blocks.WATER).luminance((state) -> 15)) {});
            GLOW_YELLOW = Registry.register(Registry.BLOCK, new Identifier(ColoredWater.MOD_ID, "glow_yellow"), new FluidBlock(ModFluids.GLOW_STILL_YELLOW, FabricBlockSettings.copy(Blocks.WATER).luminance((state) -> 15)) {});
            GLOW_PURPLE = Registry.register(Registry.BLOCK, new Identifier(ColoredWater.MOD_ID, "glow_purple"), new FluidBlock(ModFluids.GLOW_STILL_PURPLE, FabricBlockSettings.copy(Blocks.WATER).luminance((state) -> 15)) {});
            GLOW_RED = Registry.register(Registry.BLOCK, new Identifier(ColoredWater.MOD_ID, "glow_red"), new FluidBlock(ModFluids.GLOW_STILL_RED, FabricBlockSettings.copy(Blocks.WATER).luminance((state) -> 15)) {});
            GLOW_ORANGE = Registry.register(Registry.BLOCK, new Identifier(ColoredWater.MOD_ID, "glow_orange"), new FluidBlock(ModFluids.GLOW_STILL_ORANGE, FabricBlockSettings.copy(Blocks.WATER).luminance((state) -> 15)) {});
            GLOW_BLACK = Registry.register(Registry.BLOCK, new Identifier(ColoredWater.MOD_ID, "glow_black"), new FluidBlock(ModFluids.GLOW_STILL_BLACK, FabricBlockSettings.copy(Blocks.WATER).luminance((state) -> 15)) {});
            GLOW_WHITE = Registry.register(Registry.BLOCK, new Identifier(ColoredWater.MOD_ID, "glow_white"), new FluidBlock(ModFluids.GLOW_STILL_WHITE, FabricBlockSettings.copy(Blocks.WATER).luminance((state) -> 15)) {});
            GLOW_BROWN = Registry.register(Registry.BLOCK, new Identifier(ColoredWater.MOD_ID, "glow_brown"), new FluidBlock(ModFluids.GLOW_STILL_BROWN, FabricBlockSettings.copy(Blocks.WATER).luminance((state) -> 15)) {});
            GLOW_MAGENTA = Registry.register(Registry.BLOCK, new Identifier(ColoredWater.MOD_ID, "glow_magenta"), new FluidBlock(ModFluids.GLOW_STILL_MAGENTA, FabricBlockSettings.copy(Blocks.WATER).luminance((state) -> 15)) {});
            GLOW_CYAN = Registry.register(Registry.BLOCK, new Identifier(ColoredWater.MOD_ID, "glow_cyan"), new FluidBlock(ModFluids.GLOW_STILL_CYAN, FabricBlockSettings.copy(Blocks.WATER).luminance((state) -> 15)) {});
            GLOW_GRAY = Registry.register(Registry.BLOCK, new Identifier(ColoredWater.MOD_ID, "glow_gray"), new FluidBlock(ModFluids.GLOW_STILL_GRAY, FabricBlockSettings.copy(Blocks.WATER).luminance((state) -> 15)) {});
            GLOW_LIGHT_BLUE = Registry.register(Registry.BLOCK, new Identifier(ColoredWater.MOD_ID, "glow_light_blue"), new FluidBlock(ModFluids.GLOW_STILL_LIGHT_BLUE, FabricBlockSettings.copy(Blocks.WATER).luminance((state) -> 15)) {});
            GLOW_LIME = Registry.register(Registry.BLOCK, new Identifier(ColoredWater.MOD_ID, "glow_lime"), new FluidBlock(ModFluids.GLOW_STILL_LIME, FabricBlockSettings.copy(Blocks.WATER).luminance((state) -> 15)) {});
        }
    }
}
