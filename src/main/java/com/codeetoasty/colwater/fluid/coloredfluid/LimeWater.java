package com.codeetoasty.colwater.fluid.coloredfluid;

import com.codeetoasty.colwater.fluid.DyableWater;
import com.codeetoasty.colwater.registry.ModBlocks;
import com.codeetoasty.colwater.registry.ModFluids;
import com.codeetoasty.colwater.registry.ModItems;
import net.minecraft.block.BlockState;
import net.minecraft.fluid.Fluid;
import net.minecraft.fluid.FluidState;
import net.minecraft.item.Item;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.Properties;
import net.minecraft.world.World;

public abstract class LimeWater extends DyableWater {
    @Override
    public Fluid getStill() {
        return ModFluids.STILL_LIME;
    }

    @Override
    public Fluid getFlowing() {
        return ModFluids.FLOWING_LIME;
    }

    @Override
    public Item getBucketItem() {
        return ModItems.LIME_BUCKET;
    }

    @Override
    protected BlockState toBlockState(FluidState fluidState) {
        // getBlockStateLevel converts the LEVEL_1_8 of the fluid state to the LEVEL_15 the fluid block uses
        return ModBlocks.LIME.getDefaultState().with(Properties.LEVEL_15, getBlockStateLevel(fluidState));
    }

    public static class Flowing extends LimeWater {
        @Override
        protected void appendProperties(StateManager.Builder<Fluid, FluidState> builder) {
            super.appendProperties(builder);
            builder.add(LEVEL);
        }

        @Override
        protected boolean isInfinite(World world) {
            return false;
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

    public static class Still extends LimeWater {
        @Override
        protected boolean isInfinite(World world) {
            return false;
        }

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
