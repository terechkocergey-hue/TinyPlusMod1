package com.tinyplus.commands;

import com.mojang.brigadier.CommandDispatcher;
import net.minecraft.server.command.ServerCommandSource;
import net.minecraft.server.command.CommandManager;
import net.minecraft.text.Text;

public class TinyPlusCommands {
    public static void register(CommandDispatcher<ServerCommandSource> dispatcher) {
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
        
        dispatcher.register(CommandManager.literal("visible")
            .executes(context -> {
                context.getSource().sendMessage(Text.literal("§a✅ Теперь ты видим!"));
                return 1;
            })
        );
    }
}