package net.zffu.discovery.gui;

import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

/**
 * The main class of GUIS in Discovery.
 * @since 0.0.1
 * @see {@link net.zffu.discovery.items.DiscoveryItemHolder}
 */
public abstract class DiscoveryGUI {

    /**
     * Gets the items of the GUI.
     * @return
     */
    public abstract ItemStack[] getItems(Player player);

    /**
     * Gets the display name of the GUI.
     * @param player
     * @return
     */
    public abstract String getDisplay(Player player);


}
