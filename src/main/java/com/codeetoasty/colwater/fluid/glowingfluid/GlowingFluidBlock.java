package com.codeetoasty.colwater.fluid.glowingfluid;

import net.fabricmc.loader.api.FabricLoader;
import net.hypherionmc.hypcore.api.ColoredLightManager;
import net.hypherionmc.hypcore.api.Light;
import net.minecraft.block.BlockState;
import net.minecraft.block.FluidBlock;
import net.minecraft.fluid.FlowableFluid;
import net.minecraft.util.math.BlockPos;

public class GlowingFluidBlock extends FluidBlock {
    private final float red;
    private final float green;
    private final float blue;
    public GlowingFluidBlock(FlowableFluid fluid, Settings settings,float red, float green, float blue) {
        super(fluid, settings);
        this.red = red;
        this.green = green;
        this.blue = blue;
        if (FabricLoader.getInstance().isModLoaded("hypcore")) {
            ColoredLightManager.registerProvider(this, this::setLight);
        }
    }

    public Light setLight(BlockPos pos, BlockState state) {
        return Light.builder().pos(pos).color(this.red, this.green, this.blue, 1.0f).radius(14).build();
    }
}
