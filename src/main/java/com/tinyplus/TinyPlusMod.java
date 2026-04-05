package com.tinyplus;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.command.v2.CommandRegistrationCallback;
import net.minecraft.server.command.CommandManager;
import net.minecraft.text.Text;

public class TinyPlusMod implements ModInitializer {
    @Override
    public void onInitialize() {
        System.out.println("TinyPlus Mod загружен!");
        
        CommandRegistrationCallback.EVENT.register((dispatcher, registryAccess, environment) -> {
            dispatcher.register(CommandManager.literal("smoll")
                .executes(context -> {
                    context.getSource().sendMessage(Text.literal("§a✨ Ты уменьшился! ✨"));
                    return 1;
                })
            );
            
            dispatcher.register(CommandManager.literal("unsmoll")
                .executes(context -> {
                    context.getSource().sendMessage(Text.literal("§c📏 Ты вернул нормальный размер!"));
                    return 1;
                })
            );
            
            dispatcher.register(CommandManager.literal("sit")
                .executes(context -> {
                    context.getSource().sendMessage(Text.literal("§e💺 Ты сел!"));
                    return 1;
                })
            );
            
            dispatcher.register(CommandManager.literal("lie")
                .executes(context -> {
                    context.getSource().sendMessage(Text.literal("§7🛌 Ты лёг!"));
                    return 1;
                })
            );
        });
    }
}
