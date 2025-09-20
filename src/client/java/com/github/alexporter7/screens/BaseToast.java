package com.github.alexporter7.screens;

import com.github.alexporter7.MCToast;
import io.wispforest.owo.ui.base.BaseOwoToast;
import io.wispforest.owo.ui.component.Components;
import io.wispforest.owo.ui.container.Containers;
import io.wispforest.owo.ui.container.FlowLayout;
import io.wispforest.owo.ui.container.StackLayout;
import io.wispforest.owo.ui.core.HorizontalAlignment;
import io.wispforest.owo.ui.core.Sizing;
import io.wispforest.owo.ui.core.VerticalAlignment;
import net.minecraft.client.toast.ToastManager;
import net.minecraft.text.Text;

import java.time.Duration;
import java.util.function.Supplier;

@SuppressWarnings("UnstableApiUsage")
public class BaseToast extends BaseOwoToast<FlowLayout> {

    public BaseToast() {
        super(
                () -> Containers
                        .verticalFlow(Sizing.fixed(100), Sizing.fixed(100))
                        .configure(c -> c
                                .child(Components.label(
                                        Text.literal("Test Title"))
                                        )
                                .child(Components.label(
                                        Text.literal("Test description for toast"))
                                        )),
                (baseOwoToast, time) -> time <= 5000 ? Visibility.SHOW : Visibility.HIDE);
        MCToast.LOGGER.info("Toast parent method has been called | [" + this.getVisibility() + " | " + this.getHeight() + "," + this.getWidth() + "]");
    }

    @Override
    public void update(ToastManager manager, long time) {
        MCToast.LOGGER.info("[Before: {} | {},{}]", this.getVisibility(), this.getHeight(), this.getWidth());
        super.update(manager, time);
        MCToast.LOGGER.info("[After: {} | {},{}]", this.getVisibility(), this.getHeight(), this.getWidth());
    }
}
