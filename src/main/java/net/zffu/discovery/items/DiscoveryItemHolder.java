package net.zffu.discovery.items;

import org.bukkit.inventory.ItemStack;

/**
 * Holds the items of a Gui to allow for static usage.
 * @since 0.0.1
 */
public class DiscoveryItemHolder {

    /**
     * The items stored into the holder.
     */
    private ItemStack[] items;

    /**
     * Creates a basic {@link DiscoveryItemHolder}.
     * @param slots
     */
    public DiscoveryItemHolder(int slots) {
        this.items = new ItemStack[slots];
    }

    /**
     * Gets the items contained in the holder.
     * @return
     */
    public ItemStack[] getItems() {
        return this.items;
    }

}
