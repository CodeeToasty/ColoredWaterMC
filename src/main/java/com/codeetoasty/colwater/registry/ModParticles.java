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

    }
}
