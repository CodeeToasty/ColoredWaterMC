package com.codeetoasty.colwater.registry;


import com.codeetoasty.colwater.fluid.*;
import com.codeetoasty.colwater.fluid.coloredfluid.*;
import com.codeetoasty.colwater.fluid.glowingfluid.*;
import net.minecraft.fluid.FlowableFluid;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import com.codeetoasty.colwater.ColoredWater;

public class ModFluids {

    public static FlowableFluid STILL_DYABLE_WATER = register("dyable_water",new DyableWater.Still());
    public static FlowableFluid FLOWING_DYABLE_WATER = register("flowing_dyable_water",new DyableWater.Flowing());

    public static FlowableFluid STILL_GREEN = register("green", new GreenWater.Still());
    public static FlowableFluid FLOWING_GREEN = register("flowing_green",new GreenWater.Flowing());
    public static FlowableFluid STILL_PINK = register("pink",new PinkWater.Still());
    public static FlowableFluid FLOWING_PINK = register("flowing_pink",new PinkWater.Flowing());
    public static FlowableFluid STILL_YELLOW = register("yellow",new YellowWater.Still());
    public static FlowableFluid FLOWING_YELLOW = register("flowing_yellow",new YellowWater.Flowing());
    public static FlowableFluid STILL_PURPLE = register("purple",new PurpleWater.Still());
    public static FlowableFluid FLOWING_PURPLE = register("flowing_purple",new PurpleWater.Flowing());
    public static FlowableFluid STILL_RED = register("red",new RedWater.Still());
    public static FlowableFluid FLOWING_RED = register("flowing_red",new RedWater.Flowing());
    public static FlowableFluid STILL_ORANGE = register("orange",new OrangeWater.Still());
    public static FlowableFluid FLOWING_ORANGE = register("flowing_orange",new OrangeWater.Flowing());
    public static FlowableFluid STILL_BLACK = register("black",new BlackWater.Still());
    public static FlowableFluid FLOWING_BLACK = register("flowing_black", new BlackWater.Flowing());
    public static FlowableFluid STILL_WHITE = register("white",new WhiteWater.Still());
    public static FlowableFluid FLOWING_WHITE = register("flowing_white",new WhiteWater.Flowing());
    public static FlowableFluid STILL_BROWN = register("brown", new BrownWater.Still());
    public static FlowableFluid FLOWING_BROWN = register("flowing_brown",new BrownWater.Flowing());
    public static FlowableFluid STILL_MAGENTA = register("magenta",new MagentaWater.Still());
    public static FlowableFluid FLOWING_MAGENTA = register("flowing_magenta", new MagentaWater.Flowing());
    public static FlowableFluid STILL_CYAN = register("cyan",new CyanWater.Still());
    public static FlowableFluid FLOWING_CYAN = register("flowing_cyan",new CyanWater.Flowing());
    public static FlowableFluid STILL_GRAY = register("gray",new GrayWater.Still());
    public static FlowableFluid FLOWING_GRAY = register("flowing_gray",new GrayWater.Flowing());
    public static FlowableFluid STILL_LIGHT_BLUE = register("light_blue",new LightBlueWater.Still());
    public static FlowableFluid FLOWING_LIGHT_BLUE = register("flowing_light_blue",new LightBlueWater.Flowing());
    public static FlowableFluid STILL_LIME = register("lime",new LimeWater.Still());
    public static FlowableFluid FLOWING_LIME = register("flowing_lime",new LimeWater.Flowing());



    public static FlowableFluid GLOW_STILL_GREEN = register("glow_green", new GlowGreenWater.Still());
    public static FlowableFluid GLOW_FLOWING_GREEN = register("glow_flowing_green",new GlowGreenWater.Flowing());
    public static FlowableFluid GLOW_STILL_PINK = register("glow_pink",new GlowPinkWater.Still());
    public static FlowableFluid GLOW_FLOWING_PINK = register("glow_flowing_pink",new GlowPinkWater.Flowing());
    public static FlowableFluid GLOW_STILL_YELLOW = register("glow_yellow", new GlowYellowWater.Still());
    public static FlowableFluid GLOW_FLOWING_YELLOW = register("glow_flowing_yellow",new GlowYellowWater.Flowing());
    public static FlowableFluid GLOW_STILL_PURPLE = register("glow_purple",new GlowPurpleWater.Still());
    public static FlowableFluid GLOW_FLOWING_PURPLE = register("glow_flowing_purple", new GlowPurpleWater.Flowing());
    public static FlowableFluid GLOW_STILL_RED = register("glow_red",new GlowRedWater.Still());
    public static FlowableFluid GLOW_FLOWING_RED = register("glow_flowing_red",new GlowRedWater.Flowing());
    public static FlowableFluid GLOW_STILL_ORANGE = register("glow_orange",new GlowOrangeWater.Still());
    public static FlowableFluid GLOW_FLOWING_ORANGE = register("glow_flowing_orange", new GlowOrangeWater.Flowing());
    public static FlowableFluid GLOW_STILL_BLACK = register("glow_black",new GlowBlackWater.Still());
    public static FlowableFluid GLOW_FLOWING_BLACK = register("glow_flowing_black",new GlowBlackWater.Flowing());
    public static FlowableFluid GLOW_STILL_WHITE = register("glow_white", new GlowWhiteWater.Still());
    public static FlowableFluid GLOW_FLOWING_WHITE = register("glow_flowing_white", new GlowWhiteWater.Flowing());
    public static FlowableFluid GLOW_STILL_BROWN = register("glow_brown", new GlowBrownWater.Still());
    public static FlowableFluid GLOW_FLOWING_BROWN = register("glow_flowing_brown",new GlowBrownWater.Flowing());
    public static FlowableFluid GLOW_STILL_MAGENTA = register("glow_magenta",new GlowMagentaWater.Still());
    public static FlowableFluid GLOW_FLOWING_MAGENTA = register("glow_flowing_magenta",new GlowMagentaWater.Flowing());
    public static FlowableFluid GLOW_STILL_CYAN = register("glow_cyan",new GlowCyanWater.Still());
    public static FlowableFluid GLOW_FLOWING_CYAN = register("glow_flowing_cyan", new GlowCyanWater.Flowing());
    public static FlowableFluid GLOW_STILL_GRAY = register("glow_gray",new GlowGrayWater.Still());
    public static FlowableFluid GLOW_FLOWING_GRAY = register("glow_flowing_gray",new GlowGrayWater.Flowing());
    public static FlowableFluid GLOW_STILL_LIGHT_BLUE = register("glow_light_blue",new GlowLightBlueWater.Still());
    public static FlowableFluid GLOW_FLOWING_LIGHT_BLUE = register("glow_flowing_light_blue",new GlowLightBlueWater.Flowing());
    public static FlowableFluid GLOW_STILL_LIME = register("glow_lime",new GlowLimeWater.Still());
    public static FlowableFluid GLOW_FLOWING_LIME = register("glow_flowing_lime",new GlowLimeWater.Flowing());

    public static void registerFluids(){

    }

    public static FlowableFluid register(String name,FlowableFluid flowableFluid){
        return Registry.register(Registry.FLUID,new Identifier(ColoredWater.MOD_ID,name),flowableFluid);
    }
}