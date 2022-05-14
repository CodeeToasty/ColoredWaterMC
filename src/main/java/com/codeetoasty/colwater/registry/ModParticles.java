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

    public static DefaultParticleType BLACK_SPLASH = createParticle("black","splash");
    public static DefaultParticleType BROWN_SPLASH = createParticle("brown","splash");
    public static DefaultParticleType CYAN_SPLASH = createParticle("cyan","splash");
    public static DefaultParticleType GRAY_SPLASH = createParticle("gray","splash");
    public static DefaultParticleType GREEN_SPLASH = createParticle("green","splash");
    public static DefaultParticleType LIGHT_BLUE_SPLASH = createParticle("light_blue","splash");
    public static DefaultParticleType LIME_SPLASH = createParticle("lime","splash");
    public static DefaultParticleType MAGENTA_SPLASH = createParticle("magenta","splash");
    public static DefaultParticleType ORANGE_SPLASH = createParticle("orange","splash");
    public static DefaultParticleType PINK_SPLASH = createParticle("pink","splash");
    public static DefaultParticleType PURPLE_SPLASH = createParticle("purple","splash");
    public static DefaultParticleType RED_SPLASH = createParticle("white","splash");
    public static DefaultParticleType WHITE_SPLASH = createParticle("yellow","splash");
    public static DefaultParticleType YELLOW_SPLASH = createParticle("red","splash");

    public static DefaultParticleType BLACK_BUBBLE = createParticle("black","bubble");
    public static DefaultParticleType BROWN_BUBBLE = createParticle("brown","bubble");
    public static DefaultParticleType CYAN_BUBBLE  = createParticle("cyan","bubble");
    public static DefaultParticleType GRAY_BUBBLE  = createParticle("gray","bubble");
    public static DefaultParticleType GREEN_BUBBLE = createParticle("green","bubble");
    public static DefaultParticleType LIGHT_BLUE_BUBBLE = createParticle("light_blue","bubble");
    public static DefaultParticleType LIME_BUBBLE  = createParticle("lime","bubble");
    public static DefaultParticleType MAGENTA_BUBBLE = createParticle("magenta","bubble");
    public static DefaultParticleType ORANGE_BUBBLE  = createParticle("orange","bubble");
    public static DefaultParticleType PINK_BUBBLE = createParticle("pink","bubble");
    public static DefaultParticleType PURPLE_BUBBLE = createParticle("purple","bubble");
    public static DefaultParticleType RED_BUBBLE = createParticle("red","bubble");
    public static DefaultParticleType WHITE_BUBBLE = createParticle("white","bubble");
    public static DefaultParticleType YELLOW_BUBBLE = createParticle("yellow","bubble");


    public static DefaultParticleType BLACK_SUS = createParticle("black","suspart");
    public static DefaultParticleType BROWN_SUS = createParticle("brown","suspart");
    public static DefaultParticleType CYAN_SUS = createParticle("cyan","suspart");
    public static DefaultParticleType GRAY_SUS = createParticle("gray","suspart");
    public static DefaultParticleType GREEN_SUS  = createParticle("green","suspart");
    public static DefaultParticleType LIGHT_BLUE_SUS = createParticle("light_blue","suspart");
    public static DefaultParticleType LIME_SUS = createParticle("lime","suspart");
    public static DefaultParticleType MAGENTA_SUS = createParticle("magenta","suspart");
    public static DefaultParticleType ORANGE_SUS = createParticle("orange","suspart");
    public static DefaultParticleType PINK_SUS = createParticle("pink","suspart");
    public static DefaultParticleType PURPLE_SUS = createParticle("purple","suspart");
    public static DefaultParticleType RED_SUS = createParticle("white","suspart");
    public static DefaultParticleType WHITE_SUS = createParticle("yellow","suspart");
    public static DefaultParticleType YELLOW_SUS = createParticle("red","suspart");

    public static void registerParticles() {

        createMap(colors);

        giveColor("splash",BLACK_SPLASH,"black");
        giveColor("splash",BROWN_SPLASH,"brown");
        giveColor("splash",CYAN_SPLASH,"cyan");
        giveColor("splash",GRAY_SPLASH,"gray");
        giveColor("splash",GREEN_SPLASH,"green");
        giveColor("splash",LIGHT_BLUE_SPLASH,"light_blue");
        giveColor("splash",LIME_SPLASH,"lime");
        giveColor("splash",MAGENTA_SPLASH,"magenta");
        giveColor("splash",ORANGE_SPLASH,"orange");
        giveColor("splash",PINK_SPLASH,"pink");
        giveColor("splash",PURPLE_SPLASH,"purple");
        giveColor("splash",WHITE_SPLASH,"white");
        giveColor("splash",YELLOW_SPLASH,"yellow");
        giveColor("splash",RED_SPLASH,"red");

        giveColor("bubble",BLACK_BUBBLE,"black");
        giveColor("bubble",BROWN_BUBBLE,"brown");
        giveColor("bubble",CYAN_BUBBLE,"cyan");
        giveColor("bubble",GRAY_BUBBLE,"gray");
        giveColor("bubble",GREEN_BUBBLE,"green");
        giveColor("bubble",LIGHT_BLUE_BUBBLE,"light_blue");
        giveColor("bubble",LIME_BUBBLE,"lime");
        giveColor("bubble",MAGENTA_BUBBLE,"magenta");
        giveColor("bubble",ORANGE_BUBBLE,"orange");
        giveColor("bubble",PINK_BUBBLE,"pink");
        giveColor("bubble",PURPLE_BUBBLE,"purple");
        giveColor("bubble",RED_BUBBLE,"red");
        giveColor("bubble",WHITE_BUBBLE,"white");
        giveColor("bubble",YELLOW_BUBBLE,"yellow");

        giveColor("susp",BLACK_SUS,"black");
        giveColor("susp",BROWN_SUS,"brown");
        giveColor("susp",CYAN_SUS,"cyan");
        giveColor("susp",GRAY_SUS,"gray");
        giveColor("susp",GREEN_SUS,"green");
        giveColor("susp",LIGHT_BLUE_SUS,"light_blue");
        giveColor("susp",LIME_SUS,"lime");
        giveColor("susp",MAGENTA_SUS,"magenta");
        giveColor("susp",ORANGE_SUS,"orange");
        giveColor("susp",PINK_SUS,"pink");
        giveColor("susp",PURPLE_SUS,"purple");
        giveColor("susp",RED_SUS,"red");
        giveColor("susp",WHITE_SUS,"white");
        giveColor("susp",YELLOW_SUS,"yellow");
    }


    public static DefaultParticleType createParticle(String name, String type){
        return Registry.register(Registry.PARTICLE_TYPE, new Identifier(ColoredWater.MOD_ID, name+"_"+type),
                FabricParticleTypes.simple(true));
    }

    public static void giveColor(String particleType, DefaultParticleType particle, String tint){
        List<Float> colorList = colors.get(tint);
        switch (particleType) {
            case "bubble" -> ParticleFactoryRegistry.getInstance().register(particle,
                    fabricSpriteProvider -> new ColBubble.Factory(fabricSpriteProvider,
                            colorList.get(0),
                            colorList.get(1),
                            colorList.get(2)
                    ));
            case "splash" -> ParticleFactoryRegistry.getInstance().register(particle,
                    fabricSpriteProvider -> new ColSplash.SplashFactory(fabricSpriteProvider,
                            colorList.get(0),
                            colorList.get(1),
                            colorList.get(2)
                    ));
            case "susp" -> ParticleFactoryRegistry.getInstance().register(particle,
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
        tempMap.put("orange",List.of(0.976f, 0.501f, 0.113f));
        tempMap.put("pink",List.of(0.952f, 0.545f, 0.666f));
        tempMap.put("purple",List.of(0.780f, 0.305f, 0.741f));
        tempMap.put("red",List.of(0.690f, 0.180f, 0.149f));
        tempMap.put("white",List.of(0.537f, 0.196f, 0.721f));
        tempMap.put("yellow",List.of(0.976f, 1f, 0.996f));
    }
}
