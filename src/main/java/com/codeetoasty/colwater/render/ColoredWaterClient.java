package com.codeetoasty.colwater.render;

import com.codeetoasty.colwater.registry.ModFluids;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.client.render.fluid.v1.FluidRenderHandler;
import net.fabricmc.fabric.api.client.render.fluid.v1.FluidRenderHandlerRegistry;
import net.fabricmc.fabric.api.event.client.ClientSpriteRegistryCallback;
import net.fabricmc.fabric.api.resource.ResourceManagerHelper;
import net.fabricmc.fabric.api.resource.SimpleSynchronousResourceReloadListener;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.texture.Sprite;
import net.minecraft.client.texture.SpriteAtlasTexture;
import net.minecraft.fluid.Fluid;
import net.minecraft.fluid.FluidState;
import net.minecraft.resource.ResourceManager;
import net.minecraft.resource.ResourceType;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.BlockRenderView;

import java.util.function.Function;


public class ColoredWaterClient implements ClientModInitializer {

    @Override
    public void onInitializeClient() {
        //Colored Water
        {
            setupFluidRendering(ModFluids.STILL_PINK, ModFluids.FLOWING_PINK, new Identifier("minecraft", "water"), 0xf38baa);
            BlockRenderLayerMap.INSTANCE.putFluids(RenderLayer.getTranslucent(), ModFluids.STILL_PINK, ModFluids.FLOWING_PINK);

            setupFluidRendering(ModFluids.STILL_GREEN, ModFluids.FLOWING_GREEN, new Identifier("minecraft", "water"), 0x5e7c16);
            BlockRenderLayerMap.INSTANCE.putFluids(RenderLayer.getTranslucent(), ModFluids.STILL_GREEN, ModFluids.FLOWING_GREEN);

            setupFluidRendering(ModFluids.STILL_YELLOW, ModFluids.FLOWING_YELLOW, new Identifier("minecraft", "water"), 0xfed83d);
            BlockRenderLayerMap.INSTANCE.putFluids(RenderLayer.getTranslucent(), ModFluids.STILL_YELLOW, ModFluids.FLOWING_YELLOW);

            setupFluidRendering(ModFluids.STILL_PURPLE, ModFluids.FLOWING_PURPLE, new Identifier("minecraft", "water"), 0x8932b8);
            BlockRenderLayerMap.INSTANCE.putFluids(RenderLayer.getTranslucent(), ModFluids.STILL_PURPLE, ModFluids.FLOWING_PURPLE);

            setupFluidRendering(ModFluids.STILL_RED, ModFluids.FLOWING_RED, new Identifier("minecraft", "water"), 0xb02e26);
            BlockRenderLayerMap.INSTANCE.putFluids(RenderLayer.getTranslucent(), ModFluids.STILL_RED, ModFluids.FLOWING_RED);

            setupFluidRendering(ModFluids.STILL_ORANGE, ModFluids.FLOWING_ORANGE, new Identifier("minecraft", "water"), 0xf9801d);
            BlockRenderLayerMap.INSTANCE.putFluids(RenderLayer.getTranslucent(), ModFluids.STILL_ORANGE, ModFluids.FLOWING_ORANGE);

            setupFluidRendering(ModFluids.STILL_BLACK, ModFluids.FLOWING_BLACK, new Identifier("minecraft", "water"), 0x1d1d21);
            BlockRenderLayerMap.INSTANCE.putFluids(RenderLayer.getTranslucent(), ModFluids.STILL_BLACK, ModFluids.FLOWING_BLACK);

            setupFluidRendering(ModFluids.STILL_WHITE, ModFluids.FLOWING_WHITE, new Identifier("minecraft", "water"), 0xf9fffe);
            BlockRenderLayerMap.INSTANCE.putFluids(RenderLayer.getTranslucent(), ModFluids.STILL_WHITE, ModFluids.FLOWING_WHITE);

            setupFluidRendering(ModFluids.STILL_BROWN, ModFluids.FLOWING_BROWN, new Identifier("minecraft", "water"), 0x835432);
            BlockRenderLayerMap.INSTANCE.putFluids(RenderLayer.getTranslucent(), ModFluids.STILL_BROWN, ModFluids.FLOWING_BROWN);

            setupFluidRendering(ModFluids.STILL_MAGENTA, ModFluids.FLOWING_MAGENTA, new Identifier("minecraft", "water"), 0xc74ebd);
            BlockRenderLayerMap.INSTANCE.putFluids(RenderLayer.getTranslucent(), ModFluids.STILL_MAGENTA, ModFluids.FLOWING_MAGENTA);

            setupFluidRendering(ModFluids.STILL_CYAN, ModFluids.FLOWING_CYAN, new Identifier("minecraft", "water"), 0x169c9c);
            BlockRenderLayerMap.INSTANCE.putFluids(RenderLayer.getTranslucent(), ModFluids.STILL_CYAN, ModFluids.FLOWING_CYAN);

            setupFluidRendering(ModFluids.STILL_GRAY, ModFluids.FLOWING_GRAY, new Identifier("minecraft", "water"), 0x474f52);
            BlockRenderLayerMap.INSTANCE.putFluids(RenderLayer.getTranslucent(), ModFluids.STILL_GRAY, ModFluids.FLOWING_GRAY);

            setupFluidRendering(ModFluids.STILL_LIGHT_BLUE, ModFluids.FLOWING_LIGHT_BLUE, new Identifier("minecraft", "water"), 0x3ab3da);
            BlockRenderLayerMap.INSTANCE.putFluids(RenderLayer.getTranslucent(), ModFluids.STILL_LIGHT_BLUE, ModFluids.FLOWING_LIGHT_BLUE);

            setupFluidRendering(ModFluids.STILL_LIME, ModFluids.FLOWING_LIME, new Identifier("minecraft", "water"), 0x80c71f);
            BlockRenderLayerMap.INSTANCE.putFluids(RenderLayer.getTranslucent(), ModFluids.STILL_LIME, ModFluids.FLOWING_LIME);
        }
        //Glowing Colored Water
        setupFluidRendering(ModFluids.GLOW_STILL_PINK, ModFluids.GLOW_FLOWING_PINK, new Identifier("minecraft", "water"), 0xf38baa);
        BlockRenderLayerMap.INSTANCE.putFluids(RenderLayer.getTranslucent(), ModFluids.GLOW_STILL_PINK, ModFluids.GLOW_FLOWING_PINK);

        setupFluidRendering(ModFluids.GLOW_STILL_GREEN, ModFluids.GLOW_FLOWING_GREEN, new Identifier("minecraft", "water"), 0x5e7c16);
        BlockRenderLayerMap.INSTANCE.putFluids(RenderLayer.getTranslucent(), ModFluids.GLOW_STILL_GREEN, ModFluids.GLOW_FLOWING_GREEN);

        setupFluidRendering(ModFluids.GLOW_STILL_YELLOW, ModFluids.GLOW_FLOWING_YELLOW, new Identifier("minecraft", "water"), 0xfed83d);
        BlockRenderLayerMap.INSTANCE.putFluids(RenderLayer.getTranslucent(), ModFluids.GLOW_STILL_YELLOW, ModFluids.GLOW_FLOWING_YELLOW);

        setupFluidRendering(ModFluids.GLOW_STILL_PURPLE, ModFluids.GLOW_FLOWING_PURPLE, new Identifier("minecraft", "water"), 0x8932b8);
        BlockRenderLayerMap.INSTANCE.putFluids(RenderLayer.getTranslucent(), ModFluids.GLOW_STILL_PURPLE, ModFluids.GLOW_FLOWING_PURPLE);

        setupFluidRendering(ModFluids.GLOW_STILL_RED, ModFluids.GLOW_FLOWING_RED, new Identifier("minecraft", "water"), 0xb02e26);
        BlockRenderLayerMap.INSTANCE.putFluids(RenderLayer.getTranslucent(), ModFluids.GLOW_STILL_RED, ModFluids.GLOW_FLOWING_RED);

        setupFluidRendering(ModFluids.GLOW_STILL_ORANGE, ModFluids.GLOW_FLOWING_ORANGE, new Identifier("minecraft", "water"), 0xf9801d);
        BlockRenderLayerMap.INSTANCE.putFluids(RenderLayer.getTranslucent(), ModFluids.GLOW_STILL_ORANGE, ModFluids.GLOW_FLOWING_ORANGE);

        setupFluidRendering(ModFluids.GLOW_STILL_BLACK, ModFluids.GLOW_FLOWING_BLACK, new Identifier("minecraft", "water"), 0x1d1d21);
        BlockRenderLayerMap.INSTANCE.putFluids(RenderLayer.getTranslucent(), ModFluids.GLOW_STILL_BLACK, ModFluids.GLOW_FLOWING_BLACK);

        setupFluidRendering(ModFluids.GLOW_STILL_WHITE, ModFluids.GLOW_FLOWING_WHITE, new Identifier("minecraft", "water"), 0xf9fffe);
        BlockRenderLayerMap.INSTANCE.putFluids(RenderLayer.getTranslucent(), ModFluids.GLOW_STILL_WHITE, ModFluids.GLOW_FLOWING_WHITE);

        setupFluidRendering(ModFluids.GLOW_STILL_BROWN, ModFluids.GLOW_FLOWING_BROWN, new Identifier("minecraft", "water"), 0x835432);
        BlockRenderLayerMap.INSTANCE.putFluids(RenderLayer.getTranslucent(), ModFluids.GLOW_STILL_BROWN, ModFluids.GLOW_FLOWING_BROWN);

        setupFluidRendering(ModFluids.GLOW_STILL_MAGENTA, ModFluids.GLOW_FLOWING_MAGENTA, new Identifier("minecraft", "water"), 0xc74ebd);
        BlockRenderLayerMap.INSTANCE.putFluids(RenderLayer.getTranslucent(), ModFluids.GLOW_STILL_MAGENTA, ModFluids.GLOW_FLOWING_MAGENTA);

        setupFluidRendering(ModFluids.GLOW_STILL_CYAN, ModFluids.GLOW_FLOWING_CYAN, new Identifier("minecraft", "water"), 0x169c9c);
        BlockRenderLayerMap.INSTANCE.putFluids(RenderLayer.getTranslucent(), ModFluids.GLOW_STILL_CYAN, ModFluids.GLOW_FLOWING_CYAN);

        setupFluidRendering(ModFluids.GLOW_STILL_GRAY, ModFluids.GLOW_FLOWING_GRAY, new Identifier("minecraft", "water"), 0x474f52);
        BlockRenderLayerMap.INSTANCE.putFluids(RenderLayer.getTranslucent(), ModFluids.GLOW_STILL_GRAY, ModFluids.GLOW_FLOWING_GRAY);

        setupFluidRendering(ModFluids.GLOW_STILL_LIGHT_BLUE, ModFluids.GLOW_FLOWING_LIGHT_BLUE, new Identifier("minecraft", "water"), 0x3ab3da);
        BlockRenderLayerMap.INSTANCE.putFluids(RenderLayer.getTranslucent(), ModFluids.GLOW_STILL_LIGHT_BLUE, ModFluids.GLOW_FLOWING_LIGHT_BLUE);

        setupFluidRendering(ModFluids.GLOW_STILL_LIME, ModFluids.GLOW_FLOWING_LIME, new Identifier("minecraft", "water"), 0x80c71f);
        BlockRenderLayerMap.INSTANCE.putFluids(RenderLayer.getTranslucent(), ModFluids.GLOW_STILL_LIME, ModFluids.GLOW_FLOWING_LIME);

    }

