package com.tinyplus.network;

import net.minecraft.network.RegistryByteBuf;
import net.minecraft.network.codec.PacketCodec;
import net.minecraft.network.codec.PacketCodecs;
import net.minecraft.network.packet.CustomPayload;
import net.minecraft.util.Identifier;

public record MountSyncPayload(int entityId, int mountId) implements CustomPayload {
    public static final CustomPayload.Id<MountSyncPayload> ID = new CustomPayload.Id<>(Identifier.of("tinyplus", "mount_sync"));
    public static final PacketCodec<RegistryByteBuf, MountSyncPayload> CODEC = PacketCodec.tuple(
        PacketCodecs.INTEGER, MountSyncPayload::entityId,
        PacketCodecs.INTEGER, MountSyncPayload::mountId,
        MountSyncPayload::new
    );
    
    @Override
    public Id<? extends CustomPayload> getId() {
        return ID;
    }
}