package io.github.aleksandarharalanov.ferns;

import io.github.aleksandarharalanov.ferns.command.FernsCommand;
import io.github.aleksandarharalanov.ferns.listener.BlockPlaceListener;
import org.bukkit.event.Event.Priority;
import org.bukkit.event.Event.Type;
import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

import static io.github.aleksandarharalanov.ferns.util.LoggerUtil.logInfo;
import static io.github.aleksandarharalanov.ferns.util.UpdateUtil.checkForUpdates;

public class Ferns extends JavaPlugin {

    private static Ferns plugin;
    private static PluginDescriptionFile pdf;

    @Override
    public void onEnable() {
        pdf = getDescription();
        plugin = this;

        checkForUpdates(this, "https://api.github.com/repos/AleksandarHaralanov/Ferns/releases/latest");

        final FernsCommand fernsCommand = new FernsCommand();
        getCommand("ferns").setExecutor(fernsCommand);

        PluginManager pluginManager = getServer().getPluginManager();
        final BlockPlaceListener blockPlaceListener = new BlockPlaceListener();
        pluginManager.registerEvent(Type.BLOCK_PLACE, blockPlaceListener, Priority.Normal, this);

        logInfo(String.format("[%s] v%s Enabled.", pdf.getName(), pdf.getVersion()));
    }

    @Override
    public void onDisable() {
        logInfo(String.format("[%s] v%s Disabled.", pdf.getName(), pdf.getName()));
    }

    public static Ferns getInstance() {
        return plugin;
    }
}