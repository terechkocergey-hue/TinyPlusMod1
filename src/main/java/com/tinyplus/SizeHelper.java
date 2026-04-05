package com.tinyplus.util;

import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.player.PlayerEntity;

public class SizeHelper {
    public static final float NORMAL_SIZE = 1.0f;
    public static final float SMALL_SIZE = 0.35f;
    
    public static void setPlayerSize(PlayerEntity player, float size) {
        player.getAttributeInstance(EntityAttributes.SCALE).setBaseValue(size);
    }
}