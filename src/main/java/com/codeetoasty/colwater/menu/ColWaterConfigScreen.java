package com.codeetoasty.colwater.menu;

import com.codeetoasty.colwater.registry.ModBlocks;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.gui.screen.ScreenTexts;
import net.minecraft.client.gui.widget.ButtonWidget;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.text.Text;
import net.minecraft.text.TranslatableText;

public class ColWaterConfigScreen extends Screen {
    private Screen parent;

    public ColWaterConfigScreen(Screen parent) {
        super(new TranslatableText("test"));
        this.parent = parent;
    }

    @Override
    protected void init() {
        addButton(new ButtonWidget(width / 2 - 75, (int) (height * 0.5F) - 10, 150, 20,
                ScreenTexts.composeToggleText(Text.of("coloredlight: "), ModBlocks.colorlight),
                (button) -> {
                    boolean value = !ModBlocks.colorlight;
                    button.setMessage(ScreenTexts.composeToggleText(Text.of("coloredlight: "), value));
                    ModBlocks.colorlight = value;
                    System.out.println(ModBlocks.colorlight);
                }
        ));

        addButton(new ButtonWidget(width / 2 - 100, (int) (height * 0.88F) - 10, 200, 20,
                ScreenTexts.DONE, (button) -> onClose()));
    }

    @Override
    public void onClose() {
        MinecraftClient.getInstance().reloadResourcesConcurrently();
        client.openScreen(parent);
    }


    @Override
    public void render(MatrixStack matrices, int mouseX, int mouseY, float delta) {
        renderBackground(matrices);
        drawCenteredText(matrices, textRenderer, title, width / 2, 15, 0xFFFFFF);
        super.render(matrices, mouseX, mouseY, delta);
    }
}
