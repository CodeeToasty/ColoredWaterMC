package com.codeetoasty.colwater.render;

import static com.codeetoasty.colwater.registry.ModParticles.*;

import com.codeetoasty.colwater.particle.ColBubble;
import com.codeetoasty.colwater.particle.ColSplash;
import com.codeetoasty.colwater.particle.ColSusp;
import com.codeetoasty.colwater.registry.ModFluids;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.client.particle.v1.ParticleFactoryRegistry;
import net.fabricmc.fabric.api.client.render.fluid.v1.FluidRenderHandlerRegistry;
import net.fabricmc.fabric.api.client.render.fluid.v1.SimpleFluidRenderHandler;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.particle.DefaultParticleType;
import net.minecraft.util.Identifier;


import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;


public class ColoredWaterClient implements ClientModInitializer {

    public static Map<String, List<Float>> colors = createMap();

    @Override
    public void onInitializeClient() {

        FluidRenderHandlerRegistry.INSTANCE.register(ModFluids.STILL_DYABLE_WATER, ModFluids.FLOWING_DYABLE_WATER, new SimpleFluidRenderHandler(
                new Identifier("minecraft:block/water_still"),
                new Identifier("minecraft:block/water_flow"),
                0xffffff
        ));
        BlockRenderLayerMap.INSTANCE.putFluids(RenderLayer.getSolid(), ModFluids.STILL_DYABLE_WATER, ModFluids.FLOWING_DYABLE_WATER);

        FluidRenderHandlerRegistry.INSTANCE.register(ModFluids.STILL_BLACK, ModFluids.FLOWING_BLACK, new SimpleFluidRenderHandler(
                new Identifier("minecraft:block/water_still"),
                new Identifier("minecraft:block/water_flow"),
                0x1d1d21
        ));
        BlockRenderLayerMap.INSTANCE.putFluids(RenderLayer.getTranslucent(), ModFluids.STILL_BLACK, ModFluids.FLOWING_BLACK);

        FluidRenderHandlerRegistry.INSTANCE.register(ModFluids.STILL_BROWN, ModFluids.FLOWING_BROWN, new SimpleFluidRenderHandler(
                new Identifier("minecraft:block/water_still"),
                new Identifier("minecraft:block/water_flow"),
                0x835432
        ));
        BlockRenderLayerMap.INSTANCE.putFluids(RenderLayer.getTranslucent(), ModFluids.STILL_BROWN, ModFluids.FLOWING_BROWN);

        FluidRenderHandlerRegistry.INSTANCE.register(ModFluids.STILL_CYAN, ModFluids.FLOWING_CYAN, new SimpleFluidRenderHandler(
                new Identifier("minecraft:block/water_still"),
                new Identifier("minecraft:block/water_flow"),
                0x169c9c
        ));
        BlockRenderLayerMap.INSTANCE.putFluids(RenderLayer.getTranslucent(), ModFluids.STILL_CYAN, ModFluids.FLOWING_CYAN);

        FluidRenderHandlerRegistry.INSTANCE.register(ModFluids.STILL_GRAY, ModFluids.FLOWING_GRAY, new SimpleFluidRenderHandler(
                new Identifier("minecraft:block/water_still"),
                new Identifier("minecraft:block/water_flow"),
                0x474f52
        ));
        BlockRenderLayerMap.INSTANCE.putFluids(RenderLayer.getTranslucent(), ModFluids.STILL_GRAY, ModFluids.FLOWING_GRAY);

        FluidRenderHandlerRegistry.INSTANCE.register(ModFluids.STILL_GREEN, ModFluids.FLOWING_GREEN, new SimpleFluidRenderHandler(
                new Identifier("minecraft:block/water_still"),
                new Identifier("minecraft:block/water_flow"),
                0x5e7c16
        ));
        BlockRenderLayerMap.INSTANCE.putFluids(RenderLayer.getTranslucent(), ModFluids.STILL_GREEN, ModFluids.FLOWING_GREEN);

        FluidRenderHandlerRegistry.INSTANCE.register(ModFluids.STILL_LIGHT_BLUE, ModFluids.FLOWING_LIGHT_BLUE, new SimpleFluidRenderHandler(
                new Identifier("minecraft:block/water_still"),
                new Identifier("minecraft:block/water_flow"),
                0x3ab3da
        ));
        BlockRenderLayerMap.INSTANCE.putFluids(RenderLayer.getTranslucent(), ModFluids.STILL_LIGHT_BLUE, ModFluids.FLOWING_LIGHT_BLUE);

        FluidRenderHandlerRegistry.INSTANCE.register(ModFluids.STILL_LIME, ModFluids.FLOWING_LIME, new SimpleFluidRenderHandler(
                new Identifier("minecraft:block/water_still"),
                new Identifier("minecraft:block/water_flow"),
                0x80c71f
        ));
        BlockRenderLayerMap.INSTANCE.putFluids(RenderLayer.getTranslucent(), ModFluids.STILL_LIME, ModFluids.FLOWING_LIME);

        FluidRenderHandlerRegistry.INSTANCE.register(ModFluids.STILL_MAGENTA, ModFluids.FLOWING_MAGENTA, new SimpleFluidRenderHandler(
                new Identifier("minecraft:block/water_still"),
                new Identifier("minecraft:block/water_flow"),
                0xc74ebd
        ));
        BlockRenderLayerMap.INSTANCE.putFluids(RenderLayer.getTranslucent(), ModFluids.STILL_MAGENTA, ModFluids.FLOWING_MAGENTA);

        FluidRenderHandlerRegistry.INSTANCE.register(ModFluids.STILL_ORANGE, ModFluids.FLOWING_ORANGE, new SimpleFluidRenderHandler(
                new Identifier("minecraft:block/water_still"),
                new Identifier("minecraft:block/water_flow"),
                0xf9801d
        ));
        BlockRenderLayerMap.INSTANCE.putFluids(RenderLayer.getTranslucent(), ModFluids.STILL_ORANGE, ModFluids.FLOWING_ORANGE);

        FluidRenderHandlerRegistry.INSTANCE.register(ModFluids.STILL_PINK, ModFluids.FLOWING_PINK, new SimpleFluidRenderHandler(
                new Identifier("minecraft:block/water_still"),
                new Identifier("minecraft:block/water_flow"),
                0xf38baa
        ));
        BlockRenderLayerMap.INSTANCE.putFluids(RenderLayer.getTranslucent(), ModFluids.STILL_PINK, ModFluids.FLOWING_PINK);

        FluidRenderHandlerRegistry.INSTANCE.register(ModFluids.STILL_PURPLE, ModFluids.FLOWING_PURPLE, new SimpleFluidRenderHandler(
                new Identifier("minecraft:block/water_still"),
                new Identifier("minecraft:block/water_flow"),
                0x8932b8
        ));
        BlockRenderLayerMap.INSTANCE.putFluids(RenderLayer.getTranslucent(), ModFluids.STILL_PURPLE, ModFluids.FLOWING_PURPLE);

        FluidRenderHandlerRegistry.INSTANCE.register(ModFluids.STILL_RED, ModFluids.FLOWING_RED, new SimpleFluidRenderHandler(
                new Identifier("minecraft:block/water_still"),
                new Identifier("minecraft:block/water_flow"),
                0xb02e26
        ));
        BlockRenderLayerMap.INSTANCE.putFluids(RenderLayer.getTranslucent(), ModFluids.STILL_RED, ModFluids.FLOWING_RED);

        FluidRenderHandlerRegistry.INSTANCE.register(ModFluids.STILL_WHITE, ModFluids.FLOWING_WHITE, new SimpleFluidRenderHandler(
                new Identifier("minecraft:block/water_still"),
                new Identifier("minecraft:block/water_flow"),
                0xf9fffe
        ));
        BlockRenderLayerMap.INSTANCE.putFluids(RenderLayer.getTranslucent(), ModFluids.STILL_WHITE, ModFluids.FLOWING_WHITE);

        FluidRenderHandlerRegistry.INSTANCE.register(ModFluids.STILL_YELLOW, ModFluids.FLOWING_YELLOW, new SimpleFluidRenderHandler(
                new Identifier("minecraft:block/water_still"),
                new Identifier("minecraft:block/water_flow"),
                0xfed83d
        ));
        BlockRenderLayerMap.INSTANCE.putFluids(RenderLayer.getTranslucent(), ModFluids.STILL_YELLOW, ModFluids.FLOWING_YELLOW);

        FluidRenderHandlerRegistry.INSTANCE.register(ModFluids.GLOW_STILL_BLACK, ModFluids.GLOW_FLOWING_BLACK, new SimpleFluidRenderHandler(
                new Identifier("minecraft:block/water_still"),
                new Identifier("minecraft:block/water_flow"),
                0x1d1d21
        ));
        BlockRenderLayerMap.INSTANCE.putFluids(RenderLayer.getTranslucent(), ModFluids.GLOW_STILL_BLACK, ModFluids.GLOW_FLOWING_BLACK);

        FluidRenderHandlerRegistry.INSTANCE.register(ModFluids.GLOW_STILL_BROWN, ModFluids.GLOW_FLOWING_BROWN, new SimpleFluidRenderHandler(
                new Identifier("minecraft:block/water_still"),
                new Identifier("minecraft:block/water_flow"),
                0x835432
        ));
        BlockRenderLayerMap.INSTANCE.putFluids(RenderLayer.getTranslucent(), ModFluids.GLOW_STILL_BROWN, ModFluids.GLOW_FLOWING_BROWN);

        FluidRenderHandlerRegistry.INSTANCE.register(ModFluids.GLOW_STILL_CYAN, ModFluids.GLOW_FLOWING_CYAN, new SimpleFluidRenderHandler(
                new Identifier("minecraft:block/water_still"),
                new Identifier("minecraft:block/water_flow"),
                0x169c9c
        ));
        BlockRenderLayerMap.INSTANCE.putFluids(RenderLayer.getTranslucent(), ModFluids.GLOW_STILL_CYAN, ModFluids.GLOW_FLOWING_CYAN);

        FluidRenderHandlerRegistry.INSTANCE.register(ModFluids.GLOW_STILL_GRAY, ModFluids.GLOW_FLOWING_GRAY, new SimpleFluidRenderHandler(
                new Identifier("minecraft:block/water_still"),
                new Identifier("minecraft:block/water_flow"),
                0x474f52
        ));
        BlockRenderLayerMap.INSTANCE.putFluids(RenderLayer.getTranslucent(), ModFluids.GLOW_STILL_GRAY, ModFluids.GLOW_FLOWING_GRAY);

        FluidRenderHandlerRegistry.INSTANCE.register(ModFluids.GLOW_STILL_GREEN, ModFluids.GLOW_FLOWING_GREEN, new SimpleFluidRenderHandler(
                new Identifier("minecraft:block/water_still"),
                new Identifier("minecraft:block/water_flow"),
                0x5e7c16
        ));
        BlockRenderLayerMap.INSTANCE.putFluids(RenderLayer.getTranslucent(), ModFluids.GLOW_STILL_GREEN, ModFluids.GLOW_FLOWING_GREEN);

        FluidRenderHandlerRegistry.INSTANCE.register(ModFluids.GLOW_STILL_LIGHT_BLUE, ModFluids.GLOW_FLOWING_LIGHT_BLUE, new SimpleFluidRenderHandler(
                new Identifier("minecraft:block/water_still"),
                new Identifier("minecraft:block/water_flow"),
                0x3ab3da
        ));
        BlockRenderLayerMap.INSTANCE.putFluids(RenderLayer.getTranslucent(), ModFluids.GLOW_STILL_LIGHT_BLUE, ModFluids.GLOW_FLOWING_LIGHT_BLUE);

        FluidRenderHandlerRegistry.INSTANCE.register(ModFluids.GLOW_STILL_LIME, ModFluids.GLOW_FLOWING_LIME, new SimpleFluidRenderHandler(
                new Identifier("minecraft:block/water_still"),
                new Identifier("minecraft:block/water_flow"),
                0x80c71f
        ));
        BlockRenderLayerMap.INSTANCE.putFluids(RenderLayer.getTranslucent(), ModFluids.GLOW_STILL_LIME, ModFluids.GLOW_FLOWING_LIME);

        FluidRenderHandlerRegistry.INSTANCE.register(ModFluids.GLOW_STILL_MAGENTA, ModFluids.GLOW_FLOWING_MAGENTA, new SimpleFluidRenderHandler(
                new Identifier("minecraft:block/water_still"),
                new Identifier("minecraft:block/water_flow"),
                0xc74ebd
        ));
        BlockRenderLayerMap.INSTANCE.putFluids(RenderLayer.getTranslucent(), ModFluids.GLOW_STILL_MAGENTA, ModFluids.GLOW_FLOWING_MAGENTA);

        FluidRenderHandlerRegistry.INSTANCE.register(ModFluids.GLOW_STILL_ORANGE, ModFluids.GLOW_FLOWING_ORANGE, new SimpleFluidRenderHandler(
                new Identifier("minecraft:block/water_still"),
                new Identifier("minecraft:block/water_flow"),
                0xf9801d
        ));
        BlockRenderLayerMap.INSTANCE.putFluids(RenderLayer.getTranslucent(), ModFluids.GLOW_STILL_ORANGE, ModFluids.GLOW_FLOWING_ORANGE);

        FluidRenderHandlerRegistry.INSTANCE.register(ModFluids.GLOW_STILL_PINK, ModFluids.GLOW_FLOWING_PINK, new SimpleFluidRenderHandler(
                new Identifier("minecraft:block/water_still"),
                new Identifier("minecraft:block/water_flow"),
                0xf38baa
        ));
        BlockRenderLayerMap.INSTANCE.putFluids(RenderLayer.getTranslucent(), ModFluids.GLOW_STILL_PINK, ModFluids.GLOW_FLOWING_PINK);

        FluidRenderHandlerRegistry.INSTANCE.register(ModFluids.GLOW_STILL_PURPLE, ModFluids.GLOW_FLOWING_PURPLE, new SimpleFluidRenderHandler(
                new Identifier("minecraft:block/water_still"),
                new Identifier("minecraft:block/water_flow"),
                0x8932b8
        ));
        BlockRenderLayerMap.INSTANCE.putFluids(RenderLayer.getTranslucent(), ModFluids.GLOW_STILL_PURPLE, ModFluids.GLOW_FLOWING_PURPLE);

        FluidRenderHandlerRegistry.INSTANCE.register(ModFluids.GLOW_STILL_RED, ModFluids.GLOW_FLOWING_RED, new SimpleFluidRenderHandler(
                new Identifier("minecraft:block/water_still"),
                new Identifier("minecraft:block/water_flow"),
                0xb02e26
        ));
        BlockRenderLayerMap.INSTANCE.putFluids(RenderLayer.getTranslucent(), ModFluids.GLOW_STILL_RED, ModFluids.GLOW_FLOWING_RED);

        FluidRenderHandlerRegistry.INSTANCE.register(ModFluids.GLOW_STILL_WHITE, ModFluids.GLOW_FLOWING_WHITE, new SimpleFluidRenderHandler(
                new Identifier("minecraft:block/water_still"),
                new Identifier("minecraft:block/water_flow"),
                0xf9fffe
        ));
        BlockRenderLayerMap.INSTANCE.putFluids(RenderLayer.getTranslucent(), ModFluids.GLOW_STILL_WHITE, ModFluids.GLOW_FLOWING_WHITE);

        FluidRenderHandlerRegistry.INSTANCE.register(ModFluids.GLOW_STILL_YELLOW, ModFluids.GLOW_FLOWING_YELLOW, new SimpleFluidRenderHandler(
                new Identifier("minecraft:block/water_still"),
                new Identifier("minecraft:block/water_flow"),
                0xfed83d
        ));
        BlockRenderLayerMap.INSTANCE.putFluids(RenderLayer.getTranslucent(), ModFluids.GLOW_STILL_YELLOW, ModFluids.GLOW_FLOWING_YELLOW);
    }



