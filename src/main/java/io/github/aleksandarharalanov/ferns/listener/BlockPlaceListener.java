package io.github.aleksandarharalanov.ferns.listener;

import org.bukkit.event.block.BlockListener;
import org.bukkit.event.block.BlockPlaceEvent;
import org.bukkit.Material;

public class BlockPlaceListener extends BlockListener {

    public void onBlockPlace(BlockPlaceEvent event) {
        if (event.getBlockPlaced().getType() == Material.LONG_GRASS) {
            event.getBlock().setData((byte) 2);
        }
    }
}
