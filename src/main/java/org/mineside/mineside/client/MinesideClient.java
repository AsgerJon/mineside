package org.mineside.mineside.client;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;


@Environment(EnvType.CLIENT)
public class MinesideClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        // Client-specific initialization logic here.
        System.out.println("Mineside client has been initialized.");
    }
}
