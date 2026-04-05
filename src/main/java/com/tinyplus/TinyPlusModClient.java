package com.tinyplus;

import net.fabricmc.api.ClientModInitializer;

public class TinyPlusModClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        System.out.println("TinyPlus Mod клиент инициализирован!");
    }
}