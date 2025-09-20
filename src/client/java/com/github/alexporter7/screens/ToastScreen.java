package com.github.alexporter7.screens;

import io.wispforest.owo.ui.base.BaseOwoScreen;
import io.wispforest.owo.ui.component.Components;
import io.wispforest.owo.ui.container.Containers;
import io.wispforest.owo.ui.container.FlowLayout;
import io.wispforest.owo.ui.core.HorizontalAlignment;
import io.wispforest.owo.ui.core.OwoUIAdapter;
import io.wispforest.owo.ui.core.Sizing;
import io.wispforest.owo.ui.core.VerticalAlignment;
import net.minecraft.text.Text;
import org.jetbrains.annotations.NotNull;

public class ToastScreen extends BaseOwoScreen<FlowLayout> {
    @Override
    protected @NotNull OwoUIAdapter<FlowLayout> createAdapter() {
        return OwoUIAdapter.create(this, Containers::verticalFlow);
    }

    @Override
    protected void build(FlowLayout root) {
        root
                .horizontalAlignment(HorizontalAlignment.RIGHT)
                .verticalAlignment(VerticalAlignment.TOP)
                .sizing(Sizing.fill(10), Sizing.content(10));
        root
                .child(
                        Components.label(Text.literal("Test title"))
                                .horizontalTextAlignment(HorizontalAlignment.LEFT)
                                .lineHeight(12))
                .child(
                        Components.label(Text.literal("test description and we're going to see if it wraps"))
                                .horizontalTextAlignment(HorizontalAlignment.LEFT)
                                .lineHeight(8));
    }

    @Override
    public boolean shouldPause() {
        return false;
    }



}
