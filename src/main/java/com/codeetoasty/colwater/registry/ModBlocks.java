package com.codeetoasty.colwater.registry;

import com.codeetoasty.colwater.ColoredWater;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.FluidBlock;
import net.minecraft.fluid.FlowableFluid;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;


public class ModBlocks {
    public static Block DYABLE_WATER = register("dyable_water",ModFluids.STILL_DYABLE_WATER);
    public static Block GREEN = register("green",ModFluids.STILL_GREEN);
    public static Block PINK = register("pink",ModFluids.STILL_PINK);
    public static Block YELLOW = register("yellow",ModFluids.STILL_YELLOW);
    public static Block PURPLE = register("purple",ModFluids.STILL_PURPLE);
    public static Block RED = register("red",ModFluids.STILL_RED);
    public static Block ORANGE = register("orange",ModFluids.STILL_ORANGE);
    public static Block BLACK = register("black",ModFluids.STILL_BLACK);
    public static Block WHITE = register("white",ModFluids.STILL_WHITE);
    public static Block BROWN = register("brown",ModFluids.STILL_BROWN);
    public static Block MAGENTA = register("magenta",ModFluids.STILL_MAGENTA);
    public static Block CYAN = register("cyan",ModFluids.STILL_CYAN);
    public static Block GRAY = register("gray",ModFluids.STILL_GRAY);
    public static Block LIGHT_BLUE = register("light_blue",ModFluids.STILL_LIGHT_BLUE);
    public static Block LIME = register("lime",ModFluids.STILL_LIME);

    public static Block GLOW_GREEN = registerGlow("glow_green",ModFluids.GLOW_STILL_GREEN);
    public static Block GLOW_PINK = registerGlow("glow_pink",ModFluids.GLOW_STILL_PINK);
    public static Block GLOW_YELLOW = registerGlow("glow_yellow",ModFluids.GLOW_STILL_YELLOW);
    public static Block GLOW_PURPLE = registerGlow("glow_purple",ModFluids.GLOW_STILL_PURPLE);
    public static Block GLOW_RED = registerGlow("glow_red",ModFluids.GLOW_STILL_RED);
    public static Block GLOW_ORANGE = registerGlow("glow_orange",ModFluids.GLOW_STILL_ORANGE);
    public static Block GLOW_BLACK = registerGlow("glow_black",ModFluids.GLOW_STILL_BLACK);
    public static Block GLOW_WHITE = registerGlow("glow_white",ModFluids.GLOW_STILL_WHITE);
    public static Block GLOW_BROWN = registerGlow("glow_brown",ModFluids.GLOW_STILL_BROWN);
    public static Block GLOW_MAGENTA = registerGlow("glow_magenta",ModFluids.GLOW_STILL_MAGENTA);
    public static Block GLOW_CYAN = registerGlow("glow_cyan",ModFluids.GLOW_STILL_CYAN);
    public static Block GLOW_GRAY = registerGlow("glow_gray",ModFluids.GLOW_STILL_GRAY);
    public static Block GLOW_LIGHT_BLUE = registerGlow("glow_light_blue",ModFluids.GLOW_FLOWING_LIGHT_BLUE);
    public static Block GLOW_LIME = registerGlow("glow_lime",ModFluids.GLOW_STILL_LIME);

    public static void registerBlocks(){
    }

    public static Block register(String name, FlowableFluid flowableFluid){
        return Registry.register(Registries.BLOCK, new Identifier(ColoredWater.MOD_ID, name),
                new FluidBlock(flowableFluid, FabricBlockSettings.copy(Blocks.WATER)){});
    }

    public static Block registerGlow(String name, FlowableFluid flowableFluid){
        return Registry.register(Registries.BLOCK, new Identifier(ColoredWater.MOD_ID, name),
                new FluidBlock(flowableFluid, FabricBlockSettings.copy(Blocks.WATER).luminance((state) -> 15)) {});
    }
}