    public static void setupFluidRendering(final Fluid still, final Fluid flowing, final Identifier textureFluidId, final int color) {
        final Identifier stillSpriteId = new Identifier(textureFluidId.getNamespace(), "block/" + textureFluidId.getPath() + "_still");
        final Identifier flowingSpriteId = new Identifier(textureFluidId.getNamespace(), "block/" + textureFluidId.getPath() + "_flow");

        // If they're not already present, add the sprites to the block atlas
        ClientSpriteRegistryCallback.event(SpriteAtlasTexture.BLOCK_ATLAS_TEXTURE).register((atlasTexture, registry) -> {
            registry.register(stillSpriteId);
            registry.register(flowingSpriteId);
        });

        final Identifier fluidId = Registry.FLUID.getId(still);
        final Identifier listenerId = new Identifier(fluidId.getNamespace(), fluidId.getPath() + "_reload_listener");

        final Sprite[] fluidSprites = { null, null };

        ResourceManagerHelper.get(ResourceType.CLIENT_RESOURCES).registerReloadListener(new SimpleSynchronousResourceReloadListener() {
            @Override
            public Identifier getFabricId() {
                return listenerId;
            }

            /**
             * Get the sprites from the block atlas when resources are reloaded
             */
            @Override
            public void apply(ResourceManager resourceManager) {
                final Function<Identifier, Sprite> atlas = MinecraftClient.getInstance().getSpriteAtlas(SpriteAtlasTexture.BLOCK_ATLAS_TEXTURE);
                fluidSprites[0] = atlas.apply(stillSpriteId);
                fluidSprites[1] = atlas.apply(flowingSpriteId);
            }
        });

        // The FluidRenderer gets the sprites and color from a FluidRenderHandler during rendering
        final FluidRenderHandler renderHandler = new FluidRenderHandler()
        {
            @Override
            public Sprite[] getFluidSprites(BlockRenderView view, BlockPos pos, FluidState state) {
                return fluidSprites;
            }

            @Override
            public int getFluidColor(BlockRenderView view, BlockPos pos, FluidState state) {
                return color;
            }
        };

        FluidRenderHandlerRegistry.INSTANCE.register(still, renderHandler);
        FluidRenderHandlerRegistry.INSTANCE.register(flowing, renderHandler);
    }
}
