package com.codeetoasty.colwater.fluid.glowingfluid;

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

public abstract class GlowLightBlueWater extends DyableWater {
    @Override
    public Fluid getStill() {
        return ModFluids.GLOW_STILL_LIGHT_BLUE;
    }

    @Override
    public Fluid getFlowing() {
        return ModFluids.GLOW_FLOWING_LIGHT_BLUE;
    }

    @Override
    public Item getBucketItem() {
        return ModItems.GLOW_LIGHT_BLUE_BUCKET;
    }

    @Override
    protected BlockState toBlockState(FluidState fluidState) {
        // method_15741 converts the LEVEL_1_8 of the fluid state to the LEVEL_15 the fluid block uses
        return ModBlocks.GLOW_LIGHT_BLUE.getDefaultState().with(Properties.LEVEL_15, method_15741(fluidState));
    }

    public static class Flowing extends GlowLightBlueWater {
        @Override
        protected void appendProperties(StateManager.Builder<Fluid, FluidState> builder) {
            super.appendProperties(builder);
            builder.add(LEVEL);
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

    public static class Still extends GlowLightBlueWater {
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
