package com.codeetoasty.colwater.registry;


import com.codeetoasty.colwater.fluid.*;
import com.codeetoasty.colwater.fluid.coloredfluid.*;
import com.codeetoasty.colwater.fluid.glowingfluid.*;
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



    public static FlowableFluid GLOW_STILL_GREEN;
    public static FlowableFluid GLOW_FLOWING_GREEN;
    public static FlowableFluid GLOW_STILL_PINK;
    public static FlowableFluid GLOW_FLOWING_PINK;
    public static FlowableFluid GLOW_STILL_YELLOW;
    public static FlowableFluid GLOW_FLOWING_YELLOW;
    public static FlowableFluid GLOW_STILL_PURPLE;
    public static FlowableFluid GLOW_FLOWING_PURPLE;
    public static FlowableFluid GLOW_STILL_RED;
    public static FlowableFluid GLOW_FLOWING_RED;
    public static FlowableFluid GLOW_STILL_ORANGE;
    public static FlowableFluid GLOW_FLOWING_ORANGE;
    public static FlowableFluid GLOW_STILL_BLACK;
    public static FlowableFluid GLOW_FLOWING_BLACK;
    public static FlowableFluid GLOW_STILL_WHITE;
    public static FlowableFluid GLOW_FLOWING_WHITE;
    public static FlowableFluid GLOW_STILL_BROWN;
    public static FlowableFluid GLOW_FLOWING_BROWN;
    public static FlowableFluid GLOW_STILL_MAGENTA;
    public static FlowableFluid GLOW_FLOWING_MAGENTA;
    public static FlowableFluid GLOW_STILL_CYAN;
    public static FlowableFluid GLOW_FLOWING_CYAN;
    public static FlowableFluid GLOW_STILL_GRAY;
    public static FlowableFluid GLOW_FLOWING_GRAY;
    public static FlowableFluid GLOW_STILL_LIGHT_BLUE;
    public static FlowableFluid GLOW_FLOWING_LIGHT_BLUE;
    public static FlowableFluid GLOW_STILL_LIME;
    public static FlowableFluid GLOW_FLOWING_LIME;

    public static void registerFluids(){
        STILL_DYABLE_WATER = Registry.register(Registry.FLUID, new Identifier(ColoredWater.MOD_ID, "dyable_water"), new DyableWater.Still());
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


        GLOW_STILL_GREEN = Registry.register(Registry.FLUID, new Identifier(ColoredWater.MOD_ID, "glow_green"), new GlowGreenWater.Still());
        GLOW_FLOWING_GREEN = Registry.register(Registry.FLUID, new Identifier(ColoredWater.MOD_ID, "glow_flowing_green"), new GlowGreenWater.Flowing());
        GLOW_STILL_PINK = Registry.register(Registry.FLUID, new Identifier(ColoredWater.MOD_ID, "glow_pink"), new GlowPinkWater.Still());
        GLOW_FLOWING_PINK = Registry.register(Registry.FLUID, new Identifier(ColoredWater.MOD_ID, "glow_flowing_pink"), new GlowPinkWater.Flowing());
        GLOW_STILL_YELLOW = Registry.register(Registry.FLUID, new Identifier(ColoredWater.MOD_ID, "glow_yellow"), new GlowYellowWater.Still());
        GLOW_FLOWING_YELLOW = Registry.register(Registry.FLUID, new Identifier(ColoredWater.MOD_ID, "glow_flowing_yellow"), new GlowYellowWater.Flowing());
        GLOW_STILL_PURPLE = Registry.register(Registry.FLUID, new Identifier(ColoredWater.MOD_ID, "glow_purple"), new GlowPurpleWater.Still());
        GLOW_FLOWING_PURPLE = Registry.register(Registry.FLUID, new Identifier(ColoredWater.MOD_ID, "glow_flowing_purple"), new GlowPurpleWater.Flowing());
        GLOW_STILL_RED = Registry.register(Registry.FLUID, new Identifier(ColoredWater.MOD_ID, "glow_red"), new GlowRedWater.Still());
        GLOW_FLOWING_RED = Registry.register(Registry.FLUID, new Identifier(ColoredWater.MOD_ID, "glow_flowing_red"), new GlowRedWater.Flowing());
        GLOW_STILL_ORANGE = Registry.register(Registry.FLUID, new Identifier(ColoredWater.MOD_ID, "glow_orange"), new GlowOrangeWater.Still());
        GLOW_FLOWING_ORANGE = Registry.register(Registry.FLUID, new Identifier(ColoredWater.MOD_ID, "glow_flowing_orange"), new GlowOrangeWater.Flowing());
        GLOW_STILL_BLACK = Registry.register(Registry.FLUID, new Identifier(ColoredWater.MOD_ID, "glow_black"), new GlowBlackWater.Still());
        GLOW_FLOWING_BLACK = Registry.register(Registry.FLUID, new Identifier(ColoredWater.MOD_ID, "glow_flowing_black"), new GlowBlackWater.Flowing());
        GLOW_STILL_WHITE = Registry.register(Registry.FLUID, new Identifier(ColoredWater.MOD_ID, "glow_white"), new GlowWhiteWater.Still());
        GLOW_FLOWING_WHITE = Registry.register(Registry.FLUID, new Identifier(ColoredWater.MOD_ID, "glow_flowing_white"), new GlowWhiteWater.Flowing());
        GLOW_STILL_BROWN = Registry.register(Registry.FLUID, new Identifier(ColoredWater.MOD_ID, "glow_brown"), new GlowBrownWater.Still());
        GLOW_FLOWING_BROWN = Registry.register(Registry.FLUID, new Identifier(ColoredWater.MOD_ID, "glow_flowing_brown"), new GlowBrownWater.Flowing());
        GLOW_STILL_MAGENTA = Registry.register(Registry.FLUID, new Identifier(ColoredWater.MOD_ID, "glow_magenta"), new GlowMagentaWater.Still());
        GLOW_FLOWING_MAGENTA = Registry.register(Registry.FLUID, new Identifier(ColoredWater.MOD_ID, "glow_flowing_magenta"), new GlowMagentaWater.Flowing());
        GLOW_STILL_CYAN = Registry.register(Registry.FLUID, new Identifier(ColoredWater.MOD_ID, "glow_cyan"), new GlowCyanWater.Still());
        GLOW_FLOWING_CYAN = Registry.register(Registry.FLUID, new Identifier(ColoredWater.MOD_ID, "glow_flowing_cyan"), new GlowCyanWater.Flowing());
        GLOW_STILL_GRAY = Registry.register(Registry.FLUID, new Identifier(ColoredWater.MOD_ID, "glow_gray"), new GlowGrayWater.Still());
        GLOW_FLOWING_GRAY = Registry.register(Registry.FLUID, new Identifier(ColoredWater.MOD_ID, "glow_flowing_gray"), new GlowGrayWater.Flowing());
        GLOW_STILL_LIGHT_BLUE = Registry.register(Registry.FLUID, new Identifier(ColoredWater.MOD_ID, "glow_light_blue"), new GlowLightBlueWater.Still());
        GLOW_FLOWING_LIGHT_BLUE = Registry.register(Registry.FLUID, new Identifier(ColoredWater.MOD_ID, "glow_flowing_light_blue"), new GlowLightBlueWater.Flowing());
        GLOW_STILL_LIME = Registry.register(Registry.FLUID, new Identifier(ColoredWater.MOD_ID, "glow_lime"), new GlowLimeWater.Still());
        GLOW_FLOWING_LIME = Registry.register(Registry.FLUID, new Identifier(ColoredWater.MOD_ID, "glow_flowing_lime"), new GlowLimeWater.Flowing());

    }
}