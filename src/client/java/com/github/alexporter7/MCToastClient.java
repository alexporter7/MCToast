package com.github.alexporter7;

import com.github.alexporter7.screens.BaseToast;
import com.github.alexporter7.screens.ToastScreen;
import com.nimbusds.oauth2.sdk.id.Identifier;
import io.wispforest.owo.Owo;
import io.wispforest.owo.client.OwoClient;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents;
import net.fabricmc.fabric.api.client.keybinding.v1.KeyBindingHelper;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.option.KeyBinding;
import net.minecraft.client.util.InputUtil;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.screen.NamedScreenHandlerFactory;
import net.minecraft.screen.ScreenHandlerType;
import org.lwjgl.glfw.GLFW;

public class MCToastClient implements ClientModInitializer {

    private static KeyBinding keyBinding;

    @Override
    public void onInitializeClient() {

        // This entrypoint is suitable for setting up client-specific logic, such as rendering.
        keyBinding = KeyBindingHelper.registerKeyBinding(
                new KeyBinding(
                        "key.mctoast.screen",
                        InputUtil.Type.KEYSYM,
                        GLFW.GLFW_KEY_Y,
                        "category.mctoast.test")
        );

        ClientTickEvents.END_CLIENT_TICK.register(
                client -> {
                    while(keyBinding.wasPressed())
                        client.getToastManager().add(new BaseToast());

                        //client.setScreenAndRender(new ToastScreen());
                        //client.setScreen(new ToastScreen());
                }
        );
    }
}