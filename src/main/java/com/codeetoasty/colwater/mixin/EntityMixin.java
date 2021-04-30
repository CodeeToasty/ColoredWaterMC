package com.codeetoasty.colwater.mixin;

import com.codeetoasty.colwater.registry.ModParticles;
import net.minecraft.block.BlockState;
import net.minecraft.block.FluidBlock;
import net.minecraft.entity.Entity;
import net.minecraft.fluid.Fluids;
import net.minecraft.network.packet.c2s.play.PlayerMoveC2SPacket;
import net.minecraft.particle.ParticleEffect;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.Position;
import org.lwjgl.system.CallbackI;
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

        /*
         *  In the previous line i got the blockstate of the block
         *  i'm currently. When I run into a fluid this block is an
         *  air block, so wrong particles are generated (vanilla bubble and splashes)
         *
         *  To avoid this, a liquid is encountered, i check the surrondings
         *  starting from north going clockwise until north-west.
         *  As soon as i encounter a liquid i change the state so that
         *  i can display correct particles.
         *
         *  Even if this works is not perfect: since I check surrounding starting
         *  north if i have another fluid in that direction its particles will be
         *  displayed. This is because i'm still trying to figure out a way to
         *  grab the direction of the player (entity).
         *
         *  Another way around this would be to implement a "isTouchingFluid" method
         *  like the vanilla game does, but frankly i don't know how to do it yet
         *  so this is good enough for now.
         */

            if(state.getFluidState().isEmpty())
                state = thiz.world.getBlockState(thiz.getBlockPos().north(1));

            if(state.getFluidState().isEmpty())
                state = thiz.world.getBlockState(thiz.getBlockPos().east(1).north(1));

            if(state.getFluidState().isEmpty())
                state = thiz.world.getBlockState(thiz.getBlockPos().east(1));

            if(state.getFluidState().isEmpty())
                state = thiz.world.getBlockState(thiz.getBlockPos().east(1).south());

            if(state.getFluidState().isEmpty())
                state = thiz.world.getBlockState(thiz.getBlockPos().south(1));

            if(state.getFluidState().isEmpty())
                state = thiz.world.getBlockState(thiz.getBlockPos().south(1).west(1));

            if(state.getFluidState().isEmpty())
                state = thiz.world.getBlockState(thiz.getBlockPos().west(1));

            if(state.getFluidState().isEmpty())
                state = thiz.world.getBlockState(thiz.getBlockPos().north(1).west(1));

        if (particle.equals(ParticleTypes.BUBBLE)) {
            switch (state.getBlock().toString()) {
                case "Block{colwater:black}": return ModParticles.BLACK_BUBBLE;
                case "Block{colwater:brown}": return ModParticles.BROWN_BUBBLE;
                case "Block{colwater:cyan}": return ModParticles.CYAN_BUBBLE;
                case "Block{colwater:gray}": return ModParticles.GRAY_BUBBLE;
                case "Block{colwater:green}": return ModParticles.GREEN_BUBBLE;
                case "Block{colwater:light_blue}": return ModParticles.LIGHT_BLUE_BUBBLE;
                case "Block{colwater:lime}": return ModParticles.LIME_BUBBLE;
                case "Block{colwater:magenta}": return ModParticles.MAGENTA_BUBBLE;
                case "Block{colwater:orange}": return ModParticles.ORANGE_BUBBLE;
                case "Block{colwater:pink}": return ModParticles.PINK_BUBBLE;
                case "Block{colwater:purple}": return ModParticles.PURPLE_BUBBLE;
                case "Block{colwater:red}": return ModParticles.RED_BUBBLE;
                case "Block{colwater:white}": return ModParticles.WHITE_BUBBLE;
                case "Block{colwater:yellow}": return ModParticles.YELLOW_BUBBLE;
                default: return particle;
            }
        }

        if (particle.equals(ParticleTypes.SPLASH)) {
            switch (state.getBlock().toString()) {
                case "Block{colwater:black}": return ModParticles.BLACK_SPLASH;
                case "Block{colwater:brown}": return ModParticles.BROWN_SPLASH;
                case "Block{colwater:cyan}": return ModParticles.CYAN_SPLASH;
                case "Block{colwater:gray}": return ModParticles.GRAY_SPLASH;
                case "Block{colwater:green}": return ModParticles.GREEN_SPLASH;
                case "Block{colwater:light_blue}": return ModParticles.LIGHT_BLUE_SPLASH;
                case "Block{colwater:lime}": return ModParticles.LIME_SPLASH;
                case "Block{colwater:magenta}": return ModParticles.MAGENTA_SPLASH;
                case "Block{colwater:orange}": return ModParticles.ORANGE_SPLASH;
                case "Block{colwater:pink}": return ModParticles.PINK_SPLASH;
                case "Block{colwater:purple}": return ModParticles.PURPLE_SPLASH;
                case "Block{colwater:red}": return ModParticles.RED_SPLASH;
                case "Block{colwater:white}": return ModParticles.WHITE_SPLASH;
                case "Block{colwater:yellow}": return ModParticles.YELLOW_SPLASH;
                default: return particle;
            }
        }
        return particle;
    }
}