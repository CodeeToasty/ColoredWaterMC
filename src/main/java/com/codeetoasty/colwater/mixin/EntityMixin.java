package com.codeetoasty.colwater.mixin;


import com.codeetoasty.colwater.registry.ModBlocks;
import com.codeetoasty.colwater.registry.ModParticles;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.entity.Entity;
import net.minecraft.particle.ParticleEffect;
import net.minecraft.particle.ParticleTypes;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyArg;

@Mixin(Entity.class)
public class EntityMixin {
    @ModifyArg(at = @At(value = "INVOKE", target = "Lnet/minecraft/world/World;addParticle(Lnet/minecraft/particle/ParticleEffect;DDDDDD)V"),
            method = "onSwimmingStart")
    protected ParticleEffect changeSplashColour(ParticleEffect particle) {
        Entity thiz = (Entity) (Object) this;
        BlockState state = thiz.world.getBlockState(thiz.getBlockPos());
        if (particle.equals(ParticleTypes.BUBBLE)) {
            return particle;
        }

        if (particle.equals(ParticleTypes.SPLASH)) {
            switch (state.getBlock().toString()) {
                case "Block{colwater:black}":
                    return ModParticles.BLACK_SPLASH;
                case "Block{colwater:brown}":
                    return ModParticles.BROWN_SPLASH;
                case "Block{colwater:cyan}":
                    return ModParticles.CYAN_SPLASH;
                case "Block{colwater:gray}":
                    return ModParticles.GRAY_SPLASH;
                case "Block{colwater:green}":
                    return ModParticles.GREEN_SPLASH;
                case "Block{colwater:light_blue}":
                    return ModParticles.LIGHT_BLUE_SPLASH;
                case "Block{colwater:lime}":
                    return ModParticles.LIME_SPLASH;
                case "Block{colwater:magenta}":
                    return ModParticles.MAGENTA_SPLASH;
                case "Block{colwater:orange}":
                    return ModParticles.ORANGE_SPLASH;
                case "Block{colwater:pink}":
                    return ModParticles.PINK_SPLASH;
                case "Block{colwater:purple}":
                    return ModParticles.PURPLE_SPLASH;
                case "Block{colwater:red}":
                    return ModParticles.RED_SPLASH;
                case "Block{colwater:white}":
                    return ModParticles.WHITE_SPLASH;
                case "Block{colwater:yellow}":
                    return ModParticles.YELLOW_SPLASH;
            }
        }
        return particle;
    }
}