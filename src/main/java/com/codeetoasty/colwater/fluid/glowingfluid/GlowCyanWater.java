package com.codeetoasty.colwater.fluid.glowingfluid;

import com.codeetoasty.colwater.fluid.DyableWater;
import com.codeetoasty.colwater.registry.ModBlocks;
import com.codeetoasty.colwater.registry.ModFluids;
import com.codeetoasty.colwater.registry.ModItems;
import com.codeetoasty.colwater.registry.ModParticles;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.block.BlockState;
import net.minecraft.fluid.Fluid;
import net.minecraft.fluid.FluidState;
import net.minecraft.item.Item;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.Properties;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import java.util.Random;

public abstract class GlowCyanWater extends DyableWater {
    @Override
    public Fluid getStill() {
        return ModFluids.GLOW_STILL_CYAN;
    }

    @Override
    public Fluid getFlowing() {
        return ModFluids.GLOW_FLOWING_CYAN;
    }

    @Override
    public Item getBucketItem() {
        return ModItems.GLOW_CYAN_BUCKET;
    }

    @Override
    protected BlockState toBlockState(FluidState fluidState) {
        // method_15741 converts the LEVEL_1_8 of the fluid state to the LEVEL_15 the fluid block uses
        return ModBlocks.GLOW_CYAN.getDefaultState().with(Properties.LEVEL_15, method_15741(fluidState));
    }

    public static class Flowing extends GlowCyanWater {
        @Override
        protected void appendProperties(StateManager.Builder<Fluid, FluidState> builder) {
            super.appendProperties(builder);
            builder.add(LEVEL);
        }

        @Environment(EnvType.CLIENT)
        public void randomDisplayTick(World world, BlockPos pos, FluidState state, Random random) {
            BlockPos blockPos = pos.up();
            if (world.getBlockState(blockPos).isAir() && !world.getBlockState(blockPos).isOpaqueFullCube(world, blockPos)) {
                if (random.nextInt(25) == 0) {
                    double d = (double) pos.getX() + random.nextDouble();
                    double e = (double) pos.getY() + 1.0D;
                    double f = (double) pos.getZ() + random.nextDouble();
                    world.addParticle(ModParticles.CYAN_SUS, d, e, f, 0.0D, 0.0D, 0.0D);
                    //world.playSound(d, e, f, SoundEvents.BLOCK_LAVA_POP, SoundCategory.BLOCKS, 0.2F + random.nextFloat() * 0.2F, 0.9F + random.nextFloat() * 0.15F, false);
                }
            }
        }


        @Override
        public int getLevel(FluidState fluidState) {
            return fluidState.get(LEVEL);
        }

        @Override
        public boolean isStill(FluidState fluidState) {
            return false;
        }
    }

    public static class Still extends GlowCyanWater {
        @Override
        public int getLevel(FluidState fluidState) {
            return 8;
        }

        @Override
        public boolean isStill(FluidState fluidState) {
            return true;
        }
    }
}