    public static void registerBubbleParticles(DefaultParticleType particle, List<Float> colors){
        ParticleFactoryRegistry.getInstance().register(particle,
                fabricSpriteProvider -> new ColBubble.Factory(fabricSpriteProvider,
                        colors.get(0),
                        colors.get(1),
                        colors.get(2)
                ));
    }

    public static void registerSuspendedParticles(DefaultParticleType particle, List<Float> colors){
        ParticleFactoryRegistry.getInstance().register(particle,
                fabricSpriteProvider -> new ColSusp.Factory(fabricSpriteProvider,
                        colors.get(0),
                        colors.get(1),
                        colors.get(2)
                ));
    }

    public static void registerSplashParticles(DefaultParticleType particle, List<Float> colors){
        ParticleFactoryRegistry.getInstance().register(particle,
                fabricSpriteProvider -> new ColSplash.SplashFactory(fabricSpriteProvider,
                        colors.get(0),
                        colors.get(1),
                        colors.get(2)
                ));
    }
    private static Map<String, List<Float>> createMap(){
        Map<String,List<Float>> tempMap = new HashMap<>();
        tempMap.put("black",List.of(0.113f, 0.113f, 0.129f));
        tempMap.put("brown",List.of(0.513f, 0.329f, 0.196f));
        tempMap.put("cyan",List.of(0.086f, 0.611f, 0.611f));
        tempMap.put("gray",List.of(0.278f, 0.309f, 0.321f));
        tempMap.put("green",List.of(0.368f, 0.486f, 0.086f));
        tempMap.put("light_blue",List.of(0.227f, 0.701f, 0.854f));
        tempMap.put("lime",List.of(0.501f, 0.780f, 0.121f));
        tempMap.put("orange",List.of(0.780f, 0.305f, 0.741f));
        tempMap.put("pink",List.of(0.976f, 0.501f, 0.113f));
        tempMap.put("purple",List.of(0.952f, 0.545f, 0.666f));
        tempMap.put("white",List.of(0.537f, 0.196f, 0.721f));
        tempMap.put("yellow",List.of(0.976f, 1f, 0.996f));
        return tempMap;
    }
}
