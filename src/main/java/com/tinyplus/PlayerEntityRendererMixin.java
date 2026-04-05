package com.tinyplus.mixin;

import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.LivingEntityRenderer;
import net.minecraft.client.render.entity.PlayerEntityRenderer;
import net.minecraft.client.render.entity.model.PlayerEntityModel;
import net.minecraft.entity.player.PlayerEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(PlayerEntityRenderer.class)
public abstract class PlayerEntityRendererMixin extends LivingEntityRenderer<PlayerEntity, PlayerEntityModel<PlayerEntity>> {
    
    public PlayerEntityRendererMixin(EntityRendererFactory.Context ctx, PlayerEntityModel<PlayerEntity> model, float shadowRadius) {
        super(ctx, model, shadowRadius);
    }
    
    @Inject(method = "scale", at = @At("HEAD"), cancellable = true)
    private void scale(PlayerEntity player, float tickDelta, CallbackInfo ci) {
        // Здесь будет логика изменения размера
    }
}