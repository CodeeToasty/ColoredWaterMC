package com.codeetoasty.colwater.menu;

import com.codeetoasty.colwater.ColoredWater;
import com.codeetoasty.colwater.registry.ModBlocks;
import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.Element;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.gui.screen.ScreenTexts;
import net.minecraft.client.gui.widget.ButtonWidget;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.text.Text;
import net.minecraft.text.TranslatableText;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;

public class ColWaterConfigScreen extends Screen {
    private Screen parent;
    private String warning = "For the changes to apply you need to restart your client";

    public ColWaterConfigScreen(Screen parent) {
        super(new TranslatableText("Colored Light Config"));
        this.parent = parent;
    }

    @Override
    protected void init() {
        addButton(new ButtonWidget(width / 2 - 75, (int) (height * 0.5F) - 10, 150, 20,
                ScreenTexts.composeToggleText(Text.of("colorlight: "), ColoredWater.colorlight),
                (button) -> {
                    boolean value = !ColoredWater.colorlight;
                    button.setMessage(ScreenTexts.composeToggleText(Text.of("colorlight: "), value));
                    ColoredWater.colorlight = value;
                    System.out.println(ColoredWater.colorlight);
                }
        ));

        addButton(new ButtonWidget(width / 2 - 100, (int) (height * 0.88F) - 10, 200, 20,
                ScreenTexts.DONE, (button) -> onClose()));
    }

    @Override
    public void onClose() {
        Path configPath = FabricLoader.getInstance().getConfigDir();
        File configFile = new File(configPath.toFile(), "colorlight.txt");
        try (FileWriter writer = new FileWriter(configFile,false)) {
            writer.write(String.valueOf(ColoredWater.colorlight));
        } catch (IOException e) {
            
        }
        client.openScreen(parent);
    }


    @Override
    public void render(MatrixStack matrices, int mouseX, int mouseY, float delta) {
        renderBackground(matrices);
        drawCenteredText(matrices, textRenderer, title, width / 2, 15, 0xFFFFFF);
        drawCenteredText(matrices, textRenderer, Text.of(warning), width/2, 65, 0xb02e26);
        super.render(matrices, mouseX, mouseY, delta);
    }
}
