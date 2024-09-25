package io.github.aleksandarharalanov.ferns.command;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

import static io.github.aleksandarharalanov.ferns.Ferns.getInstance;
import static io.github.aleksandarharalanov.ferns.util.AboutUtil.about;

public class FernsCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (command.getName().equalsIgnoreCase("ferns")) {
            about(sender, getInstance());
        }

        return true;
    }
}
