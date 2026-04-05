package com.tinyplus;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.command.v2.CommandRegistrationCallback;
import net.minecraft.server.command.CommandManager;
import net.minecraft.text.Text;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TinyPlusMod implements ModInitializer {
    public static final String MOD_ID = "tinyplus";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize() {
        LOGGER.info("TinyPlus Mod инициализирован!");

        // Регистрация команды /smoll
        CommandRegistrationCallback.EVENT.register((dispatcher, registryAccess, environment) -> {
            dispatcher.register(CommandManager.literal("smoll")
                .then(CommandManager.argument("player", net.minecraft.command.argument.EntityArgumentType.player())
                    .executes(context -> {
                        var player = net.minecraft.command.argument.EntityArgumentType.getPlayer(context, "player");
                        player.sendMessage(Text.literal("§a✨ Ты уменьшился! ✨"), false);
                        context.getSource().sendMessage(Text.literal("§aТы уменьшил " + player.getName().getString()));
                        return 1;
                    })
                )
            );
        });
    }
}