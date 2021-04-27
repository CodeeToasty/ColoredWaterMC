package com.codeetoasty.colwater.registry;

import com.codeetoasty.colwater.ColoredWater;
import net.minecraft.fluid.Fluid;
import net.minecraft.fluid.Fluids;
import net.minecraft.fluid.WaterFluid;
import net.minecraft.item.BucketItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Items;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {

    public static Item DYABLE_WATER_BUCKET = new BucketItem(ModFluids.STILL_DYABLE_WATER,new Item.Settings().group(ItemGroup.DECORATIONS).maxCount(1));
    public static Item PINK_BUCKET = new BucketItem(ModFluids.STILL_PINK, new Item.Settings().group(ItemGroup.DECORATIONS).recipeRemainder(Items.BUCKET).maxCount(1));
    public static Item GREEN_BUCKET = new BucketItem(ModFluids.STILL_GREEN, new Item.Settings().group(ItemGroup.DECORATIONS).recipeRemainder(Items.BUCKET).maxCount(1));
    public static Item YELLOW_BUCKET = new BucketItem(ModFluids.STILL_YELLOW, new Item.Settings().group(ItemGroup.DECORATIONS).recipeRemainder(Items.BUCKET).maxCount(1));
    public static Item PURPLE_BUCKET = new BucketItem(ModFluids.STILL_PURPLE, new Item.Settings().group(ItemGroup.DECORATIONS).recipeRemainder(Items.BUCKET).maxCount(1));
    public static Item RED_BUCKET = new BucketItem(ModFluids.STILL_RED, new Item.Settings().group(ItemGroup.DECORATIONS).recipeRemainder(Items.BUCKET).maxCount(1));
    public static Item ORANGE_BUCKET = new BucketItem(ModFluids.STILL_ORANGE, new Item.Settings().group(ItemGroup.DECORATIONS).recipeRemainder(Items.BUCKET).maxCount(1));
    public static Item BLACK_BUCKET = new BucketItem(ModFluids.STILL_BLACK, new Item.Settings().group(ItemGroup.DECORATIONS).recipeRemainder(Items.BUCKET).maxCount(1));
    public static Item WHITE_BUCKET = new BucketItem(ModFluids.STILL_WHITE, new Item.Settings().group(ItemGroup.DECORATIONS).recipeRemainder(Items.BUCKET).maxCount(1));
    public static Item BROWN_BUCKET = new BucketItem(ModFluids.STILL_BROWN, new Item.Settings().group(ItemGroup.DECORATIONS).recipeRemainder(Items.BUCKET).maxCount(1));
    public static Item MAGENTA_BUCKET = new BucketItem(ModFluids.STILL_MAGENTA, new Item.Settings().group(ItemGroup.DECORATIONS).recipeRemainder(Items.BUCKET).maxCount(1));
    public static Item CYAN_BUCKET = new BucketItem(ModFluids.STILL_CYAN, new Item.Settings().group(ItemGroup.DECORATIONS).recipeRemainder(Items.BUCKET).maxCount(1));
    public static Item GRAY_BUCKET = new BucketItem(ModFluids.STILL_GRAY, new Item.Settings().group(ItemGroup.DECORATIONS).recipeRemainder(Items.BUCKET).maxCount(1));
    public static Item LIGHT_BLUE_BUCKET = new BucketItem(ModFluids.STILL_LIGHT_BLUE, new Item.Settings().group(ItemGroup.DECORATIONS).recipeRemainder(Items.BUCKET).maxCount(1));
    public static Item LIME_BUCKET = new BucketItem(ModFluids.STILL_LIME, new Item.Settings().group(ItemGroup.DECORATIONS).recipeRemainder(Items.BUCKET).maxCount(1));



    public static void registerItems() {
        DYABLE_WATER_BUCKET = Registry.register(Registry.ITEM, new Identifier(ColoredWater.MOD_ID, "dyable_water_bucket"), DYABLE_WATER_BUCKET);

        GREEN_BUCKET = Registry.register(Registry.ITEM, new Identifier(ColoredWater.MOD_ID, "green_bucket"), GREEN_BUCKET);
        PINK_BUCKET = Registry.register(Registry.ITEM, new Identifier(ColoredWater.MOD_ID, "pink_bucket"), PINK_BUCKET );
        YELLOW_BUCKET = Registry.register(Registry.ITEM, new Identifier(ColoredWater.MOD_ID, "yellow_bucket"), YELLOW_BUCKET );
        PURPLE_BUCKET = Registry.register(Registry.ITEM,new Identifier(ColoredWater.MOD_ID,"purple_bucket"), PURPLE_BUCKET);
        RED_BUCKET = Registry.register(Registry.ITEM, new Identifier(ColoredWater.MOD_ID, "red_bucket"), RED_BUCKET );
        ORANGE_BUCKET = Registry.register(Registry.ITEM, new Identifier(ColoredWater.MOD_ID, "orange_bucket"), ORANGE_BUCKET );
        BLACK_BUCKET = Registry.register(Registry.ITEM, new Identifier(ColoredWater.MOD_ID, "black_bucket"), BLACK_BUCKET );
        WHITE_BUCKET = Registry.register(Registry.ITEM, new Identifier(ColoredWater.MOD_ID, "white_bucket"), WHITE_BUCKET );
        BROWN_BUCKET = Registry.register(Registry.ITEM, new Identifier(ColoredWater.MOD_ID, "brown_bucket"), BROWN_BUCKET );
        MAGENTA_BUCKET = Registry.register(Registry.ITEM, new Identifier(ColoredWater.MOD_ID, "magenta_bucket"), MAGENTA_BUCKET );
        CYAN_BUCKET = Registry.register(Registry.ITEM, new Identifier(ColoredWater.MOD_ID, "cyan_bucket"), CYAN_BUCKET );
        GRAY_BUCKET = Registry.register(Registry.ITEM, new Identifier(ColoredWater.MOD_ID, "gray_bucket"), GRAY_BUCKET );
        LIGHT_BLUE_BUCKET = Registry.register(Registry.ITEM, new Identifier(ColoredWater.MOD_ID, "light_blue_bucket"), LIGHT_BLUE_BUCKET );
        LIME_BUCKET = Registry.register(Registry.ITEM, new Identifier(ColoredWater.MOD_ID, "lime_bucket"), LIME_BUCKET );



    }
}
