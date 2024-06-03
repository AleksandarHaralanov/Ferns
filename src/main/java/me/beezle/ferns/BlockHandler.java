package me.beezle.ferns;

import org.bukkit.event.Listener;
import org.bukkit.event.EventHandler;
import org.bukkit.event.block.BlockPlaceEvent;
import org.bukkit.Material;

public class BlockHandler implements Listener {

    @EventHandler
    public void onLongGrassPlace(final BlockPlaceEvent event) {
        if (event.getBlockPlaced().getType() == Material.LONG_GRASS) {
            byte value = 2;
            event.getBlock().setData(value);
        }
    }
}
