package com.codeetoasty.colwater.registry;


import com.codeetoasty.colwater.fluid.*;
import com.codeetoasty.colwater.fluid.coloredfluid.*;
import com.codeetoasty.colwater.fluid.glowingfluid.GlowLimeWater;
import net.minecraft.fluid.FlowableFluid;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import com.codeetoasty.colwater.ColoredWater;

public class ModFluids {

    public static FlowableFluid STILL_DYABLE_WATER;
    public static FlowableFluid FLOWING_DYABLE_WATER;

    public static FlowableFluid STILL_GREEN;
    public static FlowableFluid FLOWING_GREEN;
    public static FlowableFluid STILL_PINK;
    public static FlowableFluid FLOWING_PINK;
    public static FlowableFluid STILL_YELLOW;
    public static FlowableFluid FLOWING_YELLOW;
    public static FlowableFluid STILL_PURPLE;
    public static FlowableFluid FLOWING_PURPLE;
    public static FlowableFluid STILL_RED;
    public static FlowableFluid FLOWING_RED;
    public static FlowableFluid STILL_ORANGE;
    public static FlowableFluid FLOWING_ORANGE;
    public static FlowableFluid STILL_BLACK;
    public static FlowableFluid FLOWING_BLACK;
    public static FlowableFluid STILL_WHITE;
    public static FlowableFluid FLOWING_WHITE;
    public static FlowableFluid STILL_BROWN;
    public static FlowableFluid FLOWING_BROWN;
    public static FlowableFluid STILL_MAGENTA;
    public static FlowableFluid FLOWING_MAGENTA;
    public static FlowableFluid STILL_CYAN;
    public static FlowableFluid FLOWING_CYAN;
    public static FlowableFluid STILL_GRAY;
    public static FlowableFluid FLOWING_GRAY;
    public static FlowableFluid STILL_LIGHT_BLUE;
    public static FlowableFluid FLOWING_LIGHT_BLUE;
    public static FlowableFluid STILL_LIME;
    public static FlowableFluid FLOWING_LIME;

    public static void registerFluids(){
        STILL_DYABLE_WATER = Registry.register(Registry.FLUID, new Identifier(ColoredWater.MOD_ID, "dyable_water.json"), new DyableWater.Still());
        FLOWING_DYABLE_WATER = Registry.register(Registry.FLUID, new Identifier(ColoredWater.MOD_ID, "flowing_dyable_water"), new DyableWater.Flowing());

        STILL_GREEN = Registry.register(Registry.FLUID, new Identifier(ColoredWater.MOD_ID, "green"), new GreenWater.Still());
        FLOWING_GREEN = Registry.register(Registry.FLUID, new Identifier(ColoredWater.MOD_ID, "flowing_green"), new GreenWater.Flowing());
        STILL_PINK = Registry.register(Registry.FLUID, new Identifier(ColoredWater.MOD_ID, "pink"), new PinkWater.Still());
        FLOWING_PINK = Registry.register(Registry.FLUID, new Identifier(ColoredWater.MOD_ID, "flowing_pink"), new PinkWater.Flowing());
        STILL_YELLOW = Registry.register(Registry.FLUID, new Identifier(ColoredWater.MOD_ID, "yellow"), new YellowWater.Still());
        FLOWING_YELLOW = Registry.register(Registry.FLUID, new Identifier(ColoredWater.MOD_ID, "flowing_yellow"), new YellowWater.Flowing());
        STILL_PURPLE = Registry.register(Registry.FLUID, new Identifier(ColoredWater.MOD_ID, "purple"), new PurpleWater.Still());
        FLOWING_PURPLE = Registry.register(Registry.FLUID, new Identifier(ColoredWater.MOD_ID, "flowing_purple"), new PurpleWater.Flowing());
        STILL_RED = Registry.register(Registry.FLUID, new Identifier(ColoredWater.MOD_ID, "red"), new RedWater.Still());
        FLOWING_RED = Registry.register(Registry.FLUID, new Identifier(ColoredWater.MOD_ID, "flowing_red"), new RedWater.Flowing());
        STILL_ORANGE = Registry.register(Registry.FLUID, new Identifier(ColoredWater.MOD_ID, "orange"), new OrangeWater.Still());
        FLOWING_ORANGE = Registry.register(Registry.FLUID, new Identifier(ColoredWater.MOD_ID, "flowing_orange"), new OrangeWater.Flowing());

        STILL_BLACK = Registry.register(Registry.FLUID, new Identifier(ColoredWater.MOD_ID, "black"), new BlackWater.Still());
        FLOWING_BLACK = Registry.register(Registry.FLUID, new Identifier(ColoredWater.MOD_ID, "flowing_black"), new BlackWater.Flowing());
        STILL_WHITE = Registry.register(Registry.FLUID, new Identifier(ColoredWater.MOD_ID, "white"), new WhiteWater.Still());
        FLOWING_WHITE = Registry.register(Registry.FLUID, new Identifier(ColoredWater.MOD_ID, "flowing_white"), new WhiteWater.Flowing());
        STILL_BROWN = Registry.register(Registry.FLUID, new Identifier(ColoredWater.MOD_ID, "brown"), new BrownWater.Still());
        FLOWING_BROWN = Registry.register(Registry.FLUID, new Identifier(ColoredWater.MOD_ID, "flowing_brown"), new BrownWater.Flowing());
        STILL_MAGENTA = Registry.register(Registry.FLUID, new Identifier(ColoredWater.MOD_ID, "magenta"), new MagentaWater.Still());
        FLOWING_MAGENTA = Registry.register(Registry.FLUID, new Identifier(ColoredWater.MOD_ID, "flowing_magenta"), new MagentaWater.Flowing());
        STILL_CYAN = Registry.register(Registry.FLUID, new Identifier(ColoredWater.MOD_ID, "cyan"), new CyanWater.Still());
        FLOWING_CYAN = Registry.register(Registry.FLUID, new Identifier(ColoredWater.MOD_ID, "flowing_cyan"), new CyanWater.Flowing());
        STILL_GRAY = Registry.register(Registry.FLUID, new Identifier(ColoredWater.MOD_ID, "gray"), new GrayWater.Still());
        FLOWING_GRAY = Registry.register(Registry.FLUID, new Identifier(ColoredWater.MOD_ID, "flowing_gray"), new GrayWater.Flowing());
        STILL_LIGHT_BLUE = Registry.register(Registry.FLUID, new Identifier(ColoredWater.MOD_ID, "light_blue"), new LightBlueWater.Still());
        FLOWING_LIGHT_BLUE = Registry.register(Registry.FLUID, new Identifier(ColoredWater.MOD_ID, "flowing_light_blue"), new LightBlueWater.Flowing());

        STILL_LIME = Registry.register(Registry.FLUID, new Identifier(ColoredWater.MOD_ID, "lime"), new LimeWater.Still());
        FLOWING_LIME = Registry.register(Registry.FLUID, new Identifier(ColoredWater.MOD_ID, "flowing_lime"), new LimeWater.Flowing());
    }
}