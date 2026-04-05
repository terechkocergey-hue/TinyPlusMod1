package com.tinyplus.network;

import net.minecraft.network.RegistryByteBuf;
import net.minecraft.network.codec.PacketCodec;
import net.minecraft.network.codec.PacketCodecs;
import net.minecraft.network.packet.CustomPayload;
import net.minecraft.util.Identifier;

public record SizeSyncPayload(int entityId, float size) implements CustomPayload {
    public static final CustomPayload.Id<SizeSyncPayload> ID = new CustomPayload.Id<>(ModMessages.SIZE_SYNC_ID);
    public static final PacketCodec<RegistryByteBuf, SizeSyncPayload> CODEC = PacketCodec.tuple(
        PacketCodecs.INTEGER, SizeSyncPayload::entityId,
        PacketCodecs.FLOAT, SizeSyncPayload::size,
        SizeSyncPayload::new
    );
    
    @Override
    public Id<? extends CustomPayload> getId() {
        return ID;
    }
}