package com.codeetoasty.colwater.particle;


import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.particle.*;
import net.minecraft.client.world.ClientWorld;
import net.minecraft.particle.DefaultParticleType;
import net.minecraft.util.Identifier;

import java.util.Random;

@Environment(EnvType.CLIENT)
public class ColSusp extends SpriteBillboardParticle {

    private ColSusp(ClientWorld world, double x, double y, double z, double velocityX, double velocityY, double velocityZ,float red,float green,float blue) {
        super(world, x, y, z, velocityX, velocityY, velocityZ);
        super.red = red;
        super.green = green;
        super.blue = blue;
        this.setBoundingBoxSpacing(0.02F, 0.02F);
        this.scale *= this.random.nextFloat() * 0.6F + 0.5F;
        this.velocityX *= 0.019999999552965164D;
        this.velocityY *= 0.099999999552965164D;
        this.velocityZ *= 0.019999999552965164D;

        if(world.getTimeOfDay()>13000)
            this.maxAge = (int)(100.0D / (Math.random() * 0.8D + 0.2D));
        else
            this.maxAge = (int)(10.0D / (Math.random() * 0.8D + 0.2D));

    }

    @Override
    public ParticleTextureSheet getType() {
        return ParticleTextureSheet.PARTICLE_SHEET_OPAQUE;
    }

    @Override
    public void tick() {
        if (this.age++ >= this.maxAge || (world.getTimeOfDay() > 1000 && world.getTimeOfDay()<13000)) {
            this.markDead();
        }else {
            this.prevPosX = this.x;
            this.prevPosY = this.y;
            this.prevPosZ = this.z;

            this.move(this.velocityX, this.velocityY, this.velocityZ);
            this.velocityX *= 0.99D;
            this.velocityY *= 0.99D;
            this.velocityZ *= 0.99D;
        }
    }

    @Environment(EnvType.CLIENT)
    public static class Factory implements ParticleFactory<DefaultParticleType> {
        private final SpriteProvider spriteProvider;
        private final float red;
        private final float green;
        private final float blue;

        public Factory(SpriteProvider spriteProvider, float red, float green, float blue) {
            this.spriteProvider = spriteProvider;

            this.red = red;
            this.green = green;
            this.blue = blue;
        }

        @Override
        public Particle createParticle(DefaultParticleType defaultParticleType, ClientWorld clientWorld, double d, double e, double f, double g, double h, double i) {
            com.codeetoasty.colwater.particle.ColSusp ColSusp = new com.codeetoasty.colwater.particle.ColSusp(clientWorld, d, e, f, g, h, i,red,green,blue);
            ColSusp.setSprite(this.spriteProvider);
            return ColSusp;
        }
    }
}

