package com.codeetoasty.colwater.registry;

import com.codeetoasty.colwater.ColoredWater;
import com.codeetoasty.colwater.particle.*;
import net.fabricmc.fabric.api.client.particle.v1.ParticleFactoryRegistry;
import net.fabricmc.fabric.api.particle.v1.FabricParticleTypes;
import net.minecraft.particle.DefaultParticleType;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModParticles {
    public static DefaultParticleType BLACK_SPLASH;
    public static DefaultParticleType BROWN_SPLASH;
    public static DefaultParticleType CYAN_SPLASH;
    public static DefaultParticleType GRAY_SPLASH;
    public static DefaultParticleType GREEN_SPLASH;
    public static DefaultParticleType LIGHT_BLUE_SPLASH;
    public static DefaultParticleType LIME_SPLASH;
    public static DefaultParticleType MAGENTA_SPLASH;
    public static DefaultParticleType ORANGE_SPLASH;
    public static DefaultParticleType PINK_SPLASH;
    public static DefaultParticleType PURPLE_SPLASH;
    public static DefaultParticleType RED_SPLASH;
    public static DefaultParticleType WHITE_SPLASH;
    public static DefaultParticleType YELLOW_SPLASH;

    public static DefaultParticleType BLACK_BUBBLE;
    public static DefaultParticleType BROWN_BUBBLE;
    public static DefaultParticleType CYAN_BUBBLE;
    public static DefaultParticleType GRAY_BUBBLE;
    public static DefaultParticleType GREEN_BUBBLE;
    public static DefaultParticleType LIGHT_BLUE_BUBBLE;
    public static DefaultParticleType LIME_BUBBLE;
    public static DefaultParticleType MAGENTA_BUBBLE;
    public static DefaultParticleType ORANGE_BUBBLE;
    public static DefaultParticleType PINK_BUBBLE;
    public static DefaultParticleType PURPLE_BUBBLE;
    public static DefaultParticleType RED_BUBBLE;
    public static DefaultParticleType WHITE_BUBBLE;
    public static DefaultParticleType YELLOW_BUBBLE;

    public static void registerParticles() {
        BLACK_SPLASH = Registry.register(Registry.PARTICLE_TYPE, new Identifier(ColoredWater.MOD_ID, "black_splash"), FabricParticleTypes.simple(true));
        ParticleFactoryRegistry.getInstance().register(BLACK_SPLASH, BlackSplash.SplashFactory::new);
        BROWN_SPLASH = Registry.register(Registry.PARTICLE_TYPE, new Identifier(ColoredWater.MOD_ID, "brown_splash"), FabricParticleTypes.simple(true));
        ParticleFactoryRegistry.getInstance().register(BROWN_SPLASH, BrownSplash.SplashFactory::new);
        CYAN_SPLASH = Registry.register(Registry.PARTICLE_TYPE, new Identifier(ColoredWater.MOD_ID, "cyan_splash"), FabricParticleTypes.simple(true));
        ParticleFactoryRegistry.getInstance().register(CYAN_SPLASH, CyanSplash.SplashFactory::new);
        GRAY_SPLASH = Registry.register(Registry.PARTICLE_TYPE, new Identifier(ColoredWater.MOD_ID, "gray_splash"), FabricParticleTypes.simple(true));
        ParticleFactoryRegistry.getInstance().register(GRAY_SPLASH, GraySplash.SplashFactory::new);
        GREEN_SPLASH = Registry.register(Registry.PARTICLE_TYPE, new Identifier(ColoredWater.MOD_ID, "green_splash"), FabricParticleTypes.simple(true));
        ParticleFactoryRegistry.getInstance().register(GREEN_SPLASH, GreenSplash.SplashFactory::new);
        LIGHT_BLUE_SPLASH = Registry.register(Registry.PARTICLE_TYPE, new Identifier(ColoredWater.MOD_ID, "light_blue_splash"), FabricParticleTypes.simple(true));
        ParticleFactoryRegistry.getInstance().register(LIGHT_BLUE_SPLASH, LightBlueSplash.SplashFactory::new);
        LIME_SPLASH = Registry.register(Registry.PARTICLE_TYPE, new Identifier(ColoredWater.MOD_ID, "lime_splash"), FabricParticleTypes.simple(true));
        ParticleFactoryRegistry.getInstance().register(LIME_SPLASH, LimeSplash.SplashFactory::new);
        MAGENTA_SPLASH = Registry.register(Registry.PARTICLE_TYPE, new Identifier(ColoredWater.MOD_ID, "magenta_splash"), FabricParticleTypes.simple(true));
        ParticleFactoryRegistry.getInstance().register(MAGENTA_SPLASH, MagentaSplash.SplashFactory::new);
        ORANGE_SPLASH = Registry.register(Registry.PARTICLE_TYPE, new Identifier(ColoredWater.MOD_ID, "orange_splash"), FabricParticleTypes.simple(true));
        ParticleFactoryRegistry.getInstance().register(ORANGE_SPLASH, OrangeSplash.SplashFactory::new);
        PINK_SPLASH = Registry.register(Registry.PARTICLE_TYPE, new Identifier(ColoredWater.MOD_ID, "pink_splash"), FabricParticleTypes.simple(true));
        ParticleFactoryRegistry.getInstance().register(PINK_SPLASH, PinkSplash.SplashFactory::new);
        PURPLE_SPLASH = Registry.register(Registry.PARTICLE_TYPE, new Identifier(ColoredWater.MOD_ID, "purple_splash"), FabricParticleTypes.simple(true));
        ParticleFactoryRegistry.getInstance().register(PURPLE_SPLASH, PurpleSplash.SplashFactory::new);
        RED_SPLASH = Registry.register(Registry.PARTICLE_TYPE, new Identifier(ColoredWater.MOD_ID, "red_splash"), FabricParticleTypes.simple(true));
        ParticleFactoryRegistry.getInstance().register(RED_SPLASH, RedSplash.SplashFactory::new);
        WHITE_SPLASH = Registry.register(Registry.PARTICLE_TYPE, new Identifier(ColoredWater.MOD_ID, "white_splash"), FabricParticleTypes.simple(true));
        ParticleFactoryRegistry.getInstance().register(WHITE_SPLASH, WhiteSplash.SplashFactory::new);
        YELLOW_SPLASH = Registry.register(Registry.PARTICLE_TYPE, new Identifier(ColoredWater.MOD_ID, "yellow_splash"), FabricParticleTypes.simple(true));
        ParticleFactoryRegistry.getInstance().register(YELLOW_SPLASH, YellowSplash.SplashFactory::new);

        BLACK_BUBBLE = Registry.register(Registry.PARTICLE_TYPE, new Identifier(ColoredWater.MOD_ID, "black_bubble"), FabricParticleTypes.simple(true));
        ParticleFactoryRegistry.getInstance().register(BLACK_BUBBLE, BlackBubble.Factory::new);
        BROWN_BUBBLE = Registry.register(Registry.PARTICLE_TYPE, new Identifier(ColoredWater.MOD_ID, "brown_bubble"), FabricParticleTypes.simple(true));
        ParticleFactoryRegistry.getInstance().register(BROWN_BUBBLE, BrownBubble.Factory::new);
        CYAN_BUBBLE = Registry.register(Registry.PARTICLE_TYPE, new Identifier(ColoredWater.MOD_ID, "cyan_bubble"), FabricParticleTypes.simple(true));
        ParticleFactoryRegistry.getInstance().register(CYAN_BUBBLE, CyanBubble.Factory::new);
        GRAY_BUBBLE = Registry.register(Registry.PARTICLE_TYPE, new Identifier(ColoredWater.MOD_ID, "gray_bubble"), FabricParticleTypes.simple(true));
        ParticleFactoryRegistry.getInstance().register(GRAY_BUBBLE, GrayBubble.Factory::new);
        GREEN_BUBBLE = Registry.register(Registry.PARTICLE_TYPE, new Identifier(ColoredWater.MOD_ID, "green_bubble"), FabricParticleTypes.simple(true));
        ParticleFactoryRegistry.getInstance().register(GREEN_BUBBLE, GreenBubble.Factory::new);
        LIGHT_BLUE_BUBBLE = Registry.register(Registry.PARTICLE_TYPE, new Identifier(ColoredWater.MOD_ID, "light_blue_bubble"), FabricParticleTypes.simple(true));
        ParticleFactoryRegistry.getInstance().register(LIGHT_BLUE_BUBBLE, LightBlueBubble.Factory::new);
        LIME_BUBBLE = Registry.register(Registry.PARTICLE_TYPE, new Identifier(ColoredWater.MOD_ID, "lime_bubble"), FabricParticleTypes.simple(true));
        ParticleFactoryRegistry.getInstance().register(LIME_BUBBLE, LimeBubble.Factory::new);
        MAGENTA_BUBBLE = Registry.register(Registry.PARTICLE_TYPE, new Identifier(ColoredWater.MOD_ID, "magenta_bubble"), FabricParticleTypes.simple(true));
        ParticleFactoryRegistry.getInstance().register(MAGENTA_BUBBLE, MagentaBubble.Factory::new);
        ORANGE_BUBBLE = Registry.register(Registry.PARTICLE_TYPE, new Identifier(ColoredWater.MOD_ID, "orange_bubble"), FabricParticleTypes.simple(true));
        ParticleFactoryRegistry.getInstance().register(ORANGE_BUBBLE, OrangeBubble.Factory::new);
        PINK_BUBBLE = Registry.register(Registry.PARTICLE_TYPE, new Identifier(ColoredWater.MOD_ID, "pink_bubble"), FabricParticleTypes.simple(true));
        ParticleFactoryRegistry.getInstance().register(PINK_BUBBLE, PinkBubble.Factory::new);
        PURPLE_BUBBLE = Registry.register(Registry.PARTICLE_TYPE, new Identifier(ColoredWater.MOD_ID, "purple_bubble"), FabricParticleTypes.simple(true));
        ParticleFactoryRegistry.getInstance().register(PURPLE_BUBBLE, PurpleBubble.Factory::new);
        RED_BUBBLE = Registry.register(Registry.PARTICLE_TYPE, new Identifier(ColoredWater.MOD_ID, "red_bubble"), FabricParticleTypes.simple(true));
        ParticleFactoryRegistry.getInstance().register(RED_BUBBLE, RedBubble.Factory::new);
        WHITE_BUBBLE = Registry.register(Registry.PARTICLE_TYPE, new Identifier(ColoredWater.MOD_ID, "white_bubble"), FabricParticleTypes.simple(true));
        ParticleFactoryRegistry.getInstance().register(WHITE_BUBBLE, WhiteBubble.Factory::new);
        YELLOW_BUBBLE = Registry.register(Registry.PARTICLE_TYPE, new Identifier(ColoredWater.MOD_ID, "yellow_bubble"), FabricParticleTypes.simple(true));
        ParticleFactoryRegistry.getInstance().register(YELLOW_BUBBLE, YellowBubble.Factory::new);


    }
}
