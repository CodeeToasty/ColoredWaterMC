package com.codeetoasty.colwater.render;

import static com.codeetoasty.colwater.registry.ModParticles.*;
import static com.codeetoasty.colwater.registry.ModFluids.*;

import com.codeetoasty.colwater.ColoredWater;
import com.codeetoasty.colwater.particle.ColBubble;
import com.codeetoasty.colwater.particle.ColSplash;
import com.codeetoasty.colwater.particle.ColSusp;
import com.codeetoasty.colwater.registry.ModFluids;
import com.codeetoasty.colwater.registry.ModParticles;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.client.particle.v1.ParticleFactoryRegistry;
import net.fabricmc.fabric.api.client.render.fluid.v1.FluidRenderHandlerRegistry;
import net.fabricmc.fabric.api.client.render.fluid.v1.SimpleFluidRenderHandler;
import net.fabricmc.fabric.api.event.client.ClientSpriteRegistryCallback;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.fluid.FlowableFluid;
import net.minecraft.particle.DefaultParticleType;
import net.minecraft.screen.PlayerScreenHandler;
import net.minecraft.util.Identifier;


import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class ColoredWaterClient implements ClientModInitializer {

    public static Map<String, Integer> waterColors = new HashMap<>();


    @Override
    public void onInitializeClient() {
        createWaterColorMap(waterColors);
        registerParticles();
        FluidRenderHandlerRegistry.INSTANCE.register(ModFluids.STILL_DYABLE_WATER, ModFluids.FLOWING_DYABLE_WATER, new SimpleFluidRenderHandler(
                new Identifier("minecraft:block/water_still"),
                new Identifier("minecraft:block/water_flow"),
                0xffffff
        ));
        BlockRenderLayerMap.INSTANCE.putFluids(RenderLayer.getSolid(), ModFluids.STILL_DYABLE_WATER, ModFluids.FLOWING_DYABLE_WATER);

        renderFluids(STILL_BLACK,FLOWING_BLACK,"black");
        renderFluids(STILL_BROWN,FLOWING_BROWN,"brown");
        renderFluids(STILL_CYAN,FLOWING_CYAN,"cyan");
        renderFluids(STILL_GRAY,FLOWING_GRAY,"gray");
        renderFluids(STILL_GREEN,FLOWING_GREEN,"green");
        renderFluids(STILL_LIGHT_BLUE,FLOWING_LIGHT_BLUE,"light_blue");
        renderFluids(STILL_LIME,FLOWING_LIME,"lime");
        renderFluids(STILL_MAGENTA,FLOWING_MAGENTA,"magenta");
        renderFluids(STILL_ORANGE,FLOWING_ORANGE,"orange");
        renderFluids(STILL_PINK,FLOWING_PINK,"pink");
        renderFluids(STILL_PURPLE,FLOWING_PURPLE,"purple");
        renderFluids(STILL_RED,FLOWING_RED,"red");
        renderFluids(STILL_WHITE,FLOWING_WHITE,"white");
        renderFluids(STILL_YELLOW,FLOWING_YELLOW,"yellow");

        renderFluids(GLOW_STILL_BLACK,GLOW_FLOWING_BLACK,"black");
        renderFluids(GLOW_STILL_BROWN,GLOW_FLOWING_BROWN,"brown");
        renderFluids(GLOW_STILL_CYAN,GLOW_FLOWING_CYAN,"cyan");
        renderFluids(GLOW_STILL_GRAY,GLOW_FLOWING_GRAY,"gray");
        renderFluids(GLOW_STILL_GREEN,GLOW_FLOWING_GREEN,"green");
        renderFluids(GLOW_STILL_LIGHT_BLUE,GLOW_FLOWING_LIGHT_BLUE,"light_blue");
        renderFluids(GLOW_STILL_LIME,GLOW_FLOWING_LIME,"lime");
        renderFluids(GLOW_STILL_MAGENTA,GLOW_FLOWING_MAGENTA,"magenta");
        renderFluids(GLOW_STILL_ORANGE,GLOW_FLOWING_ORANGE,"orange");
        renderFluids(GLOW_STILL_PINK,GLOW_FLOWING_PINK,"pink");
        renderFluids(GLOW_STILL_PURPLE,GLOW_FLOWING_PURPLE,"purple");
        renderFluids(GLOW_STILL_RED,GLOW_FLOWING_RED,"red");
        renderFluids(GLOW_STILL_WHITE,GLOW_FLOWING_WHITE,"white");
        renderFluids(GLOW_STILL_YELLOW,GLOW_FLOWING_YELLOW,"yellow");
    }


    public static void renderFluids(FlowableFluid fluid,FlowableFluid flowableFluid,String tint){
        FluidRenderHandlerRegistry.INSTANCE.register(fluid, flowableFluid, new SimpleFluidRenderHandler(
                new Identifier("minecraft:block/water_still"),
                new Identifier("minecraft:block/water_flow"),
                waterColors.get(tint)
        ));
        BlockRenderLayerMap.INSTANCE.putFluids(RenderLayer.getTranslucent(),
                fluid, flowableFluid);
    }

    private void createWaterColorMap(Map<String,Integer> tempMap) {
        tempMap.put("dyable", 0xffffff);
        tempMap.put("black", 0x1d1d21);
        tempMap.put("brown", 0x835432);
        tempMap.put("cyan", 0x169c9c);
        tempMap.put("gray", 0x474f52);
        tempMap.put("green", 0x5e7c16);
        tempMap.put("light_blue", 0x3ab3da);
        tempMap.put("magenta",0xc74ebd);
        tempMap.put("lime", 0x80c71f);
        tempMap.put("orange", 0xf9801d);
        tempMap.put("pink", 0xf38baa);
        tempMap.put("purple", 0x8932b8);
        tempMap.put("white", 0xf9fffe);
        tempMap.put("yellow", 0xfed83d);
        tempMap.put("red", 0xb02e26);
    }
}
