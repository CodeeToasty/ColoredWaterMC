package com.codeetoasty.colwater.mixin;

import com.codeetoasty.colwater.ColoredWater;
import net.minecraft.block.BlockState;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.hud.InGameOverlayRenderer;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.Identifier;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyArg;

@Mixin(InGameOverlayRenderer.class)
public class UnderwaterRenderMixin {
    @ModifyArg(at = @At(value = "INVOKE", target = "Lnet/minecraft/client/texture/TextureManager;bindTexture(Lnet/minecraft/util/Identifier;)V"),
            method = "renderUnderwaterOverlay")

    private static Identifier changeUnderwaterOverlay(Identifier texture) {
        //this way i get the fluid i'm submerged
        MinecraftClient minecraftClient = MinecraftClient.getInstance();
        PlayerEntity playerEntity = minecraftClient.player;
        BlockState state = playerEntity.getBlockStateAtPos();


        //change underwater overlay
        switch (state.getBlock().toString()){
            case "Block{colwater:black}": texture = new Identifier(ColoredWater.MOD_ID,"textures/misc/black_underwater.png"); break;
            case "Block{colwater:brown}":  texture = new Identifier(ColoredWater.MOD_ID,"textures/misc/brown_underwater.png"); break;
            case "Block{colwater:cyan}":  texture = new Identifier(ColoredWater.MOD_ID,"textures/misc/cyan_underwater.png"); break;
            case "Block{colwater:gray}":  texture = new Identifier(ColoredWater.MOD_ID,"textures/misc/gray_underwater.png"); break;
            case "Block{colwater:green}":  texture = new Identifier(ColoredWater.MOD_ID,"textures/misc/green_underwater.png"); break;
            case "Block{colwater:light_blue}":  texture = new Identifier(ColoredWater.MOD_ID,"textures/misc/light_blue_underwater.png"); break;
            case "Block{colwater:lime}":  texture = new Identifier(ColoredWater.MOD_ID,"textures/misc/lime_underwater.png"); break;
            case "Block{colwater:magenta}":  texture = new Identifier(ColoredWater.MOD_ID,"textures/misc/magenta_underwater.png"); break;
            case "Block{colwater:orange}":  texture = new Identifier(ColoredWater.MOD_ID,"textures/misc/orange_underwater.png"); break;
            case "Block{colwater:pink}":  texture = new Identifier(ColoredWater.MOD_ID,"textures/misc/pink_underwater.png"); break;
            case "Block{colwater:purple}":  texture = new Identifier(ColoredWater.MOD_ID,"textures/misc/purple_underwater.png"); break;
            case "Block{colwater:red}":  texture = new Identifier(ColoredWater.MOD_ID,"textures/misc/red_underwater.png"); break;
            case "Block{colwater:white}":  texture = new Identifier(ColoredWater.MOD_ID,"textures/misc/white_underwater.png"); break;
            case "Block{colwater:yellow}":  texture = new Identifier(ColoredWater.MOD_ID,"textures/misc/yellow_underwater.png"); break;

            case "Block{colwater:glow_black}": texture = new Identifier(ColoredWater.MOD_ID,"textures/misc/black_underwater.png"); break;
            case "Block{colwater:glow_brown}":  texture = new Identifier(ColoredWater.MOD_ID,"textures/misc/brown_underwater.png"); break;
            case "Block{colwater:glow_cyan}":  texture = new Identifier(ColoredWater.MOD_ID,"textures/misc/cyan_underwater.png"); break;
            case "Block{colwater:glow_gray}":  texture = new Identifier(ColoredWater.MOD_ID,"textures/misc/gray_underwater.png"); break;
            case "Block{colwater:glow_green}":  texture = new Identifier(ColoredWater.MOD_ID,"textures/misc/green_underwater.png"); break;
            case "Block{colwater:glow_light_blue}":  texture = new Identifier(ColoredWater.MOD_ID,"textures/misc/light_blue_underwater.png"); break;
            case "Block{colwater:glow_lime}":  texture = new Identifier(ColoredWater.MOD_ID,"textures/misc/lime_underwater.png"); break;
            case "Block{colwater:glow_magenta}":  texture = new Identifier(ColoredWater.MOD_ID,"textures/misc/magenta_underwater.png"); break;
            case "Block{colwater:glow_orange}":  texture = new Identifier(ColoredWater.MOD_ID,"textures/misc/orange_underwater.png"); break;
            case "Block{colwater:glow_pink}":  texture = new Identifier(ColoredWater.MOD_ID,"textures/misc/pink_underwater.png"); break;
            case "Block{colwater:glow_purple}":  texture = new Identifier(ColoredWater.MOD_ID,"textures/misc/purple_underwater.png"); break;
            case "Block{colwater:glow_red}":  texture = new Identifier(ColoredWater.MOD_ID,"textures/misc/red_underwater.png"); break;
            case "Block{colwater:glow_white}":  texture = new Identifier(ColoredWater.MOD_ID,"textures/misc/white_underwater.png"); break;
            case "Block{colwater:glow_yellow}":  texture = new Identifier(ColoredWater.MOD_ID,"textures/misc/yellow_underwater.png"); break;
        }
        return texture;
    }
}


