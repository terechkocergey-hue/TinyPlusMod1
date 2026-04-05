package com.tinyplus.network;

import net.fabricmc.fabric.api.client.networking.v1.ClientPlayNetworking;
import net.fabricmc.fabric.api.networking.v1.PayloadTypeRegistry;
import net.fabricmc.fabric.api.networking.v1.ServerPlayNetworking;
import net.minecraft.server.network.ServerPlayerEntity;

public class ModMessages {
    public static void register() {
        PayloadTypeRegistry.playS2C().register(SizeSyncPayload.ID, SizeSyncPayload.CODEC);
        PayloadTypeRegistry.playS2C().register(MountSyncPayload.ID, MountSyncPayload.CODEC);
    }
    
    public static void sendSizeSync(ServerPlayerEntity player, float size) {
        ServerPlayNetworking.send(player, new SizeSyncPayload(player.getId(), size));
    }
}
