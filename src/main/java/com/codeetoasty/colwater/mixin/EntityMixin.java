package com.codeetoasty.colwater.mixin;

import com.codeetoasty.colwater.registry.ModParticles;
import net.minecraft.block.BlockState;
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
        if(thiz.world.isClient) {
            BlockState state = thiz.world.getBlockState(thiz.getBlockPos());


            double vel_x = thiz.getVelocity().getX();
            double vel_z = thiz.getVelocity().getZ();

            state = getRightState(thiz,state,vel_x,vel_z);

            if (particle.equals(ParticleTypes.BUBBLE)) {
                switch (state.getBlock().toString()) {
                    case "Block{colwater:black}":
                        return ModParticles.BLACK_BUBBLE;
                    case "Block{colwater:brown}":
                        return ModParticles.BROWN_BUBBLE;
                    case "Block{colwater:cyan}":
                        return ModParticles.CYAN_BUBBLE;
                    case "Block{colwater:gray}":
                        return ModParticles.GRAY_BUBBLE;
                    case "Block{colwater:green}":
                        return ModParticles.GREEN_BUBBLE;
                    case "Block{colwater:light_blue}":
                        return ModParticles.LIGHT_BLUE_BUBBLE;
                    case "Block{colwater:lime}":
                        return ModParticles.LIME_BUBBLE;
                    case "Block{colwater:magenta}":
                        return ModParticles.MAGENTA_BUBBLE;
                    case "Block{colwater:orange}":
                        return ModParticles.ORANGE_BUBBLE;
                    case "Block{colwater:pink}":
                        return ModParticles.PINK_BUBBLE;
                    case "Block{colwater:purple}":
                        return ModParticles.PURPLE_BUBBLE;
                    case "Block{colwater:red}":
                        return ModParticles.RED_BUBBLE;
                    case "Block{colwater:white}":
                        return ModParticles.WHITE_BUBBLE;
                    case "Block{colwater:yellow}":
                        return ModParticles.YELLOW_BUBBLE;
                    default:
                        return particle;
                }
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
                    default:
                        return particle;
                }
            }
            }
            return particle;
        }


        protected BlockState getRightState(Entity thiz,BlockState state,double vel_x, double vel_z) {

            String direction_z = new String();
            String direction_x = new String();
            if (vel_z < 0) {
                direction_z = "north";
            }
            if (vel_z > 0) {
                direction_z = "south";
            }
            if (vel_x < 0) {
                direction_x = "west";
            }
            if (vel_x > 0) {
                direction_x = "east";
            }

                if (!direction_x.isEmpty()){
                    switch (direction_x) {
                        case "east":
                            if (state.getFluidState().isEmpty())
                                state = thiz.world.getBlockState(thiz.getBlockPos().east(1));
                            if (state.getFluidState().isEmpty())
                                state = thiz.world.getBlockState(thiz.getBlockPos().east(1).north(1));
                            if (state.getFluidState().isEmpty())
                                state = thiz.world.getBlockState(thiz.getBlockPos().east(1).south(1));
                            break;
                        case "west":
                            if (state.getFluidState().isEmpty())
                                state = thiz.world.getBlockState(thiz.getBlockPos().west(1));
                            if (state.getFluidState().isEmpty())
                                state = thiz.world.getBlockState(thiz.getBlockPos().south(1).west(1));
                            if (state.getFluidState().isEmpty())
                                state = thiz.world.getBlockState(thiz.getBlockPos().north(1).west(1));
                            break;
                    }
            }
                if(!direction_z.isEmpty()) {
                    switch (direction_z) {
                        case "south":
                            if (state.getFluidState().isEmpty())
                                state = thiz.world.getBlockState(thiz.getBlockPos().south(1));
                            if (state.getFluidState().isEmpty())
                                state = thiz.world.getBlockState(thiz.getBlockPos().east(1).south(1));
                            if (state.getFluidState().isEmpty())
                                state = thiz.world.getBlockState(thiz.getBlockPos().west(1).south(1));
                            break;
                        case "north":
                            if (state.getFluidState().isEmpty())
                                state = thiz.world.getBlockState(thiz.getBlockPos().north(1));
                            if (state.getFluidState().isEmpty())
                                state = thiz.world.getBlockState(thiz.getBlockPos().west(1).north(1));
                            if (state.getFluidState().isEmpty())
                                state = thiz.world.getBlockState(thiz.getBlockPos().east(1).north(1));
                            break;
                    }
                }
            return state;
        }
}