package com.codeetoasty.colwater.registry;

import com.codeetoasty.colwater.ColoredWater;
import com.codeetoasty.colwater.particle.ColBubble;
import com.codeetoasty.colwater.particle.ColSplash;
import com.codeetoasty.colwater.particle.ColSusp;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.particle.v1.ParticleFactoryRegistry;
import net.fabricmc.fabric.api.client.rendering.v1.ColorProviderRegistry;
import net.fabricmc.fabric.api.particle.v1.FabricParticleTypes;
import net.minecraft.particle.DefaultParticleType;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ModParticles {

    public static Map<String, List<Float>> colors = new HashMap<>();

    public static DefaultParticleType BLACK_SPLASH=FabricParticleTypes.simple();
    public static DefaultParticleType BROWN_SPLASH=FabricParticleTypes.simple();
    public static DefaultParticleType CYAN_SPLASH=FabricParticleTypes.simple();
    public static DefaultParticleType GRAY_SPLASH=FabricParticleTypes.simple();
    public static DefaultParticleType GREEN_SPLASH=FabricParticleTypes.simple();
    public static DefaultParticleType LIGHT_BLUE_SPLASH=FabricParticleTypes.simple();
    public static DefaultParticleType LIME_SPLASH=FabricParticleTypes.simple();
    public static DefaultParticleType MAGENTA_SPLASH=FabricParticleTypes.simple();
    public static DefaultParticleType ORANGE_SPLASH=FabricParticleTypes.simple();
    public static DefaultParticleType PINK_SPLASH=FabricParticleTypes.simple();
    public static DefaultParticleType PURPLE_SPLASH=FabricParticleTypes.simple();
    public static DefaultParticleType RED_SPLASH=FabricParticleTypes.simple();
    public static DefaultParticleType WHITE_SPLASH=FabricParticleTypes.simple();
    public static DefaultParticleType YELLOW_SPLASH=FabricParticleTypes.simple();

    public static DefaultParticleType BLACK_BUBBLE=FabricParticleTypes.simple();
    public static DefaultParticleType BROWN_BUBBLE=FabricParticleTypes.simple();
    public static DefaultParticleType CYAN_BUBBLE=FabricParticleTypes.simple();
    public static DefaultParticleType GRAY_BUBBLE=FabricParticleTypes.simple();
    public static DefaultParticleType GREEN_BUBBLE=FabricParticleTypes.simple();
    public static DefaultParticleType LIGHT_BLUE_BUBBLE=FabricParticleTypes.simple();
    public static DefaultParticleType LIME_BUBBLE=FabricParticleTypes.simple();
    public static DefaultParticleType MAGENTA_BUBBLE=FabricParticleTypes.simple();
    public static DefaultParticleType ORANGE_BUBBLE=FabricParticleTypes.simple();
    public static DefaultParticleType PINK_BUBBLE=FabricParticleTypes.simple();
    public static DefaultParticleType PURPLE_BUBBLE=FabricParticleTypes.simple();
    public static DefaultParticleType RED_BUBBLE=FabricParticleTypes.simple();
    public static DefaultParticleType WHITE_BUBBLE=FabricParticleTypes.simple();
    public static DefaultParticleType YELLOW_BUBBLE=FabricParticleTypes.simple();

    public static DefaultParticleType LIME_SUS=FabricParticleTypes.simple();
    public static DefaultParticleType RED_SUS=FabricParticleTypes.simple();
    public static DefaultParticleType BLACK_SUS=FabricParticleTypes.simple();
    public static DefaultParticleType BROWN_SUS=FabricParticleTypes.simple();
    public static DefaultParticleType CYAN_SUS=FabricParticleTypes.simple();
    public static DefaultParticleType GRAY_SUS=FabricParticleTypes.simple();
    public static DefaultParticleType GREEN_SUS=FabricParticleTypes.simple();
    public static DefaultParticleType LIGHT_BLUE_SUS=FabricParticleTypes.simple();
    public static DefaultParticleType MAGENTA_SUS=FabricParticleTypes.simple();
    public static DefaultParticleType ORANGE_SUS=FabricParticleTypes.simple();
    public static DefaultParticleType PINK_SUS=FabricParticleTypes.simple();
    public static DefaultParticleType PURPLE_SUS=FabricParticleTypes.simple();
    public static DefaultParticleType WHITE_SUS=FabricParticleTypes.simple();
    public static DefaultParticleType YELLOW_SUS=FabricParticleTypes.simple();

    public static void registerParticles() {

        createMap(colors);

        BLACK_SPLASH = Registry.register(Registry.PARTICLE_TYPE, new Identifier(ColoredWater.MOD_ID, "black_splash"), FabricParticleTypes.simple(true));
        ParticleFactoryRegistry.getInstance().register(BLACK_SPLASH, fabricSpriteProvider -> new ColSplash.SplashFactory(fabricSpriteProvider,0.113f, 0.113f, 0.129f));
        BROWN_SPLASH = Registry.register(Registry.PARTICLE_TYPE, new Identifier(ColoredWater.MOD_ID, "brown_splash"), FabricParticleTypes.simple(true));
        ParticleFactoryRegistry.getInstance().register(BROWN_SPLASH, fabricSpriteProvider -> new ColSplash.SplashFactory(fabricSpriteProvider,0.513f, 0.329f, 0.196f));
        CYAN_SPLASH = Registry.register(Registry.PARTICLE_TYPE, new Identifier(ColoredWater.MOD_ID, "cyan_splash"), FabricParticleTypes.simple(true));
        ParticleFactoryRegistry.getInstance().register(CYAN_SPLASH, fabricSpriteProvider -> new ColSplash.SplashFactory(fabricSpriteProvider,0.086f, 0.611f, 0.611f));
        GRAY_SPLASH = Registry.register(Registry.PARTICLE_TYPE, new Identifier(ColoredWater.MOD_ID, "gray_splash"), FabricParticleTypes.simple(true));
        ParticleFactoryRegistry.getInstance().register(GRAY_SPLASH, fabricSpriteProvider -> new ColSplash.SplashFactory(fabricSpriteProvider,0.278f, 0.309f, 0.321f));
        GREEN_SPLASH = Registry.register(Registry.PARTICLE_TYPE, new Identifier(ColoredWater.MOD_ID, "green_splash"), FabricParticleTypes.simple(true));
        ParticleFactoryRegistry.getInstance().register(GREEN_SPLASH, fabricSpriteProvider -> new ColSplash.SplashFactory(fabricSpriteProvider,0.368f, 0.486f, 0.086f));
        LIGHT_BLUE_SPLASH = Registry.register(Registry.PARTICLE_TYPE, new Identifier(ColoredWater.MOD_ID, "light_blue_splash"), FabricParticleTypes.simple(true));
        ParticleFactoryRegistry.getInstance().register(LIGHT_BLUE_SPLASH, fabricSpriteProvider -> new ColSplash.SplashFactory(fabricSpriteProvider,0.227f, 0.701f, 0.854f));
        LIME_SPLASH = Registry.register(Registry.PARTICLE_TYPE, new Identifier(ColoredWater.MOD_ID, "lime_splash"), FabricParticleTypes.simple(true));
        ParticleFactoryRegistry.getInstance().register(LIME_SPLASH, fabricSpriteProvider -> new ColSplash.SplashFactory(fabricSpriteProvider,0.501f, 0.780f, 0.121f));
        MAGENTA_SPLASH = Registry.register(Registry.PARTICLE_TYPE, new Identifier(ColoredWater.MOD_ID, "magenta_splash"), FabricParticleTypes.simple(true));
        ParticleFactoryRegistry.getInstance().register(MAGENTA_SPLASH, fabricSpriteProvider -> new ColSplash.SplashFactory(fabricSpriteProvider,0.780f, 0.305f, 0.741f));
        ORANGE_SPLASH = Registry.register(Registry.PARTICLE_TYPE, new Identifier(ColoredWater.MOD_ID, "orange_splash"), FabricParticleTypes.simple(true));
        ParticleFactoryRegistry.getInstance().register(ORANGE_SPLASH, fabricSpriteProvider -> new ColSplash.SplashFactory(fabricSpriteProvider,0.976f, 0.501f, 0.113f));
        PINK_SPLASH = Registry.register(Registry.PARTICLE_TYPE, new Identifier(ColoredWater.MOD_ID, "pink_splash"), FabricParticleTypes.simple(true));
        ParticleFactoryRegistry.getInstance().register(PINK_SPLASH, fabricSpriteProvider -> new ColSplash.SplashFactory(fabricSpriteProvider,0.952f, 0.545f, 0.666f));
        PURPLE_SPLASH = Registry.register(Registry.PARTICLE_TYPE, new Identifier(ColoredWater.MOD_ID, "purple_splash"), FabricParticleTypes.simple(true));
        ParticleFactoryRegistry.getInstance().register(PURPLE_SPLASH, fabricSpriteProvider -> new ColSplash.SplashFactory(fabricSpriteProvider,0.537f, 0.196f, 0.721f));
        WHITE_SPLASH = Registry.register(Registry.PARTICLE_TYPE, new Identifier(ColoredWater.MOD_ID, "white_splash"), FabricParticleTypes.simple(true));
        ParticleFactoryRegistry.getInstance().register(WHITE_SPLASH, fabricSpriteProvider -> new ColSplash.SplashFactory(fabricSpriteProvider,0.976f, 1f, 0.996f));
        YELLOW_SPLASH = Registry.register(Registry.PARTICLE_TYPE, new Identifier(ColoredWater.MOD_ID, "yellow_splash"), FabricParticleTypes.simple(true));
        ParticleFactoryRegistry.getInstance().register(YELLOW_SPLASH, fabricSpriteProvider -> new ColSplash.SplashFactory(fabricSpriteProvider,0.996f, 0.847f, 0.239f));

        BLACK_BUBBLE = Registry.register(Registry.PARTICLE_TYPE, new Identifier(ColoredWater.MOD_ID, "black_bubble"), FabricParticleTypes.simple(true));
        ParticleFactoryRegistry.getInstance().register(BLACK_BUBBLE, fabricSpriteProvider -> new ColBubble.Factory(fabricSpriteProvider,0.113f, 0.113f, 0.129f));
        BROWN_BUBBLE = Registry.register(Registry.PARTICLE_TYPE, new Identifier(ColoredWater.MOD_ID, "brown_bubble"), FabricParticleTypes.simple(true));
        ParticleFactoryRegistry.getInstance().register(BROWN_BUBBLE, fabricSpriteProvider -> new ColBubble.Factory(fabricSpriteProvider,0.513f, 0.329f, 0.196f));
        CYAN_BUBBLE = Registry.register(Registry.PARTICLE_TYPE, new Identifier(ColoredWater.MOD_ID, "cyan_bubble"), FabricParticleTypes.simple(true));
        ParticleFactoryRegistry.getInstance().register(CYAN_BUBBLE, fabricSpriteProvider -> new ColBubble.Factory(fabricSpriteProvider,0.086f, 0.611f, 0.611f));
        GRAY_BUBBLE = Registry.register(Registry.PARTICLE_TYPE, new Identifier(ColoredWater.MOD_ID, "gray_bubble"), FabricParticleTypes.simple(true));
        ParticleFactoryRegistry.getInstance().register(GRAY_BUBBLE, fabricSpriteProvider -> new ColBubble.Factory(fabricSpriteProvider,0.278f, 0.309f, 0.321f));
        GREEN_BUBBLE = Registry.register(Registry.PARTICLE_TYPE, new Identifier(ColoredWater.MOD_ID, "green_bubble"), FabricParticleTypes.simple(true));
        ParticleFactoryRegistry.getInstance().register(GREEN_BUBBLE, fabricSpriteProvider -> new ColBubble.Factory(fabricSpriteProvider,0.368f, 0.486f, 0.086f));
        LIGHT_BLUE_BUBBLE = Registry.register(Registry.PARTICLE_TYPE, new Identifier(ColoredWater.MOD_ID, "light_blue_bubble"), FabricParticleTypes.simple(true));
        ParticleFactoryRegistry.getInstance().register(LIGHT_BLUE_BUBBLE, fabricSpriteProvider -> new ColBubble.Factory(fabricSpriteProvider,0.227f, 0.701f, 0.854f));
        LIME_BUBBLE = Registry.register(Registry.PARTICLE_TYPE, new Identifier(ColoredWater.MOD_ID, "lime_bubble"), FabricParticleTypes.simple(true));
        ParticleFactoryRegistry.getInstance().register(LIME_BUBBLE, fabricSpriteProvider -> new ColBubble.Factory(fabricSpriteProvider,0.501f, 0.780f, 0.121f));
        MAGENTA_BUBBLE = Registry.register(Registry.PARTICLE_TYPE, new Identifier(ColoredWater.MOD_ID, "magenta_bubble"), FabricParticleTypes.simple(true));
        ParticleFactoryRegistry.getInstance().register(MAGENTA_BUBBLE, fabricSpriteProvider -> new ColBubble.Factory(fabricSpriteProvider,0.780f, 0.305f, 0.741f));
        ORANGE_BUBBLE = Registry.register(Registry.PARTICLE_TYPE, new Identifier(ColoredWater.MOD_ID, "orange_bubble"), FabricParticleTypes.simple(true));
        ParticleFactoryRegistry.getInstance().register(ORANGE_BUBBLE, fabricSpriteProvider -> new ColBubble.Factory(fabricSpriteProvider,0.976f, 0.501f, 0.113f));
        PINK_BUBBLE = Registry.register(Registry.PARTICLE_TYPE, new Identifier(ColoredWater.MOD_ID, "pink_bubble"), FabricParticleTypes.simple(true));
        ParticleFactoryRegistry.getInstance().register(PINK_BUBBLE, fabricSpriteProvider -> new ColBubble.Factory(fabricSpriteProvider,0.952f, 0.545f, 0.666f));
        PURPLE_BUBBLE = Registry.register(Registry.PARTICLE_TYPE, new Identifier(ColoredWater.MOD_ID, "purple_bubble"), FabricParticleTypes.simple(true));
        ParticleFactoryRegistry.getInstance().register(PURPLE_BUBBLE, fabricSpriteProvider -> new ColBubble.Factory(fabricSpriteProvider,0.537f, 0.196f, 0.721f));
        RED_BUBBLE = Registry.register(Registry.PARTICLE_TYPE, new Identifier(ColoredWater.MOD_ID, "red_bubble"), FabricParticleTypes.simple(true));
        ParticleFactoryRegistry.getInstance().register(RED_BUBBLE, fabricSpriteProvider -> new ColBubble.Factory(fabricSpriteProvider,0.690f, 0.180f, 0.149f));
        WHITE_BUBBLE = Registry.register(Registry.PARTICLE_TYPE, new Identifier(ColoredWater.MOD_ID, "white_bubble"), FabricParticleTypes.simple(true));
        ParticleFactoryRegistry.getInstance().register(WHITE_BUBBLE, fabricSpriteProvider -> new ColBubble.Factory(fabricSpriteProvider,0.976f, 1f, 0.996f));
        YELLOW_BUBBLE = Registry.register(Registry.PARTICLE_TYPE, new Identifier(ColoredWater.MOD_ID, "yellow_bubble"), FabricParticleTypes.simple(true));
        ParticleFactoryRegistry.getInstance().register(YELLOW_BUBBLE, fabricSpriteProvider -> new ColBubble.Factory(fabricSpriteProvider,0.996f, 0.847f, 0.239f));

        LIME_SUS = Registry.register(Registry.PARTICLE_TYPE, new Identifier(ColoredWater.MOD_ID,"lime_suspart"), FabricParticleTypes.simple(true));
        ParticleFactoryRegistry.getInstance().register(LIME_SUS, fabricSpriteProvider -> new ColSusp.Factory(fabricSpriteProvider,0.501f, 0.780f, 0.121f));
        RED_SUS = Registry.register(Registry.PARTICLE_TYPE, new Identifier(ColoredWater.MOD_ID,"red_suspart"), FabricParticleTypes.simple(true));
        ParticleFactoryRegistry.getInstance().register(RED_SUS, fabricSpriteProvider -> new ColSusp.Factory(fabricSpriteProvider,0.690f, 0.180f, 0.149f));
        BLACK_SUS = Registry.register(Registry.PARTICLE_TYPE, new Identifier(ColoredWater.MOD_ID,"black_suspart"), FabricParticleTypes.simple(true));
        ParticleFactoryRegistry.getInstance().register(BLACK_SUS, fabricSpriteProvider -> new ColSusp.Factory(fabricSpriteProvider,0.113f, 0.113f, 0.129f));
        BROWN_SUS = Registry.register(Registry.PARTICLE_TYPE, new Identifier(ColoredWater.MOD_ID,"brown_suspart"), FabricParticleTypes.simple(true));
        ParticleFactoryRegistry.getInstance().register(BROWN_SUS, fabricSpriteProvider -> new ColSusp.Factory(fabricSpriteProvider,0.513f, 0.329f, 0.196f));
        CYAN_SUS = Registry.register(Registry.PARTICLE_TYPE, new Identifier(ColoredWater.MOD_ID,"cyan_suspart"), FabricParticleTypes.simple(true));
        ParticleFactoryRegistry.getInstance().register(CYAN_SUS, fabricSpriteProvider -> new ColSusp.Factory(fabricSpriteProvider,0.086f, 0.611f, 0.611f));
        GRAY_SUS = Registry.register(Registry.PARTICLE_TYPE, new Identifier(ColoredWater.MOD_ID,"gray_suspart"), FabricParticleTypes.simple(true));
        ParticleFactoryRegistry.getInstance().register(GRAY_SUS, fabricSpriteProvider -> new ColSusp.Factory(fabricSpriteProvider,0.278f, 0.309f, 0.321f));
        GREEN_SUS = Registry.register(Registry.PARTICLE_TYPE, new Identifier(ColoredWater.MOD_ID,"green_suspart"), FabricParticleTypes.simple(true));
        ParticleFactoryRegistry.getInstance().register(GREEN_SUS, fabricSpriteProvider -> new ColSusp.Factory(fabricSpriteProvider,0.368f, 0.486f, 0.086f));
        LIGHT_BLUE_SUS = Registry.register(Registry.PARTICLE_TYPE, new Identifier(ColoredWater.MOD_ID,"light_blue_suspart"), FabricParticleTypes.simple(true));
        ParticleFactoryRegistry.getInstance().register(LIGHT_BLUE_SUS, fabricSpriteProvider -> new ColSusp.Factory(fabricSpriteProvider,0.227f, 0.701f, 0.854f));
        MAGENTA_SUS = Registry.register(Registry.PARTICLE_TYPE, new Identifier(ColoredWater.MOD_ID,"magenta_suspart"), FabricParticleTypes.simple(true));
        ParticleFactoryRegistry.getInstance().register(MAGENTA_SUS, fabricSpriteProvider -> new ColSusp.Factory(fabricSpriteProvider,0.780f, 0.305f, 0.741f));
        ORANGE_SUS = Registry.register(Registry.PARTICLE_TYPE, new Identifier(ColoredWater.MOD_ID,"orange_suspart"), FabricParticleTypes.simple(true));
        ParticleFactoryRegistry.getInstance().register(ORANGE_SUS, fabricSpriteProvider -> new ColSusp.Factory(fabricSpriteProvider,0.976f, 0.501f, 0.113f));
        PINK_SUS = Registry.register(Registry.PARTICLE_TYPE, new Identifier(ColoredWater.MOD_ID,"pink_suspart"), FabricParticleTypes.simple(true));
        ParticleFactoryRegistry.getInstance().register(PINK_SUS, fabricSpriteProvider -> new ColSusp.Factory(fabricSpriteProvider,0.952f, 0.545f, 0.666f));
        PURPLE_SUS = Registry.register(Registry.PARTICLE_TYPE, new Identifier(ColoredWater.MOD_ID,"purple_suspart"), FabricParticleTypes.simple(true));
        ParticleFactoryRegistry.getInstance().register(PURPLE_SUS, fabricSpriteProvider -> new ColSusp.Factory(fabricSpriteProvider,0.537f, 0.196f, 0.721f));
        WHITE_SUS = Registry.register(Registry.PARTICLE_TYPE, new Identifier(ColoredWater.MOD_ID,"white_suspart"), FabricParticleTypes.simple(true));
        ParticleFactoryRegistry.getInstance().register(WHITE_SUS, fabricSpriteProvider -> new ColSusp.Factory(fabricSpriteProvider,0.976f, 1f, 0.996f));
        YELLOW_SUS = Registry.register(Registry.PARTICLE_TYPE, new Identifier(ColoredWater.MOD_ID,"yellow_suspart"), FabricParticleTypes.simple(true));
        ParticleFactoryRegistry.getInstance().register(YELLOW_SUS, fabricSpriteProvider -> new ColSusp.Factory(fabricSpriteProvider,0.996f, 0.847f, 0.239f));
    }


    public void registerParticle(String particleType,DefaultParticleType particle,String tint){
        List<Float> colorList = colors.get(tint);
        switch (particleType){
            case "bubble": ParticleFactoryRegistry.getInstance().register(particle,
                            fabricSpriteProvider -> new ColBubble.Factory(fabricSpriteProvider,
                                    colorList.get(0),
                                    colorList.get(1),
                                    colorList.get(2)
                            ));
            case "splash": ParticleFactoryRegistry.getInstance().register(particle,
                            fabricSpriteProvider -> new ColSplash.SplashFactory(fabricSpriteProvider,
                                    colorList.get(0),
                                    colorList.get(1),
                                    colorList.get(2)
                            ));
            case "susp": ParticleFactoryRegistry.getInstance().register(particle,
                            fabricSpriteProvider -> new ColSusp.Factory(fabricSpriteProvider,
                                    colorList.get(0),
                                    colorList.get(1),
                                    colorList.get(2)
                            ));
        }
    }


    private static void createMap(Map<String, List<Float>> tempMap){
        tempMap.put("black",List.of(0.113f, 0.113f, 0.129f));
        tempMap.put("brown",List.of(0.513f, 0.329f, 0.196f));
        tempMap.put("cyan",List.of(0.086f, 0.611f, 0.611f));
        tempMap.put("gray",List.of(0.278f, 0.309f, 0.321f));
        tempMap.put("green",List.of(0.368f, 0.486f, 0.086f));
        tempMap.put("light_blue",List.of(0.227f, 0.701f, 0.854f));
        tempMap.put("magenta",List.of(0.780f, 0.305f, 0.741f));
        tempMap.put("lime",List.of(0.501f, 0.780f, 0.121f));
        tempMap.put("orange",List.of(0.780f, 0.305f, 0.741f));
        tempMap.put("pink",List.of(0.976f, 0.501f, 0.113f));
        tempMap.put("purple",List.of(0.952f, 0.545f, 0.666f));
        tempMap.put("red",List.of(0.690f, 0.180f, 0.149f));
        tempMap.put("white",List.of(0.537f, 0.196f, 0.721f));
        tempMap.put("yellow",List.of(0.976f, 1f, 0.996f));
    }
}
