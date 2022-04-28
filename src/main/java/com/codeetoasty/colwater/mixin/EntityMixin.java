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

        BlockState state = getRightState(thiz,thiz.getBlockStateAtPos());

        if (particle.equals(ParticleTypes.BUBBLE)) {
            return switch (state.getBlock().toString()) {
                case "Block{colwater:black}", "Block{colwater:glow_black}" -> ModParticles.BLACK_BUBBLE;
                case "Block{colwater:brown}", "Block{colwater:glow_brown}" -> ModParticles.BROWN_BUBBLE;
                case "Block{colwater:cyan}", "Block{colwater:glow_cyan}" -> ModParticles.CYAN_BUBBLE;
                case "Block{colwater:gray}", "Block{colwater:glow_gray}" -> ModParticles.GRAY_BUBBLE;
                case "Block{colwater:green}", "Block{colwater:glow_green}" -> ModParticles.GREEN_BUBBLE;
                case "Block{colwater:light_blue}", "Block{colwater:glow_light_blue}" -> ModParticles.LIGHT_BLUE_BUBBLE;
                case "Block{colwater:lime}", "Block{colwater:glow_lime}" -> ModParticles.LIME_BUBBLE;
                case "Block{colwater:magenta}", "Block{colwater:glow_magenta}" -> ModParticles.MAGENTA_BUBBLE;
                case "Block{colwater:orange}", "Block{colwater:glow_orange}" -> ModParticles.ORANGE_BUBBLE;
                case "Block{colwater:pink}", "Block{colwater:glow_pink}" -> ModParticles.PINK_BUBBLE;
                case "Block{colwater:purple}", "Block{colwater:glow_purple}" -> ModParticles.PURPLE_BUBBLE;
                case "Block{colwater:red}", "Block{colwater:glow_red}" -> ModParticles.RED_BUBBLE;
                case "Block{colwater:white}", "Block{colwater:glow_white}" -> ModParticles.WHITE_BUBBLE;
                case "Block{colwater:yellow}", "Block{colwater:glow_yellow}" -> ModParticles.YELLOW_BUBBLE;
                default -> particle;
            };
        }

        if (particle.equals(ParticleTypes.SPLASH)) {
            return switch (state.getBlock().toString()) {
                case "Block{colwater:black}", "Block{colwater:glow_black}" -> ModParticles.BLACK_SPLASH;
                case "Block{colwater:brown}", "Block{colwater:glow_brown}" -> ModParticles.BROWN_SPLASH;
                case "Block{colwater:cyan}", "Block{colwater:glow_cyan}" -> ModParticles.CYAN_SPLASH;
                case "Block{colwater:gray}", "Block{colwater:glow_gray}" -> ModParticles.GRAY_SPLASH;
                case "Block{colwater:green}", "Block{colwater:glow_green}" -> ModParticles.GREEN_SPLASH;
                case "Block{colwater:light_blue}", "Block{colwater:glow_light_blue}" -> ModParticles.LIGHT_BLUE_SPLASH;
                case "Block{colwater:lime}", "Block{colwater:glow_lime}" -> ModParticles.LIME_SPLASH;
                case "Block{colwater:magenta}", "Block{colwater:glow_magenta}" -> ModParticles.MAGENTA_SPLASH;
                case "Block{colwater:orange}", "Block{colwater:glow_orange}" -> ModParticles.ORANGE_SPLASH;
                case "Block{colwater:pink}", "Block{colwater:glow_pink}" -> ModParticles.PINK_SPLASH;
                case "Block{colwater:purple}", "Block{colwater:glow_purple}" -> ModParticles.PURPLE_SPLASH;
                case "Block{colwater:red}", "Block{colwater:glow_red}" -> ModParticles.RED_SPLASH;
                case "Block{colwater:white}", "Block{colwater:glow_white}" -> ModParticles.WHITE_SPLASH;
                case "Block{colwater:yellow}", "Block{colwater:glow_yellow}" -> ModParticles.YELLOW_SPLASH;
                default -> particle;
            };
        }
        return particle;
        }


        // scans blocks ahead of entity's direction to
        // try to spawn the correct colored particles.
        protected BlockState getRightState(Entity thiz,BlockState state) {

            double vel_x = thiz.getVelocity().getX();
            double vel_z = thiz.getVelocity().getZ();
        //get z and x velocity to know direction
            String direction_z = "";
            String direction_x = "";
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
            /*
            if x or z velocity are 0 the string is empty since
            entity was moving perfectly straight -> avoid switch.
            the switchs check for the direction the player is going.
            Here's the last improvable code: the check is arbitrary in the order.
            To improve this i should add extra controls and frankly is a lot
            messy and the code works fine 99% of the time as it is.

             */
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