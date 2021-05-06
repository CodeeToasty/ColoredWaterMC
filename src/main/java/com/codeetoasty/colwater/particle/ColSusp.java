package com.codeetoasty.colwater.particle;


import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.particle.*;
import net.minecraft.client.render.Camera;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.util.math.Vector3f;
import net.minecraft.client.world.ClientWorld;
import net.minecraft.particle.DefaultParticleType;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Quaternion;
import net.minecraft.util.math.Vec3d;

import java.util.Random;

@Environment(EnvType.CLIENT)
public class ColSusp extends SpriteBillboardParticle {
    protected static final float BLINK_STEP = 0.05f;
    protected float nextAlphaGoal = 0f;

    private ColSusp(ClientWorld world, double x, double y, double z, double velocityX, double velocityY, double velocityZ,float red,float green,float blue) {
        super(world, x, y, z, velocityX, velocityY, velocityZ);
        this.colorRed = red;
        this.colorGreen = green;
        this.colorBlue = blue;
        this.setBoundingBoxSpacing(0.02F, 0.02F);
        this.scale *= this.random.nextFloat() * 0.6F + 0.5F;
        this.velocityX *= 0.019999999552965164D;
        this.velocityY *= 0.099999999552965164D;
        this.velocityZ *= 0.019999999552965164D;
        this.maxAge = (int)(100.0D / (Math.random() * 0.8D + 0.2D));
    }

    public ParticleTextureSheet getType() {
        return ParticleTextureSheet.PARTICLE_SHEET_OPAQUE;
    }

    public void move(double dx, double dy, double dz) {
        this.setBoundingBox(this.getBoundingBox().offset(dx, dy, dz));
        this.repositionFromBoundingBox();
    }

    public void tick() {
        this.prevPosX = this.x;
        this.prevPosY = this.y;
        this.prevPosZ = this.z;

        //particle works only at night (change?)
        if ((world.getTimeOfDay() >= 1000 && world.getTimeOfDay() < 13000) || this.age++ >= this.maxAge) {
            this.nextAlphaGoal = 0;
            if (this.colorAlpha < 0f) {
                this.markDead();
            }
        }

        if (this.colorAlpha > this.nextAlphaGoal - BLINK_STEP && this.colorAlpha < this.nextAlphaGoal + BLINK_STEP) {
            this.nextAlphaGoal = new Random().nextFloat();
        } else {
            if (this.nextAlphaGoal > this.colorAlpha) {
                this.colorAlpha = Math.min(this.colorAlpha + BLINK_STEP, 1f);
            } else if (nextAlphaGoal < this.colorAlpha) {
                this.colorAlpha = Math.max(this.colorAlpha - BLINK_STEP, 0f);
            }
        }

            this.move(this.velocityX, this.velocityY, this.velocityZ);
            this.velocityX *= 0.99D;
            this.velocityY *= 0.99D;
            this.velocityZ *= 0.99D;
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

        public Particle createParticle(DefaultParticleType defaultParticleType, ClientWorld clientWorld, double d, double e, double f, double g, double h, double i) {
            com.codeetoasty.colwater.particle.ColSusp ColSusp = new com.codeetoasty.colwater.particle.ColSusp(clientWorld, d, e, f, g, h, i,red,green,blue);
            ColSusp.setSprite(this.spriteProvider);
            return ColSusp;
        }
    }
}

