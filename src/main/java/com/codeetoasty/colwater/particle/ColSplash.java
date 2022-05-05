package com.codeetoasty.colwater.particle;


import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.particle.*;
import net.minecraft.client.world.ClientWorld;
import net.minecraft.particle.DefaultParticleType;

@Environment(EnvType.CLIENT)
public class ColSplash extends RainSplashParticle {
    protected ColSplash(ClientWorld world, double x, double y, double z, double velocityX, double velocityY, double velocityZ,float red, float green, float blue) {
        super(world, x, y, z);
        this.gravityStrength = 0.04F;
        super.red = red;
        super.green = green;
        super.blue = blue;
        if (velocityY == 0.0D && (velocityX != 0.0D || velocityZ != 0.0D)) {
            this.velocityX = velocityX;
            this.velocityY = 0.1D;
            this.velocityZ = velocityZ;
        }
    }

    @Environment(EnvType.CLIENT)
    public static class SplashFactory implements ParticleFactory<DefaultParticleType> {
        private final SpriteProvider spriteProvider;
        private final float red;
        private final float green;
        private final float blue;

        public SplashFactory(SpriteProvider spriteProvider, float red, float green, float blue) {
            this.spriteProvider = spriteProvider;
            this.red = red;
            this.green = green;
            this.blue = blue;
        }


        public Particle createParticle(DefaultParticleType defaultParticleType, ClientWorld clientWorld, double d, double e, double f, double g, double h, double i) {
            ColSplash testSplash = new ColSplash(clientWorld, d, e, f, g, h, i, red, green, blue);
            testSplash.setSprite(this.spriteProvider);
            return testSplash;
        }
    }
}


