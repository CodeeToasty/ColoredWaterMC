package com.codeetoasty.colwater.particle;


import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.particle.Particle;
import net.minecraft.client.particle.ParticleFactory;
import net.minecraft.client.particle.RainSplashParticle;
import net.minecraft.client.particle.SpriteProvider;
import net.minecraft.client.world.ClientWorld;
import net.minecraft.particle.DefaultParticleType;

@Environment(EnvType.CLIENT)
public class YellowSplash extends RainSplashParticle {
    protected YellowSplash(ClientWorld world, double x, double y, double z, double velocityX, double velocityY, double velocityZ) {
        super(world, x, y, z);
        this.gravityStrength = 0.04F;
        if (velocityY == 0.0D && (velocityX != 0.0D || velocityZ != 0.0D)) {
            this.velocityX = velocityX;
            this.velocityY = 0.1D;
            this.velocityZ = velocityZ;
        }

    }

    @Environment(EnvType.CLIENT)
    public static class SplashFactory implements ParticleFactory<DefaultParticleType> {
        private final SpriteProvider spriteProvider;

        public SplashFactory(SpriteProvider spriteProvider) {
            this.spriteProvider = spriteProvider;
        }


        public Particle createParticle(DefaultParticleType defaultParticleType, ClientWorld clientWorld, double d, double e, double f, double g, double h, double i) {
            YellowSplash testSplash = new YellowSplash(clientWorld, d, e, f, g, h, i);
            testSplash.setSprite(this.spriteProvider);
            return testSplash;
        }
    }
}
