package com.codeetoasty.colwater.registry;

import com.codeetoasty.colwater.ColoredWater;
import static com.codeetoasty.colwater.registry.ModFluids.*;
import net.minecraft.fluid.FlowableFluid;
import net.minecraft.item.BucketItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Items;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {

    public static Item DYABLE_WATER_BUCKET = register("dyable_water_bucker",STILL_DYABLE_WATER);
    public static Item PINK_BUCKET = register("pink_bucket",STILL_PINK);
    public static Item GREEN_BUCKET = register("green_bucket",STILL_GREEN);
    public static Item YELLOW_BUCKET = register("yellow_bucket",STILL_YELLOW);
    public static Item PURPLE_BUCKET = register("purple_bucket",STILL_PURPLE);
    public static Item RED_BUCKET =register("red_bucket",STILL_RED);
    public static Item ORANGE_BUCKET = register("orange_bucket",STILL_ORANGE);
    public static Item BLACK_BUCKET = register("black_bucket",STILL_BLACK);
    public static Item WHITE_BUCKET = register("white_bucket",STILL_WHITE);
    public static Item BROWN_BUCKET = register("brown_bucket",STILL_BROWN);
    public static Item MAGENTA_BUCKET = register("magenta_bucket",STILL_MAGENTA);
    public static Item CYAN_BUCKET =register("cyan_bucket",STILL_CYAN);
    public static Item GRAY_BUCKET = register("gray_bucket",STILL_GRAY);
    public static Item LIGHT_BLUE_BUCKET = register("light_blue_bucket",STILL_LIGHT_BLUE);
    public static Item LIME_BUCKET = register("lime_bucket",STILL_LIME);


    public static Item GLOW_PINK_BUCKET = register("glow_pink_bucket",GLOW_STILL_PINK);
    public static Item GLOW_GREEN_BUCKET = register("glow_green_bucket",GLOW_STILL_GREEN);
    public static Item GLOW_YELLOW_BUCKET = register("glow_yellow_bucket",GLOW_STILL_YELLOW);
    public static Item GLOW_PURPLE_BUCKET = register("glow_purple_bucket",GLOW_STILL_PURPLE);
    public static Item GLOW_RED_BUCKET = register("glow_red_bucket",GLOW_STILL_RED);
    public static Item GLOW_ORANGE_BUCKET = register("glow_orange_bucket",GLOW_STILL_ORANGE);
    public static Item GLOW_BLACK_BUCKET = register("glow_black_bucket",GLOW_STILL_BLACK);
    public static Item GLOW_WHITE_BUCKET = register("glow_white_bucket",GLOW_STILL_WHITE);
    public static Item GLOW_BROWN_BUCKET = register("glow_brown_bucket",GLOW_STILL_BROWN);
    public static Item GLOW_MAGENTA_BUCKET = register("glow_magenta_bucket",GLOW_STILL_MAGENTA);
    public static Item GLOW_CYAN_BUCKET = register("glow_cyan_bucket",GLOW_STILL_CYAN);
    public static Item GLOW_GRAY_BUCKET = register("glow_light_bucket",GLOW_STILL_GRAY);
    public static Item GLOW_LIGHT_BLUE_BUCKET = register("glow_light_blue_bucket",GLOW_STILL_LIGHT_BLUE);
    public static Item GLOW_LIME_BUCKET = register("glow_lime_bucket",GLOW_STILL_LIME);


    public static void registerItems(){

    }

    public static Item register(String name, FlowableFluid fluid){
        return Registry.register(Registry.ITEM, new Identifier(ColoredWater.MOD_ID, name),
                new BucketItem(fluid, new Item.Settings().group(ItemGroup.DECORATIONS)
                        .recipeRemainder(Items.BUCKET).maxCount(1)));
    }
}
